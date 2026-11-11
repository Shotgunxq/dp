#!/usr/bin/env python3
"""
Run ONE measurement iteration for one test suite and append every result to CSV files.

What it does
  1. Copies the suite into results/raw/<run_id>/suite/ (the exact code that was measured).
  2. Compiles it; test files that don't compile are removed one by one and recorded
     (so a single broken LLM test does not kill the whole suite).
  3. Runs the tests with JaCoCo (mvn verify), then PIT mutation testing.
  4. Parses Surefire, JaCoCo and PIT reports and appends rows to results/*.csv.
  5. Archives all raw reports and Maven logs in results/raw/<run_id>/.

Output files (all keyed by run_id, so you can join them):
  results/runs.csv        one row per iteration (metadata, environment, totals)
  results/classes.csv     one row per run x class under test
  results/methods.csv     one row per run x method (JaCoCo coverage per method)
  results/tests.csv       one row per run x test case (status, time, failure type/message)
  results/test_files.csv  one row per run x test file (compiled?, #tests, #asserts, mocks, LOC)
  results/mutants.csv     one row per run x mutant (PIT status, mutator, line, killing test)

Usage examples (run from the project root, with the JDK you want to MEASURE on):
  python3 scripts/run_iteration.py --tool reference
  python3 scripts/run_iteration.py --tool randoop --suite benchmark-core/suites/randoop \
      --iteration 1 --seed 42 --gen-time 480 --budget-s 60
  python3 scripts/run_iteration.py --tool llm --model qwen2.5-coder:14b \
      --suite benchmark-core/suites/llm-qwen --iteration 3 --prompt-version v2 \
      --tokens-in 15300 --tokens-out 9200 --gen-times-file gen_times.csv \
      --meta temperature=0.2 --meta repair_rounds=3

Only the Python 3 standard library is used. Requires `mvn` on PATH.
"""

import argparse
import csv
import datetime as dt
import hashlib
import json
import os
import platform
import re
import shutil
import signal
import threading
import subprocess
import sys
import time
import uuid
import xml.etree.ElementTree as ET
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
RESULTS = ROOT / "results"

JACOCO_COUNTERS = ["INSTRUCTION", "BRANCH", "LINE", "COMPLEXITY", "METHOD"]
PIT_STATUSES = ["KILLED", "SURVIVED", "NO_COVERAGE", "TIMED_OUT", "MEMORY_ERROR",
                "RUN_ERROR", "NON_VIABLE", "NOT_STARTED", "STARTED"]

# --------------------------------------------------------------------------- CSV schemas
RUN_FIELDS = [
    "run_id", "timestamp_utc", "tool", "model", "prompt_version", "iteration", "seed",
    "budget_s", "module", "suite_dir", "notes",
    "gen_time_s", "tokens_in", "tokens_out", "cost_usd", "extra_meta",
    "os", "os_version", "machine", "cpu_count", "ram_gb", "hostname",
    "python_version", "java_version", "maven_version",
    "test_files_total", "test_files_compiled", "test_files_removed", "compile_rounds",
    "compile_ok", "compile_s", "test_run_s", "pit_s", "total_s",
    "tests", "tests_passed", "tests_failed", "tests_errors", "tests_skipped",
    "pass_rate", "test_time_s",
    "line_covered", "line_total", "line_cov", "branch_covered", "branch_total", "branch_cov",
    "instruction_cov", "method_cov",
    "mutants", "mutants_detected", "mutants_killed", "mutants_survived",
    "mutants_no_coverage", "mutants_timed_out", "mutation_score", "test_strength",
    "pit_ran", "pit_status", "pit_threads", "status",
]

CLASS_FIELDS = (
    ["run_id", "tool", "model", "iteration", "class", "simple_name", "package", "is_support",
     "source_file", "src_loc", "src_ncloc", "gen_time_s"]
    + [f"{c.lower()}_{k}" for c in JACOCO_COUNTERS for k in ("missed", "covered", "total")]
    + ["line_cov", "branch_cov", "instruction_cov", "method_cov", "complexity_cov",
       "cyclomatic_complexity", "methods",
       "test_files", "test_files_compiled", "test_methods_static", "asserts_static",
       "mock_refs_static", "test_loc",
       "tests", "tests_passed", "tests_failed", "tests_errors", "tests_skipped", "pass_rate",
       "test_time_s",
       "mutants", "mutants_detected"]
    + [f"mut_{s.lower()}" for s in PIT_STATUSES]
    + ["mutation_score", "test_strength", "mutation_score_killed_only"]
)

METHOD_FIELDS = (
    ["run_id", "tool", "iteration", "class", "method", "descriptor", "first_line"]
    + [f"{c.lower()}_{k}" for c in JACOCO_COUNTERS for k in ("missed", "covered")]
    + ["line_cov", "branch_cov", "mutants", "mutants_detected"]
)

TEST_FIELDS = ["run_id", "tool", "iteration", "subject_class", "test_class", "test_name",
               "time_s", "status", "failure_type", "failure_message", "flaky_reruns"]

TEST_FILE_FIELDS = ["run_id", "tool", "iteration", "subject_class", "file", "framework",
                    "compiled", "compile_errors", "first_compile_error", "test_methods",
                    "asserts", "mock_refs", "expected_exception_checks", "loc", "bytes",
                    "sha256"]

MUTANT_FIELDS = ["run_id", "tool", "iteration", "class", "method", "descriptor", "line",
                 "mutator", "description", "status", "detected", "tests_run",
                 "killing_test", "indexes", "blocks"]


# --------------------------------------------------------------------------- helpers
def ratio(a, b):
    return round(a / b, 6) if b else ""


PROGRESS_RE = re.compile(r"(PIT >> INFO : (Calculated coverage|Created|Completed|Mutation)|>> Generated|"
                         r"Tests run: \d+, Failures: \d+, Errors: \d+, Skipped: \d+$|BUILD|\[ERROR\])")


def sh(cmd, cwd=ROOT, log=None, show=False, timeout_s=None):
    """Run a command, stream its output to the log (and progress lines to the screen).
    Returns (exit_code, output, seconds); exit_code is None if the timeout was hit."""
    start = time.time()
    lines = []
    logf = open(log, "a", encoding="utf-8") if log else None
    if logf:
        logf.write(f"$ {' '.join(map(str, cmd))}\n")
    proc = subprocess.Popen(cmd, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                            text=True, errors="replace", start_new_session=True)
    timed_out = threading.Event()

    def kill_on_timeout():  # watchdog: fires even if the process prints nothing
        timed_out.set()
        try:
            os.killpg(proc.pid, signal.SIGTERM)  # also stops PIT's worker JVMs
        except ProcessLookupError:
            pass
    timer = threading.Timer(timeout_s, kill_on_timeout) if timeout_s else None
    if timer:
        timer.daemon = True
        timer.start()
    try:
        for line in proc.stdout:
            lines.append(line)
            if logf:
                logf.write(line)
                logf.flush()
            if show and PROGRESS_RE.search(line):
                print(f"      [{time.time() - start:6.0f}s] {line.strip()[:150]}", flush=True)
    except KeyboardInterrupt:
        os.killpg(proc.pid, signal.SIGTERM)
        raise
    finally:
        if timer:
            timer.cancel()
    proc.wait()
    secs = round(time.time() - start, 3)
    code = None if timed_out.is_set() else proc.returncode
    if logf:
        logf.write(f"[{'TIMEOUT' if timed_out.is_set() else 'exit ' + str(code)}, {secs}s]\n\n")
        logf.close()
    return code, "".join(lines), secs


def first_line(cmd):
    try:
        out = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                             text=True, errors="replace").stdout
        lines = [l for l in out.splitlines() if l.strip() and "JAVA_TOOL_OPTIONS" not in l]
        return lines[0].strip() if lines else ""
    except OSError:
        return ""


def ram_gb():
    try:
        if sys.platform == "darwin":
            out = subprocess.run(["sysctl", "-n", "hw.memsize"], stdout=subprocess.PIPE,
                                 text=True).stdout
            return round(int(out.strip()) / 1024 ** 3, 1)
        if sys.platform.startswith("linux"):
            for line in open("/proc/meminfo"):
                if line.startswith("MemTotal"):
                    return round(int(line.split()[1]) / 1024 ** 2, 1)
    except Exception:
        pass
    return ""


def append_csv(name, fields, rows, delimiter):
    RESULTS.mkdir(parents=True, exist_ok=True)
    path = RESULTS / name
    new = not path.exists() or path.stat().st_size == 0
    if not new:  # columns added in a newer script version: rewrite the file with the new header
        with open(path, newline="", encoding="utf-8") as f:
            old_rows = list(csv.DictReader(f, delimiter=delimiter))
            old_fields = old_rows[0].keys() if old_rows else []
        if old_rows and list(old_fields) != list(fields):
            with open(path, "w", newline="", encoding="utf-8") as f:
                w = csv.DictWriter(f, fieldnames=fields, delimiter=delimiter, extrasaction="ignore")
                w.writeheader()
                w.writerows(old_rows)
    with open(path, "a", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fields, delimiter=delimiter, extrasaction="ignore")
        if new:
            w.writeheader()
        for r in rows:
            w.writerow(r)


def strip_comments(src):
    src = re.sub(r"/\*.*?\*/", "", src, flags=re.S)
    return re.sub(r"//[^\n]*", "", src)


# --------------------------------------------------------------------------- subject classes
def subject_classes(module_dir):
    """Top-level classes under src/main/java: binary name -> info."""
    result = {}
    for f in sorted((module_dir / "src/main/java").rglob("*.java")):
        text = f.read_text(encoding="utf-8", errors="replace")
        pkg = re.search(r"^\s*package\s+([\w.]+)\s*;", text, re.M)
        pkg = pkg.group(1) if pkg else ""
        name = f.stem
        fq = f"{pkg}.{name}" if pkg else name
        lines = text.splitlines()
        code = [l for l in strip_comments(text).splitlines() if l.strip()]
        result[fq] = {
            "class": fq, "simple_name": name, "package": pkg,
            "is_support": ".support" in f".{pkg}.", "source_file": str(f.relative_to(ROOT)),
            "src_loc": len(lines), "src_ncloc": len(code),
        }
    return result


def match_subject(test_simple_name, subjects):
    """Attribute a test class to the subject whose simple name is the longest prefix."""
    best = ""
    for fq, info in subjects.items():
        n = info["simple_name"]
        if test_simple_name.startswith(n) and len(n) > len(subjects.get(best, {}).get("simple_name", "")):
            best = fq
    return best


# --------------------------------------------------------------------------- test files
ASSERT_RE = re.compile(r"\b(assert\w*|verify\w*|fail)\s*\(")
TEST_RE = re.compile(r"@(?:[\w.]+\.)?(Test|ParameterizedTest|RepeatedTest|TestFactory)\b")
MOCK_RE = re.compile(r"(@Mock\b|@Spy\b|@InjectMocks\b|\bmock\s*\(|\bspy\s*\(|\bwhen\s*\(|"
                     r"mockStatic\s*\(|mockConstruction\s*\()")
EXC_RE = re.compile(r"(assertThrows\s*\(|expected\s*=|@Test\s*\(\s*expected|"
                    r"catch\s*\(|ExpectedException)")


def describe_test_file(path, suite_root, subjects):
    text = path.read_text(encoding="utf-8", errors="replace")
    code = strip_comments(text)
    if "org.junit.jupiter" in text:
        fw = "junit5"
    elif "org.junit" in text:
        fw = "junit4"
    elif "org.testng" in text:
        fw = "testng"
    else:
        fw = "unknown"
    return {
        "file": str(path.relative_to(suite_root)),
        "subject_class": match_subject(path.stem, subjects),
        "framework": fw,
        "test_methods": len(TEST_RE.findall(code)),
        "asserts": len(ASSERT_RE.findall(code)),
        "mock_refs": len(MOCK_RE.findall(code)),
        "expected_exception_checks": len(EXC_RE.findall(code)),
        "loc": len([l for l in code.splitlines() if l.strip()]),
        "bytes": path.stat().st_size,
        "sha256": hashlib.sha256(path.read_bytes()).hexdigest(),
    }


# --------------------------------------------------------------------------- maven steps
ERR_RE = re.compile(r"\[ERROR\]\s+((?:[A-Za-z]:)?[^\[\]]*?\.java):\[(\d+),(\d+)\]\s*(.*)")


def compile_suite(mvn, pom, work, log, max_rounds):
    """Compile; remove non-compiling test files until the rest compiles."""
    removed = {}  # relative path -> list of error messages
    rounds, total_secs = 0, 0.0
    while True:
        rounds += 1
        code, out, secs = sh(mvn + ["-f", str(pom), f"-Dsuite.dir={work}", "clean",
                                    "test-compile"], log=log)
        total_secs += secs
        if code == 0:
            return True, removed, rounds, total_secs
        bad = {}
        for m in ERR_RE.finditer(out):
            p = Path(m.group(1).strip())
            try:
                rel = str(p.resolve().relative_to(work.resolve()))
            except ValueError:
                continue
            bad.setdefault(rel, []).append(f"L{m.group(2)}: {m.group(4).strip()}")
        if not bad or rounds >= max_rounds:
            if not bad:
                print("!! Build failed and no test file is to blame (see maven.log).")
            return False, removed, rounds, total_secs
        for rel, errs in bad.items():
            removed[rel] = errs
            (work / rel).unlink(missing_ok=True)
        print(f"   round {rounds}: removed {len(bad)} non-compiling file(s)")


# --------------------------------------------------------------------------- report parsers
def parse_surefire(report_dir, subjects):
    rows = []
    for xml in sorted(Path(report_dir).glob("TEST-*.xml")):
        try:
            root = ET.parse(xml).getroot()
        except ET.ParseError:
            continue
        for tc in root.iter("testcase"):
            cls = tc.get("classname", "")
            status, ftype, fmsg = "passed", "", ""
            for tag, st in (("failure", "failed"), ("error", "error"), ("skipped", "skipped")):
                el = tc.find(tag)
                if el is not None:
                    status, ftype = st, el.get("type", "")
                    fmsg = (el.get("message") or "").replace("\n", " ")[:500]
                    break
            flaky = len(tc.findall("flakyFailure")) + len(tc.findall("flakyError")) \
                + len(tc.findall("rerunFailure")) + len(tc.findall("rerunError"))
            rows.append({
                "subject_class": match_subject(cls.split(".")[-1], subjects),
                "test_class": cls, "test_name": tc.get("name", ""),
                "time_s": tc.get("time", ""), "status": status, "failure_type": ftype,
                "failure_message": fmsg, "flaky_reruns": flaky,
            })
    return rows


def counters(el):
    c = {}
    for cnt in el.findall("counter"):
        t = cnt.get("type")
        c[t] = (int(cnt.get("missed", 0)), int(cnt.get("covered", 0)))
    return c


def parse_jacoco(xml_path):
    """Returns (classes: top-level fq -> counters, methods: list of dicts)."""
    classes, methods = {}, []
    if not Path(xml_path).exists():
        return classes, methods
    root = ET.parse(xml_path).getroot()
    for pkg in root.iter("package"):
        for cl in pkg.findall("class"):
            binary = cl.get("name", "").replace("/", ".")
            top = binary.split("$")[0]
            agg = classes.setdefault(top, {t: [0, 0] for t in JACOCO_COUNTERS})
            for t, (m, c) in counters(cl).items():
                if t in agg:
                    agg[t][0] += m
                    agg[t][1] += c
            for me in cl.findall("method"):
                mc = counters(me)
                row = {"class": binary, "method": me.get("name"), "descriptor": me.get("desc"),
                       "first_line": me.get("line", "")}
                for t in JACOCO_COUNTERS:
                    m, c = mc.get(t, (0, 0))
                    row[f"{t.lower()}_missed"], row[f"{t.lower()}_covered"] = m, c
                row["line_cov"] = ratio(row["line_covered"], row["line_missed"] + row["line_covered"])
                row["branch_cov"] = ratio(row["branch_covered"],
                                          row["branch_missed"] + row["branch_covered"])
                methods.append(row)
    return classes, methods


def parse_pit(xml_path):
    rows = []
    if not Path(xml_path).exists():
        return rows
    root = ET.parse(xml_path).getroot()
    for mu in root.iter("mutation"):
        def txt(tag):
            el = mu.find(tag)
            return (el.text or "").strip() if el is not None and el.text else ""

        def lst(tag):
            el = mu.find(tag)
            return "|".join((c.text or "") for c in el) if el is not None else ""
        rows.append({
            "class": txt("mutatedClass"), "method": txt("mutatedMethod"),
            "descriptor": txt("methodDescription"), "line": txt("lineNumber"),
            "mutator": txt("mutator").split(".")[-1], "description": txt("description"),
            "status": mu.get("status", ""), "detected": mu.get("detected", ""),
            "tests_run": mu.get("numberOfTestsRun", ""), "killing_test": txt("killingTest"),
            "indexes": lst("indexes"), "blocks": lst("blocks"),
        })
    return rows


def mutation_stats(mutants):
    s = {f"mut_{st.lower()}": 0 for st in PIT_STATUSES}
    for m in mutants:
        key = f"mut_{m['status'].lower()}"
        s[key] = s.get(key, 0) + 1
    total = len(mutants)
    detected = sum(1 for m in mutants if m["detected"] == "true")
    s.update({
        "mutants": total, "mutants_detected": detected,
        # PIT definitions: score = detected/total, strength = detected/(total - no_coverage)
        "mutation_score": ratio(detected, total),
        "test_strength": ratio(detected, total - s["mut_no_coverage"]),
        "mutation_score_killed_only": ratio(s["mut_killed"], total),
    })
    return s


# --------------------------------------------------------------------------- main
def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--tool", required=True, help="reference | golden-master | randoop | evosuite | llm | ...")
    ap.add_argument("--suite", default=None, help="test suite dir (default: <module>/src/test/java)")
    ap.add_argument("--module", default="benchmark-core")
    ap.add_argument("--model", default="", help="LLM name/version, or tool version")
    ap.add_argument("--prompt-version", default="")
    ap.add_argument("--iteration", type=int, default=1)
    ap.add_argument("--seed", default="")
    ap.add_argument("--budget-s", default="", help="generation time budget per class")
    ap.add_argument("--gen-time", default="", help="total generation wall time in seconds")
    ap.add_argument("--gen-times-file", default=None, help="CSV with columns class,seconds")
    ap.add_argument("--tokens-in", default="")
    ap.add_argument("--tokens-out", default="")
    ap.add_argument("--cost-usd", default="")
    ap.add_argument("--meta", action="append", default=[], help="extra key=value (repeatable)")
    ap.add_argument("--notes", default="")
    ap.add_argument("--no-pit", action="store_true", help="skip mutation testing")
    ap.add_argument("--pit-timeout-min", type=float, default=60,
                    help="stop PIT after this many minutes (default 60); the run is still recorded")
    ap.add_argument("--pit-threads", type=int, default=os.cpu_count() or 4,
                    help="PIT worker threads (default: number of CPU cores)")
    ap.add_argument("--max-compile-rounds", type=int, default=25)
    ap.add_argument("--delimiter", default=",", help="CSV delimiter; use ';' for Excel with Slovak locale")
    ap.add_argument("--mvn", default="mvn")
    ap.add_argument("--no-report", action="store_true",
                    help="don't rebuild results/report.html after the run")
    args = ap.parse_args()

    t0 = time.time()
    module_dir = ROOT / args.module
    pom = module_dir / "pom.xml"
    suite_src = Path(args.suite).resolve() if args.suite else module_dir / "src/test/java"
    if not suite_src.is_dir():
        sys.exit(f"Suite directory not found: {suite_src}")
    if not any(suite_src.rglob("*.java")):
        sys.exit(f"No test files (*.java) in {suite_src}\n"
                 "Generate the tests first (e.g. with Randoop/EvoSuite/an LLM), then measure them. "
                 "Nothing was recorded.")

    # settings written by the generator (generate_*.sh) override/complete the command line
    gen_meta = {}
    meta_file = suite_src / "generation_meta.txt"
    if meta_file.exists():
        for line in meta_file.read_text(encoding="utf-8").splitlines():
            if "=" in line:
                k, v = line.split("=", 1)
                gen_meta[k.strip()] = v.strip()
        gtool = gen_meta.pop("tool", "")
        if gtool and gtool != args.tool:
            print(f"!! these tests were generated by '{gtool}', but --tool is '{args.tool}'")
        for arg, key in (("model", "model"), ("seed", "seed"), ("budget_s", "budget_s"),
                         ("gen_time", "gen_time_s")):
            val = gen_meta.pop(key, None)
            if val is None:
                continue
            cur = getattr(args, arg)
            if cur not in ("", None) and str(cur) != val:
                print(f"!! --{arg.replace('_', '-')} {cur} does not match the generation ({key}={val}); "
                      f"recording {val}")
            setattr(args, arg, val)
        if not args.gen_times_file and (suite_src / "gen_times.csv").exists():
            args.gen_times_file = str(suite_src / "gen_times.csv")
        print(f"   generation settings: model={args.model} seed={args.seed} budget={args.budget_s}s "
              + " ".join(f"{k}={v}" for k, v in gen_meta.items()))
    if not args.gen_time and args.gen_times_file and Path(args.gen_times_file).exists():
        with open(args.gen_times_file, newline="", encoding="utf-8") as f:
            args.gen_time = round(sum(float(r["seconds"]) for r in csv.DictReader(f)), 2)

    # warn about accidental duplicates
    runs_csv = RESULTS / "runs.csv"
    if runs_csv.exists():
        with open(runs_csv, newline="", encoding="utf-8") as f:
            for r in csv.DictReader(f, delimiter=args.delimiter):
                if (r.get("tool"), r.get("model"), r.get("iteration"), r.get("seed"), r.get("module")) == \
                        (args.tool, args.model, str(args.iteration), str(args.seed), args.module):
                    print(f"!! a run with tool={args.tool} model={args.model} iteration={args.iteration} "
                          f"seed={args.seed} already exists ({r['run_id']}); this adds another one")
                    break

    stamp = dt.datetime.now(dt.timezone.utc)
    run_id = f"{stamp:%Y%m%dT%H%M%SZ}_{args.tool}_{args.iteration}_{uuid.uuid4().hex[:6]}"
    raw = RESULTS / "raw" / run_id
    work = raw / "suite"
    shutil.copytree(suite_src, work)
    log = raw / "maven.log"
    mvn = [args.mvn, "-B", "-ntp"]
    print(f"== run {run_id}\n   suite: {suite_src}")

    subjects = subject_classes(module_dir)
    base = {"run_id": run_id, "tool": args.tool, "model": args.model, "iteration": args.iteration}

    # static description of every test file (before compilation removes anything)
    test_files = [describe_test_file(p, work, subjects) for p in sorted(work.rglob("*.java"))]

    # 1) compile
    compile_ok, removed, rounds, compile_s = compile_suite(
        mvn, pom, work, log, args.max_compile_rounds)
    for tf in test_files:
        errs = removed.get(tf["file"], [])
        tf.update(base, compiled=(compile_ok and not errs), compile_errors=len(errs),
                  first_compile_error=(errs[0][:300] if errs else ""))
    remaining = sum(1 for tf in test_files if tf["compiled"])

    # 2) tests + coverage
    test_run_s = pit_s = 0.0
    tests, jac_classes, jac_methods, mutants = [], {}, [], []
    pit_ran = False
    pit_status = "skipped"
    target = module_dir / "target"
    if compile_ok and remaining:
        print("   running tests + JaCoCo ...")
        _, _, test_run_s = sh(mvn + ["-f", str(pom), f"-Dsuite.dir={work}",
                                     "-Dmaven.test.failure.ignore=true", "verify"], log=log, show=True)
        print(f"   tests done in {test_run_s:.0f}s")
        tests = parse_surefire(target / "surefire-reports", subjects)
        jac_classes, jac_methods = parse_jacoco(target / "site/jacoco/jacoco.xml")
        for d in ("surefire-reports", "site/jacoco"):
            if (target / d).exists():
                shutil.copytree(target / d, raw / Path(d).name, dirs_exist_ok=True)

        # 3) mutation testing
        if not args.no_pit:
            n_tests = len(tests)
            print(f"   running PIT ({args.pit_threads} threads, {n_tests} tests, "
                  f"limit {args.pit_timeout_min:g} min) ...")
            if n_tests > 5000:
                print("   note: large suite - PIT re-runs covering tests for every mutant, this can take long")
            code, _, pit_s = sh(mvn + ["-f", str(pom), f"-Dsuite.dir={work}",
                                       f"-Dpit.threads={args.pit_threads}",
                                       "org.pitest:pitest-maven:mutationCoverage"],
                                log=log, show=True, timeout_s=args.pit_timeout_min * 60)
            if code is None:
                pit_status = "timeout"
                print(f"!! PIT stopped after {args.pit_timeout_min:g} min - run recorded without mutation data")
            else:
                mutants = parse_pit(target / "pit-reports/mutations.xml")
                pit_ran = code == 0 and bool(mutants)
                pit_status = "ok" if pit_ran else "failed"
            print(f"   PIT done in {pit_s:.0f}s ({pit_status})")
            if (target / "pit-reports").exists():
                shutil.copytree(target / "pit-reports", raw / "pit-reports", dirs_exist_ok=True)
    else:
        print("!! nothing to run: " + ("no test file compiled" if compile_ok else "the build failed (see maven.log)"))

    # ---------------------------------------------------------------- per-class rows
    gen_times = {}
    if args.gen_times_file:
        with open(args.gen_times_file, newline="", encoding="utf-8") as f:
            for r in csv.DictReader(f):
                gen_times[r["class"]] = r["seconds"]

    class_rows = []
    all_class_names = sorted(set(subjects) | set(jac_classes))
    for fq in all_class_names:
        info = subjects.get(fq, {"class": fq, "simple_name": fq.split(".")[-1],
                                 "package": fq.rsplit(".", 1)[0] if "." in fq else "",
                                 "is_support": ".support." in f".{fq}"})
        row = dict(base, **info)
        row["gen_time_s"] = gen_times.get(fq, gen_times.get(info["simple_name"], ""))
        jc = jac_classes.get(fq, {t: [0, 0] for t in JACOCO_COUNTERS})
        for t in JACOCO_COUNTERS:
            m, c = jc[t]
            row[f"{t.lower()}_missed"], row[f"{t.lower()}_covered"], row[f"{t.lower()}_total"] = m, c, m + c
        row["line_cov"] = ratio(row["line_covered"], row["line_total"])
        row["branch_cov"] = ratio(row["branch_covered"], row["branch_total"])
        row["instruction_cov"] = ratio(row["instruction_covered"], row["instruction_total"])
        row["method_cov"] = ratio(row["method_covered"], row["method_total"])
        row["complexity_cov"] = ratio(row["complexity_covered"], row["complexity_total"])
        row["cyclomatic_complexity"] = row["complexity_total"]
        row["methods"] = row["method_total"]

        own_files = [tf for tf in test_files if tf["subject_class"] == fq]
        row.update(test_files=len(own_files),
                   test_files_compiled=sum(1 for tf in own_files if tf["compiled"]),
                   test_methods_static=sum(tf["test_methods"] for tf in own_files),
                   asserts_static=sum(tf["asserts"] for tf in own_files),
                   mock_refs_static=sum(tf["mock_refs"] for tf in own_files),
                   test_loc=sum(tf["loc"] for tf in own_files))

        own_tests = [t for t in tests if t["subject_class"] == fq]
        passed = sum(1 for t in own_tests if t["status"] == "passed")
        row.update(tests=len(own_tests), tests_passed=passed,
                   tests_failed=sum(1 for t in own_tests if t["status"] == "failed"),
                   tests_errors=sum(1 for t in own_tests if t["status"] == "error"),
                   tests_skipped=sum(1 for t in own_tests if t["status"] == "skipped"),
                   pass_rate=ratio(passed, len(own_tests)),
                   test_time_s=round(sum(float(t["time_s"] or 0) for t in own_tests), 3))

        own_mutants = [m for m in mutants if m["class"].split("$")[0] == fq]
        row.update(mutation_stats(own_mutants) if pit_ran else {})
        class_rows.append(row)

    # per-method mutant counts
    for me in jac_methods:
        ms = [m for m in mutants if m["class"] == me["class"] and m["method"] == me["method"]
              and m["descriptor"] == me["descriptor"]]
        me.update(base, mutants=len(ms) if pit_ran else "",
                  mutants_detected=sum(1 for m in ms if m["detected"] == "true") if pit_ran else "")

    # ---------------------------------------------------------------- run row (subjects only)
    subj = [r for r in class_rows if not r.get("is_support")]
    lc, lt = sum(r["line_covered"] for r in subj), sum(r["line_total"] for r in subj)
    bc, bt = sum(r["branch_covered"] for r in subj), sum(r["branch_total"] for r in subj)
    ic, it = sum(r["instruction_covered"] for r in subj), sum(r["instruction_total"] for r in subj)
    mc, mt = sum(r["method_covered"] for r in subj), sum(r["method_total"] for r in subj)
    subj_mutants = [m for m in mutants if ".support." not in f".{m['class']}"]
    ms = mutation_stats(subj_mutants) if pit_ran else {}
    passed = sum(1 for t in tests if t["status"] == "passed")
    extra = dict(gen_meta)
    extra.update(dict(kv.split("=", 1) for kv in args.meta if "=" in kv))

    run_row = dict(
        base, timestamp_utc=stamp.isoformat(timespec="seconds"),
        prompt_version=args.prompt_version, seed=args.seed, budget_s=args.budget_s,
        module=args.module, suite_dir=str(suite_src), notes=args.notes,
        gen_time_s=args.gen_time, tokens_in=args.tokens_in, tokens_out=args.tokens_out,
        cost_usd=args.cost_usd, extra_meta=json.dumps(extra, ensure_ascii=False) if extra else "",
        os=platform.system(), os_version=platform.release(), machine=platform.machine(),
        cpu_count=os.cpu_count(), ram_gb=ram_gb(), hostname=platform.node(),
        python_version=platform.python_version(),
        java_version=first_line(["java", "-version"]), maven_version=first_line([args.mvn, "-v"]),
        test_files_total=len(test_files), test_files_compiled=remaining,
        test_files_removed=len(removed), compile_rounds=rounds, compile_ok=compile_ok,
        compile_s=round(compile_s, 3), test_run_s=test_run_s, pit_s=pit_s,
        total_s=round(time.time() - t0, 3),
        tests=len(tests), tests_passed=passed,
        tests_failed=sum(1 for t in tests if t["status"] == "failed"),
        tests_errors=sum(1 for t in tests if t["status"] == "error"),
        tests_skipped=sum(1 for t in tests if t["status"] == "skipped"),
        pass_rate=ratio(passed, len(tests)),
        test_time_s=round(sum(float(t["time_s"] or 0) for t in tests), 3),
        line_covered=lc, line_total=lt, line_cov=ratio(lc, lt),
        branch_covered=bc, branch_total=bt, branch_cov=ratio(bc, bt),
        instruction_cov=ratio(ic, it), method_cov=ratio(mc, mt),
        mutants=ms.get("mutants", ""), mutants_detected=ms.get("mutants_detected", ""),
        mutants_killed=ms.get("mut_killed", ""), mutants_survived=ms.get("mut_survived", ""),
        mutants_no_coverage=ms.get("mut_no_coverage", ""),
        mutants_timed_out=ms.get("mut_timed_out", ""),
        mutation_score=ms.get("mutation_score", ""), test_strength=ms.get("test_strength", ""),
        pit_ran=pit_ran, pit_status=pit_status, pit_threads=args.pit_threads if not args.no_pit else "",
        status="ok" if compile_ok and tests else ("no_tests" if compile_ok else "compile_failed"),
    )

    # ---------------------------------------------------------------- write
    d = args.delimiter
    append_csv("runs.csv", RUN_FIELDS, [run_row], d)
    append_csv("classes.csv", CLASS_FIELDS, class_rows, d)
    append_csv("methods.csv", METHOD_FIELDS, jac_methods, d)
    append_csv("tests.csv", TEST_FIELDS, [dict(base, **t) for t in tests], d)
    append_csv("test_files.csv", TEST_FILE_FIELDS, test_files, d)
    append_csv("mutants.csv", MUTANT_FIELDS, [dict(base, **m) for m in mutants], d)
    with open(raw / "run.json", "w", encoding="utf-8") as f:
        json.dump(run_row, f, indent=2, default=str)

    print(f"== done in {run_row['total_s']}s: {run_row['tests']} tests, pass {run_row['pass_rate']}, "
          f"line {run_row['line_cov']}, branch {run_row['branch_cov']}, "
          f"mutation {run_row['mutation_score'] or '-'}\n   results: {RESULTS}")

    if not args.no_report:
        report = Path(__file__).resolve().parent / "make_report.py"
        rc = subprocess.run([sys.executable, str(report), "--results", str(RESULTS)]).returncode
        if rc == 0:
            print(f"   open it with:  open {RESULTS / 'report.html'}")


if __name__ == "__main__":
    main()
