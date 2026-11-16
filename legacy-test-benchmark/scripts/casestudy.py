#!/usr/bin/env python3
"""Case study: the same test generators and measurements as the benchmark, on classes of a REAL project.

The real project is only compiled with its own build and read; nothing in it is changed. Generated tests
are compiled and run outside its build (javac + JUnit console launcher + JaCoCo agent + PIT command line),
so an old or unusual build setup does not matter.

    cp casestudy.example.conf casestudy.conf      # fill in project dir and classes
    python3 scripts/casestudy.py setup            # downloads jars, builds project, checks classes (~2 min)
    python3 scripts/casestudy.py all              # generate + measure everything from [run]
    python3 scripts/casestudy.py summary          # table of the results

Single steps:
    python3 scripts/casestudy.py run --tool llm --model Qwen3-Coder:latest --prompt full --iteration 1
    python3 scripts/casestudy.py run --tool evosuite --iteration 1

Results: results-casestudy/<name>/runs.csv (one row per run), classes.csv (one row per class per run),
raw/<run_id>/ (the suite and all reports).
"""
import argparse
import configparser
import csv
import functools
import glob
import json
import os
import re
import shlex
import shutil
import subprocess
import sys
import time
import urllib.error
import urllib.request
import xml.etree.ElementTree as ET
from datetime import datetime, timezone
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import generate_llm as G  # noqa: E402  (prompts, Ollama streaming, code extraction)

ROOT = Path(__file__).resolve().parent.parent
LIB = ROOT / "tools" / "casestudy-lib"
TOOLS = ROOT / "tools"
RANDOOP_VERSION, EVOSUITE_VERSION = "4.3.4", "1.2.0"
RANDOOP_JAR = TOOLS / f"randoop-{RANDOOP_VERSION}" / f"randoop-all-{RANDOOP_VERSION}.jar"
EVOSUITE_JAR = TOOLS / f"evosuite-{EVOSUITE_VERSION}.jar"
# test libraries of the project itself are left out; ours are used instead (avoids JUnit/Mockito clashes)
CLASH = re.compile(r"/(junit|junit-jupiter[\w-]*|junit-platform[\w-]*|junit-vintage[\w-]*|mockito[\w-]*|"
                   r"hamcrest[\w-]*|byte-buddy[\w-]*|objenesis|opentest4j|apiguardian-api|powermock[\w-]*)-[\d][^/]*\.jar$")

# the full prompt without the benchmark-specific Java version line
FULL_PROMPT = G.FULL_PROMPT.replace("- Tests are compiled with Java 17; the class under test is compiled for Java 8.\n", "")
MAX_CONTEXT_CHARS = 30000


# --------------------------------------------------------------------------- config
class Cfg:
    def __init__(self, path):
        if not path.exists():
            sys.exit(f"!! {path} not found. Create it:  cp casestudy.example.conf casestudy.conf  and fill it in.")
        c = configparser.ConfigParser(inline_comment_prefixes=None)
        c.read(path, encoding="utf-8")
        p, r = c["project"], c["run"]
        self.name = p.get("name", "project").strip()
        self.dir = Path(os.path.expanduser(p["dir"].strip())).resolve()
        self.sources = self.dir / p.get("sources", "src/main/java").strip()
        self.classes_dir = self.dir / p.get("classes_dir", "target/classes").strip()
        self.build = p.get("build", "mvn -q -B -ntp -DskipTests compile").strip()
        self.classpath_cmd = p.get("classpath", "").strip()
        jh = p.get("java_home", "").strip()
        self.java = str(Path(jh) / "bin" / "java") if jh else "java"
        self.javac = str(Path(jh) / "bin" / "javac") if jh else "javac"
        self.classes = c["classes"].get("list", "").split()
        self.iterations = r.getint("iterations", 1)
        self.tools = r.get("tools", "llm evosuite randoop").split()
        self.models = r.get("models", "").split()
        self.prompts = r.get("prompts", "naive full").split()
        self.budget = r.getint("budget", 60)
        self.randoop_limit = r.get("randoop_limit", "500").strip()
        self.test_timeout = r.getint("test_timeout_s", 900)
        self.pit_timeout = r.getfloat("pit_timeout_min", 120)
        self.work = ROOT / "casestudy-work" / self.name
        self.results = ROOT / "results-casestudy" / self.name
        if not self.classes:
            sys.exit("!! [classes] list is empty in casestudy.conf")


def sh(cmd, cwd=None, timeout=None, log=None, env=None):
    """Run a command; returns (returncode, output). returncode None = timeout."""
    try:
        p = subprocess.run(cmd, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True,
                           errors="replace", timeout=timeout, shell=isinstance(cmd, str), env=env)
        rc, out = p.returncode, p.stdout
    except subprocess.TimeoutExpired as e:
        rc, out = None, (e.stdout.decode(errors="replace") if isinstance(e.stdout, bytes) else (e.stdout or "")) + "\n!! TIMEOUT"
    if log:
        Path(log).parent.mkdir(parents=True, exist_ok=True)
        Path(log).write_text(f"$ {cmd if isinstance(cmd, str) else ' '.join(map(str, cmd))}\n\n{out}", encoding="utf-8")
    return rc, out


@functools.lru_cache(maxsize=None)
def java_major(java):
    _, out = sh([java, "-version"])
    m = re.search(r'version "(\d+)(?:\.(\d+))?', out)
    if not m:
        return 0
    return int(m.group(2)) if m.group(1) == "1" else int(m.group(1))


def lib_jars(kind):
    jars = sorted(str(j) for j in LIB.glob("*.jar"))
    if kind == "pit":
        return [j for j in jars if "/pitest" in j]
    if kind == "agent":
        return [j for j in jars if "org.jacoco.agent" in j]
    if kind == "cli":
        return [j for j in jars if "org.jacoco.cli" in j]
    return [j for j in jars if "/pitest" not in j and "org.jacoco" not in j]


def project_cp(cfg):
    f = cfg.work / "project-classpath.txt"
    if not f.exists():
        sys.exit("!! Run  python3 scripts/casestudy.py setup  first.")
    deps = [d for d in f.read_text(encoding="utf-8").strip().split(os.pathsep) if d and not CLASH.search(d)]
    return [str(cfg.classes_dir)] + deps


def test_cp(cfg):
    """Our test libraries first, then the project classes and its dependencies."""
    return lib_jars("test") + project_cp(cfg)


def jvm_flags(cfg):
    return ["-XX:+EnableDynamicAgentLoading"] if java_major(cfg.java) >= 21 else []


def class_file(cfg, fq):
    return cfg.classes_dir / (fq.replace(".", "/") + ".class")


def source_file(cfg, fq):
    return cfg.sources / (fq.replace(".", "/") + ".java")


# --------------------------------------------------------------------------- setup
def cmd_setup(cfg, args):
    print(f"== Case study '{cfg.name}' | project {cfg.dir}")
    if not cfg.dir.exists():
        sys.exit(f"!! project dir does not exist: {cfg.dir}")
    cfg.work.mkdir(parents=True, exist_ok=True)
    if not lib_jars("cli") or not lib_jars("pit") or args.refresh:
        print("   downloading JUnit console, Mockito, H2, JaCoCo, PIT into tools/casestudy-lib ...")
        shutil.rmtree(LIB, ignore_errors=True)
        rc, out = sh(["mvn", "-q", "-B", "-ntp", "-f", str(ROOT / "scripts" / "casestudy-tools.pom.xml"),
                      "dependency:copy-dependencies", f"-DoutputDirectory={LIB}"])
        if rc != 0:
            sys.exit(f"!! download failed:\n{out[-3000:]}")
    print(f"   building the project: {cfg.build}")
    rc, out = sh(cfg.build, cwd=cfg.dir, log=cfg.work / "logs" / "build.log")
    if rc != 0:
        sys.exit(f"!! build failed (see {cfg.work / 'logs' / 'build.log'}):\n{out[-3000:]}")
    cpf = cfg.work / "project-classpath.txt"
    if cfg.classpath_cmd:
        print("   reading the dependency classpath ...")
        rc, out = sh(cfg.classpath_cmd.replace("{out}", shlex.quote(str(cpf))), cwd=cfg.dir,
                     log=cfg.work / "logs" / "classpath.log")
        if rc != 0 or not cpf.exists():
            sys.exit(f"!! classpath command failed (see {cfg.work / 'logs' / 'classpath.log'}):\n{out[-3000:]}")
    else:
        cpf.write_text("", encoding="utf-8")
    ok = True
    print(f"   {'class':55} source  compiled  bytecode")
    for fq in cfg.classes:
        cf, sf = class_file(cfg, fq), source_file(cfg, fq)
        ver = ""
        if cf.exists():
            major = int.from_bytes(cf.read_bytes()[6:8], "big")
            ver = f"Java {major - 44}"
        print(f"   {fq:55} {'yes' if sf.exists() else 'NO':6}  {'yes' if cf.exists() else 'NO':8}  {ver}")
        ok &= sf.exists() and cf.exists()
    deps = project_cp(cfg)[1:]
    print(f"   dependencies on the classpath: {len(deps)} jar(s)/folder(s) (project test libraries left out)")
    print(f"   test JVM: {cfg.java} (Java {java_major(cfg.java)})")
    olds = [fq for fq in cfg.classes if class_file(cfg, fq).exists()
            and int.from_bytes(class_file(cfg, fq).read_bytes()[6:8], "big") > 55]
    if olds and "evosuite" in cfg.tools:
        print(f"   !! EvoSuite {EVOSUITE_VERSION} only handles bytecode up to Java 11. It will fail for: {', '.join(olds)}")
    if not ok:
        sys.exit("!! Fix the class names in casestudy.conf (or sources / classes_dir) and run setup again.")
    print("== Setup OK. Next:  python3 scripts/casestudy.py all")


# --------------------------------------------------------------------------- generators
def suite_dir(cfg, label):
    d = cfg.work / "suites" / label
    shutil.rmtree(d, ignore_errors=True)
    (d / "_logs").mkdir(parents=True)
    return d


def write_meta(d, meta):
    (d / "generation_meta.txt").write_text("".join(f"{k}={v}\n" for k, v in meta.items()), encoding="utf-8")


def gen_randoop(cfg, seed):
    if not RANDOOP_JAR.exists():
        print("   downloading Randoop ...")
        TOOLS.mkdir(exist_ok=True)
        z = TOOLS / "randoop.zip"
        sh(["curl", "-fL", "-o", str(z), f"https://github.com/randoop/randoop/releases/download/v{RANDOOP_VERSION}/randoop-{RANDOOP_VERSION}.zip"])
        sh(["unzip", "-q", "-o", str(z), "-d", str(TOOLS)])
        z.unlink(missing_ok=True)
    d = suite_dir(cfg, "randoop")
    cp = os.pathsep.join(project_cp(cfg) + [str(RANDOOP_JAR)])
    start = time.time()
    for fq in cfg.classes:
        simple, pkg = fq.rsplit(".", 1)[1], fq.rsplit(".", 1)[0]
        cmd = [cfg.java, "-classpath", cp, "randoop.main.Main", "gentests", f"--testclass={fq}",
               f"--time-limit={cfg.budget}", f"--randomseed={seed}", f"--junit-output-dir={d}",
               f"--junit-package-name={pkg}", f"--regression-test-basename={simple}RandoopTest",
               "--no-error-revealing-tests=true"]
        if cfg.randoop_limit not in ("", "none"):
            cmd.append(f"--output-limit={cfg.randoop_limit}")
        t = time.time()
        rc, _ = sh(cmd, timeout=cfg.budget * 3 + 120, log=d / "_logs" / f"{simple}.log")
        # the suite class only re-runs RandoopTest0..N; drop it so nothing runs twice
        (d / pkg.replace(".", "/") / f"{simple}RandoopTest.java").unlink(missing_ok=True)
        print(f"   randoop {fq:50} {time.time() - t:6.0f}s  {'ok' if rc == 0 else 'FAILED'}")
    write_meta(d, {"tool": "randoop", "model": RANDOOP_VERSION, "seed": seed, "budget_s": cfg.budget,
                   "randoop_limit": cfg.randoop_limit, "gen_time_s": round(time.time() - start, 1)})
    return d


def find_old_jdk():
    if os.environ.get("EVOSUITE_JAVA_HOME"):
        return os.environ["EVOSUITE_JAVA_HOME"]
    cands = []
    for pre in ("8", "11"):
        for d in sorted(glob.glob(os.path.expanduser(f"~/.sdkman/candidates/java/{pre}.*"))):
            cands += [d, d + "/Contents/Home"] + glob.glob(d + "/*.jdk/Contents/Home")
    if Path("/usr/libexec/java_home").exists():
        _, out = sh(["/usr/libexec/java_home", "-V"])
        cands += re.findall(r"(/\S.*?Home)\s*$", out, re.M)
    for h in cands:
        java = Path(h) / "bin" / "java"
        if not java.exists():
            continue
        v = java_major(str(java))
        if (v == 8 and (Path(h) / "lib" / "tools.jar").exists()) or v == 11:
            return h
    return None


def gen_evosuite(cfg, seed):
    jdk = find_old_jdk()
    if not jdk:
        print("!! EvoSuite needs a JDK 8 (with lib/tools.jar) or 11, see scripts/generate_evosuite.sh")
        return None
    if not EVOSUITE_JAR.exists():
        print("   downloading EvoSuite ...")
        sh(["curl", "-fL", "-o", str(EVOSUITE_JAR),
            f"https://github.com/EvoSuite/evosuite/releases/download/v{EVOSUITE_VERSION}/evosuite-{EVOSUITE_VERSION}.jar"])
    d = suite_dir(cfg, "evosuite")
    (d / "_work").mkdir()
    env = dict(os.environ, JAVA_HOME=jdk, PATH=f"{jdk}/bin{os.pathsep}{os.environ.get('PATH', '')}")
    tools_jar = Path(jdk) / "lib" / "tools.jar"
    start = time.time()
    for fq in cfg.classes:
        simple = fq.rsplit(".", 1)[1]
        cmd = [f"{jdk}/bin/java", "-jar", str(EVOSUITE_JAR), "-class", fq,
               "-projectCP", os.pathsep.join(project_cp(cfg)), "-seed", str(seed),
               f"-Dsearch_budget={cfg.budget}", "-Dno_runtime_dependency=true", "-Dreplace_calls=false",
               "-Dfilter_sandbox_tests=true", f"-Dtest_dir={d}", f"-Dreport_dir={d / '_report'}",
               "-Dshow_progress=false"]
        if tools_jar.exists():
            cmd.append(f"-Dtools_jar_location={tools_jar}")
        t = time.time()
        rc, _ = sh(cmd, cwd=d / "_work", timeout=cfg.budget * 6 + 300, log=d / "_logs" / f"{simple}.log", env=env)
        made = (d / (fq.replace(".", "/") + "_ESTest.java")).exists()
        print(f"   evosuite {fq:50} {time.time() - t:6.0f}s  {'ok' if made else 'FAILED'}")
    shutil.rmtree(d / "_work", ignore_errors=True)
    write_meta(d, {"tool": "evosuite", "model": EVOSUITE_VERSION, "seed": seed, "budget_s": cfg.budget,
                   "gen_time_s": round(time.time() - start, 1)})
    return d


def wait_ollama(host):
    for _ in range(30):
        try:
            urllib.request.urlopen(host + "/api/tags", timeout=10).read()
            return True
        except Exception:
            print("   waiting for Ollama ...", flush=True)
            time.sleep(10)
    print("!! Ollama does not answer (brew services restart ollama)")
    return False


def context_for(cfg, source, own_name, index):
    """Project classes the class refers to by simple name, smallest first, at most MAX_CONTEXT_CHARS."""
    parts, total = [], 0
    used = [f for n, f in index.items() if n != own_name and re.search(rf"\b{re.escape(n)}\b", source)]
    for f in sorted(used, key=lambda f: f.stat().st_size):
        text = G.strip_comments(f.read_text(encoding="utf-8", errors="replace"))
        if total + len(text) > MAX_CONTEXT_CHARS:
            continue
        parts.append(f"\n```java\n// {f.name}\n{text}```\n")
        total += len(text)
    return "".join(parts)


def check_one(cfg, work, package, test_class, code):
    """Compile + run one generated test class (repair loop of the full prompt)."""
    shutil.rmtree(work, ignore_errors=True)
    src = work / "src" / package.replace(".", "/")
    src.mkdir(parents=True)
    (src / f"{test_class}.java").write_text(code, encoding="utf-8")
    classes = work / "classes"
    classes.mkdir()
    cp = os.pathsep.join(test_cp(cfg))
    rc, out = sh([cfg.javac, "-nowarn", "-proc:none", "-encoding", "UTF-8", "-d", str(classes), "-cp", cp,
                  str(src / f"{test_class}.java")], timeout=300)
    if rc != 0:
        errs = [l for l in out.splitlines() if l.strip()][:40]
        return "compile_error", "\n".join(e.replace(str(work / "src") + "/", "") for e in errs)
    fq = f"{package}.{test_class}" if package else test_class
    rep = work / "reports"
    rc, out = sh([cfg.java] + jvm_flags(cfg) + ["-cp", os.pathsep.join([str(classes), cp]),
                 "org.junit.platform.console.ConsoleLauncher", "execute", "--disable-banner",
                 "--disable-ansi-colors", "--details=none", f"--select-class={fq}", f"--reports-dir={rep}"],
                 timeout=300)
    if rc is None:
        return "timeout", "The tests did not finish within 300 seconds (endless loop or waiting?)."
    res = parse_reports(rep)
    if not res["tests"] and rc not in (0, 1):
        return "jvm_crash", out[-2000:]
    if res["failed"] + res["errors"] == 0 and res["tests"] > 0:
        return "passed", ""
    if res["tests"] == 0:
        return "tests_fail", "No test was found or run. Use org.junit.jupiter.api.Test on the test methods."
    return "tests_fail", "\n".join(res["messages"][:15])


def gen_llm(cfg, model, prompt, seed, args):
    host = args.host
    if not wait_ollama(host):
        return None
    slug = re.sub(r"[^a-z0-9]+", "-", model.split("/")[-1].lower()).strip("-")
    d = suite_dir(cfg, f"llm-{slug}-{prompt}")
    a = argparse.Namespace(model=model, temperature=0.2, seed=seed, num_ctx=16384, max_tokens=8192,
                           host=host, request_timeout=1800)
    info = G.model_info(host, model)
    think = False if info["thinking_capable"] else None
    max_repairs = 3 if prompt == "full" else 0
    index = {f.stem: f for f in cfg.sources.rglob("*.java")}
    print(f"   warm-up {model} ...", flush=True)
    try:
        G.chat(a, [{"role": "user", "content": "Reply with the single word OK."}], think, "warm-up:")
    except (urllib.error.URLError, OSError) as e:
        print(f"!! model does not answer: {e}")
        return None
    t_start, tin, tout, statuses = time.time(), 0, 0, {}
    for fq in cfg.classes:
        package, name = fq.rsplit(".", 1)
        test_class = f"{name}Test"
        source = G.strip_comments(source_file(cfg, fq).read_text(encoding="utf-8", errors="replace"))
        if prompt == "naive":
            messages = [{"role": "user", "content": G.NAIVE_PROMPT.format(test_class=test_class, package=package, source=source)}]
        else:
            ctx = context_for(cfg, source, name, index)
            messages = [{"role": "system", "content": G.FULL_SYSTEM},
                        {"role": "user", "content": FULL_PROMPT.format(
                            test_class=test_class, package=package, fq=fq, source=source,
                            context=G.CONTEXT_PROMPT.format(files=ctx) if ctx else "")}]
        log, best, status, t = [f"# {fq} - {model} - {prompt} - seed {seed}\n"], (99, None, "no_code"), "no_code", time.time()
        for rnd in range(max_repairs + 1):
            log.append(f"\n## Round {rnd} - prompt\n\n{messages[-1]['content']}\n")
            try:
                reply = G.chat(a, messages, think, f"{name} round {rnd}:")
            except (urllib.error.URLError, OSError) as e:
                status = "llm_error"
                log.append(f"\n!! model call failed: {e}\n")
                break
            tin += reply["tokens_in"]
            tout += reply["tokens_out"]
            log.append(f"\n## Round {rnd} - answer\n\n{reply['text']}\n")
            code = G.extract_java(reply["text"], package, test_class)
            if code is None:
                status, details = ("too_long", "The answer was cut off. Write a shorter test class.") if reply.get("truncated") \
                    else ("no_code", "The answer contained no Java class.")
            elif prompt == "naive":
                status, details = "not_checked", ""
            else:
                status, details = check_one(cfg, d / "_check", package, test_class, code)
                print(f"      {name} round {rnd}: {status}", flush=True)
            if code is not None and G.RANK.get(status, 9) <= best[0]:
                best = (G.RANK.get(status, 9), code, status)
            if status in ("passed", "not_checked") or rnd == max_repairs:
                break
            log.append(f"\n## Round {rnd} - check: {status}\n\n```\n{details}\n```\n")
            messages += [{"role": "assistant", "content": reply["text"]},
                         {"role": "user", "content": G.REPAIR_PROMPT.format(problem=status.replace("_", " "), details=details)}]
        if best[1]:
            status = best[2]
            target = d / package.replace(".", "/") / f"{test_class}.java"
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(best[1], encoding="utf-8")
        statuses[fq] = status
        (d / "_logs" / f"{name}.md").write_text("".join(log), encoding="utf-8")
        print(f"   llm {fq:50} {time.time() - t:6.0f}s  {status}")
    shutil.rmtree(d / "_check", ignore_errors=True)
    counts = {s: list(statuses.values()).count(s) for s in sorted(set(statuses.values()))}
    write_meta(d, {"tool": "llm", "model": model, "prompt_version": prompt, "seed": seed, "temperature": 0.2,
                   "max_repairs": max_repairs, "gen_time_s": round(time.time() - t_start, 1),
                   "tokens_in": tin, "tokens_out": tout,
                   "classes_final_status": " ".join(f"{k}={v}" for k, v in counts.items())})
    return d


# --------------------------------------------------------------------------- measurement
def parse_reports(rep):
    res = {"tests": 0, "failed": 0, "errors": 0, "skipped": 0, "messages": [], "by_class": {}, "cases": []}
    for f in sorted(Path(rep).glob("*.xml")):
        try:
            root = ET.parse(f).getroot()
        except ET.ParseError:
            continue
        for tc in root.iter("testcase"):
            cls = tc.get("classname", "")
            bc = res["by_class"].setdefault(cls, [0, 0])
            bc[0] += 1
            res["tests"] += 1
            fail, err = tc.find("failure"), tc.find("error")
            status, ftype, msg = "passed", "", ""
            if tc.find("skipped") is not None:
                res["skipped"] += 1
                status = "skipped"
            elif fail is not None or err is not None:
                status = "failed" if fail is not None else "error"
                res["failed" if fail is not None else "errors"] += 1
                el = fail if fail is not None else err
                ftype, msg = el.get("type") or "", (el.get("message") or "")[:300]
                res["messages"].append(f"{tc.get('name')}: {msg or ftype}")
            else:
                bc[1] += 1
            res["cases"].append({"test_class": cls, "test_name": tc.get("name", ""), "time_s": tc.get("time", ""),
                                 "status": status, "failure_type": ftype, "failure_message": msg})
    return res


def target_of(test_fq, classes):
    """Class under test of a test class: the longest class name the test class name starts with."""
    simple, best = test_fq.rsplit(".", 1)[-1], ""
    for fq in classes:
        n = fq.rsplit(".", 1)[-1]
        if simple.startswith(n) and len(n) > len(best.rsplit(".", 1)[-1]):
            best = fq
    return best


def read_meta(f):
    if not Path(f).exists():
        return {}
    return dict(l.split("=", 1) for l in Path(f).read_text(encoding="utf-8").splitlines() if "=" in l)


def measure(cfg, suite, meta, iteration, record=False):
    """Compile + run + coverage + PIT for one suite folder. Everything is stored in raw/<run_id>/;
    the CSV files and the report are rebuilt from the raw folders afterwards."""
    suite = Path(suite).resolve()
    tool = meta.get("tool", "?")
    run_id = f"{datetime.now(timezone.utc):%Y%m%dT%H%M%SZ}_{tool}_{iteration}_{os.urandom(3).hex()}"
    raw = cfg.results / "raw" / run_id
    w = raw / "work"
    shutil.copytree(suite, raw / "suite", ignore=shutil.ignore_patterns("_check", "_work", "*.class", ".DS_Store"))
    write_meta(raw / "suite", meta)
    w.mkdir(parents=True)
    (w / "classes.txt").write_text("\n".join(cfg.classes), encoding="utf-8")
    print(f"   measuring {suite.name} -> {raw.relative_to(ROOT)}")
    cp = test_cp(cfg)
    files = [f for f in (raw / "suite").rglob("*.java") if "/_" not in f.as_posix()]
    removed = []
    classes_out = w / "classes"
    # 1. compile; files with errors are removed until the rest compiles
    for rnd in range(25):
        shutil.rmtree(classes_out, ignore_errors=True)
        classes_out.mkdir()
        if not files:
            break
        rc, out = sh([cfg.javac, "-nowarn", "-proc:none", "-encoding", "UTF-8", "-d", str(classes_out),
                      "-cp", os.pathsep.join(cp)] + [str(f) for f in files], timeout=1200,
                     log=w / f"compile-{rnd}.log")
        if rc == 0:
            break
        bad = {Path(m) for m in re.findall(r"^(/.*?\.java):\d+: error", out, re.M)} & set(files)
        if not bad:
            removed += files
            files = []
            break
        removed += sorted(bad)
        files = [f for f in files if f not in bad]
    (raw / "removed_files.txt").write_text("\n".join(str(f.relative_to(raw / "suite")) for f in removed), encoding="utf-8")
    tests = sorted(str(p.relative_to(classes_out))[:-6].replace("/", ".") for p in classes_out.rglob("*.class")
                   if "$" not in p.name)
    tests = [t for t in tests if re.search(r"(Test\d*|Tests|_ESTest)$", t)]
    agent = lib_jars("agent")[0]
    includes = ":".join(f"{fq}:{fq}$*" for fq in cfg.classes)
    exec_file = w / "jacoco.exec"

    def copy_resources():   # e.g. golden-master *.approved.txt, read from the test classpath
        for f in (raw / "suite").rglob("*"):
            rel = f.relative_to(raw / "suite")
            if f.is_file() and f.suffix != ".java" and not any(p.startswith("_") for p in rel.parts) \
                    and f.name != "generation_meta.txt":
                (classes_out / rel).parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(f, classes_out / rel)

    def run_tests(selected, timeout, rep, extra=(), log="tests.log", coverage=True):
        exec_file.unlink(missing_ok=True)
        shutil.rmtree(rep, ignore_errors=True)
        jvm = [f"-javaagent:{agent}=destfile={exec_file},includes={includes}"] if coverage else []
        return sh([cfg.java] + jvm + jvm_flags(cfg) + list(extra)
                  + ["-cp", os.pathsep.join([str(classes_out)] + cp), "org.junit.platform.console.ConsoleLauncher",
                     "execute", "--disable-banner", "--disable-ansi-colors", "--details=none", f"--reports-dir={rep}"]
                  + [f"--select-class={t}" for t in selected], cwd=w, timeout=timeout, log=w / log)

    if tests and record:
        # golden master: write the CURRENT behaviour to *.approved.txt (into the copy and the original suite)
        print("   recording the golden master (approve mode) ...")
        run_tests(tests, cfg.test_timeout, w / "record", coverage=False, log="record.log",
                  extra=["-Dgolden.approve=true", f"-Dgolden.dir={raw / 'suite'}"])
        n = 0
        for f in (raw / "suite").rglob("*.approved.txt"):
            target = suite / f.relative_to(raw / "suite")
            target.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(f, target)
            n += 1
        print(f"   {n} approved file(s) written")
    copy_resources()

    # 2. run with coverage; a suite that hangs is split class by class and the hanging classes dropped
    passed = 0
    if tests:
        rc, _ = run_tests(tests, cfg.test_timeout, w / "reports")
        if rc is None:
            print("   !! the test run timed out - checking test classes one by one")
            keep = []
            for t in tests:
                r1, _ = run_tests([t], 300, w / "single")
                if r1 is not None:
                    keep.append(t)
                else:
                    print(f"      dropped (hangs): {t}")
            tests = keep
            shutil.rmtree(w / "single", ignore_errors=True)
            if tests:
                run_tests(tests, cfg.test_timeout, w / "reports")
        res = parse_reports(w / "reports")
        passed = res["tests"] - res["failed"] - res["errors"] - res["skipped"]
    (w / "test_classes.txt").write_text("\n".join(tests), encoding="utf-8")
    # 3. coverage of the classes under test only
    if exec_file.exists():
        classfiles = []
        for fq in cfg.classes:
            cf = class_file(cfg, fq)
            for f in [cf] + sorted(cf.parent.glob(cf.stem + "$*.class")):
                classfiles += ["--classfiles", str(f)]
        sh([cfg.java, "-jar", lib_jars("cli")[0], "report", str(exec_file), *classfiles,
            "--sourcefiles", str(cfg.sources), "--csv", str(w / "jacoco.csv"), "--html", str(w / "jacoco-html")],
           log=w / "jacoco.log")
    # 4. mutation testing (only when at least one test passes)
    if passed:
        targets = ",".join(f"{fq},{fq}$*" for fq in cfg.classes)
        threads = max(1, (os.cpu_count() or 4) - 1)
        flags = jvm_flags(cfg)
        cmd = [cfg.java, "-cp", os.pathsep.join(lib_jars("pit") + [str(classes_out)] + cp),
               "org.pitest.mutationtest.commandline.MutationCoverageReport",
               "--reportDir", str(w / "pit"), "--targetClasses", targets, "--targetTests", ",".join(tests),
               "--sourceDirs", str(cfg.sources), "--outputFormats", "CSV,HTML", "--timestampedReports=false",
               "--skipFailingTests=true", "--threads", str(threads)]
        if flags:
            cmd += ["--jvmArgs", ",".join(flags)]
        print(f"   PIT ({threads} threads, max {cfg.pit_timeout:.0f} min) ...", flush=True)
        rc, out = sh(cmd, cwd=w, timeout=cfg.pit_timeout * 60, log=w / "pit.log")
        if rc not in (0, None) and "skipFailingTests" in out:   # older PIT command line without this option
            cmd.remove("--skipFailingTests=true")
            sh(cmd, cwd=w, timeout=cfg.pit_timeout * 60, log=w / "pit.log")
    row = collect_run(cfg, raw)[0]
    print(f"   => files compiled {row['test_files_compiled']}/{row['test_files_total']} | tests "
          f"{row['tests_passed']}/{row['tests']} passed | line {pct(row['line_cov'])} | "
          f"branch {pct(row['branch_cov'])} | mutation {pct(row['mutation_score'])} ({row['pit_status']})")
    return row


def pct(v):
    return f"{float(v) * 100:.1f}%" if v not in ("", None) else "-"


def ratio(a, b):
    return round(a / b, 4) if b else ""


# --------------------------------------------------------------------------- CSV files + report (from raw/)
RUN_FIELDS = ["run_id", "timestamp_utc", "tool", "model", "prompt_version", "iteration", "seed", "budget_s",
              "module", "notes", "gen_time_s", "tokens_in", "tokens_out", "extra_meta",
              "test_files_total", "test_files_compiled", "test_files_removed",
              "tests", "tests_passed", "tests_failed", "tests_errors", "tests_skipped", "pass_rate",
              "line_covered", "line_total", "line_cov", "branch_covered", "branch_total", "branch_cov",
              "instruction_cov", "mutants", "mutants_detected", "mutants_killed", "mutants_survived",
              "mutants_no_coverage", "mutants_timed_out", "mutation_score", "test_strength", "pit_status", "status"]
CLASS_FIELDS = ["run_id", "tool", "model", "prompt_version", "iteration", "class", "simple_name", "package",
                "is_support", "line_cov", "branch_cov", "instruction_cov", "cyclomatic_complexity",
                "tests", "tests_passed", "pass_rate", "mutants", "mutants_detected", "mutation_score",
                "test_strength"]
TEST_FIELDS = ["run_id", "tool", "iteration", "subject_class", "test_class", "test_name", "time_s", "status",
               "failure_type", "failure_message"]
MUTANT_FIELDS = ["run_id", "tool", "iteration", "class", "method", "line", "mutator", "status", "killing_test"]
DETECTED = ("KILLED", "TIMED_OUT", "MEMORY_ERROR", "RUN_ERROR")
MAIN_META = ("tool", "model", "prompt_version", "seed", "budget_s", "gen_time_s", "tokens_in", "tokens_out", "notes")


def collect_run(cfg, raw):
    """All rows of one run, read from its raw folder."""
    m = re.match(r"(\d{4})(\d\d)(\d\d)T(\d\d)(\d\d)(\d\d)Z_(.+)_(\d+)_[0-9a-f]+$", raw.name)
    if not m:
        return None
    w, meta = raw / "work", read_meta(raw / "suite" / "generation_meta.txt")
    tool, iteration = meta.get("tool", m.group(7)), int(m.group(8))
    classes = (w / "classes.txt").read_text(encoding="utf-8").split() if (w / "classes.txt").exists() else cfg.classes
    base = {"run_id": raw.name, "tool": tool, "iteration": iteration}
    total = len([f for f in (raw / "suite").rglob("*.java") if "/_" not in f.as_posix()])
    rem = raw / "removed_files.txt"
    removed = len([l for l in rem.read_text(encoding="utf-8").splitlines() if l.strip()]) if rem.exists() else 0
    # tests
    res = parse_reports(w / "reports")
    per = {fq: {"tests": 0, "passed": 0} for fq in classes}
    test_rows = []
    for c in res["cases"]:
        tgt = target_of(c["test_class"], classes)
        if tgt:
            per[tgt]["tests"] += 1
            per[tgt]["passed"] += c["status"] == "passed"
        test_rows.append(dict(base, subject_class=tgt.rsplit(".", 1)[-1] if tgt else "", **c))
    passed = res["tests"] - res["failed"] - res["errors"] - res["skipped"]
    # coverage
    cov = {fq: {} for fq in classes}
    if (w / "jacoco.csv").exists():
        with open(w / "jacoco.csv", encoding="utf-8") as f:
            for r in csv.DictReader(f):
                outer = r["CLASS"].split(".")[0]
                fq = f"{r['PACKAGE']}.{outer}" if r["PACKAGE"] else outer
                if fq in cov:
                    for k, v in r.items():
                        if k.endswith(("_MISSED", "_COVERED")):
                            cov[fq][k] = cov[fq].get(k, 0) + int(v)

    def cv(c, kind):
        return c.get(f"{kind}_COVERED", 0), c.get(f"{kind}_COVERED", 0) + c.get(f"{kind}_MISSED", 0)

    # mutants
    mut = {fq: {} for fq in classes}
    mutant_rows = []
    mfile = w / "pit" / "mutations.csv"
    if mfile.exists():
        with open(mfile, encoding="utf-8") as f:
            for r in csv.reader(f):
                if len(r) < 6 or r[5] == "NON_VIABLE":
                    continue
                fq = r[1].split("$")[0]
                if fq in mut:
                    mut[fq][r[5]] = mut[fq].get(r[5], 0) + 1
                    mutant_rows.append(dict(base, **{"class": r[1], "method": r[3], "line": r[4],
                                                      "mutator": r[2].rsplit(".", 1)[-1], "status": r[5],
                                                      "killing_test": r[6] if len(r) > 6 else ""}))
    if mfile.exists():
        pit_status = "ok"
    elif (w / "pit.log").exists():
        pit_status = "timeout" if "!! TIMEOUT" in (w / "pit.log").read_text(encoding="utf-8", errors="replace") else "failed"
    else:
        pit_status = "not_run"

    def ms(d):   # (mutants, detected, mutation score, test strength)
        n, det = sum(d.values()), sum(d.get(s, 0) for s in DETECTED)
        if pit_status != "ok":   # no tests passed -> nothing detected; PIT broke -> unknown
            return n, det, (0.0 if pit_status == "not_run" else ""), ""
        return n, det, ratio(det, n), ratio(det, n - d.get("NO_COVERAGE", 0))

    class_rows = []
    for fq in classes:
        c, p = cov[fq], per[fq]
        (lc, lt), (bc, bt), (ic, it) = cv(c, "LINE"), cv(c, "BRANCH"), cv(c, "INSTRUCTION")
        n, det, score, strength = ms(mut[fq])
        class_rows.append(dict(base, model=meta.get("model", ""), prompt_version=meta.get("prompt_version", ""),
                               **{"class": fq}, simple_name=fq.rsplit(".", 1)[-1], package=fq.rsplit(".", 1)[0],
                               is_support="False", line_cov=ratio(lc, lt) if lt else 0.0,
                               branch_cov=ratio(bc, bt) if bt else ("" if lt else 0.0),
                               instruction_cov=ratio(ic, it) if it else 0.0,
                               cyclomatic_complexity=cv(c, "COMPLEXITY")[1] or "",
                               tests=p["tests"], tests_passed=p["passed"], pass_rate=ratio(p["passed"], p["tests"]),
                               mutants=n, mutants_detected=det, mutation_score=score, test_strength=strength))
    tot = {}
    for c in cov.values():
        for k, v in c.items():
            tot[k] = tot.get(k, 0) + v
    allm = {}
    for d in mut.values():
        for k, v in d.items():
            allm[k] = allm.get(k, 0) + v
    (lc, lt), (bc, bt), (ic, it) = cv(tot, "LINE"), cv(tot, "BRANCH"), cv(tot, "INSTRUCTION")
    n, det, score, strength = ms(allm)
    run = dict(base, timestamp_utc="{}-{}-{}T{}:{}:{}Z".format(*m.groups()[:6]), model=meta.get("model", ""),
               prompt_version=meta.get("prompt_version", ""), seed=meta.get("seed", ""),
               budget_s=meta.get("budget_s", ""), module=cfg.name, notes=meta.get("notes", ""),
               gen_time_s=meta.get("gen_time_s", ""), tokens_in=meta.get("tokens_in", ""),
               tokens_out=meta.get("tokens_out", ""),
               extra_meta=json.dumps({k: v for k, v in sorted(meta.items()) if k not in MAIN_META}),
               test_files_total=total, test_files_compiled=total - removed, test_files_removed=removed,
               tests=res["tests"], tests_passed=passed, tests_failed=res["failed"], tests_errors=res["errors"],
               tests_skipped=res["skipped"], pass_rate=ratio(passed, res["tests"]),
               line_covered=lc, line_total=lt, line_cov=ratio(lc, lt) if lt else 0.0,
               branch_covered=bc, branch_total=bt, branch_cov=ratio(bc, bt) if bt else ("" if lt else 0.0),
               instruction_cov=ratio(ic, it) if it else 0.0,
               mutants=n, mutants_detected=det, mutants_killed=allm.get("KILLED", 0),
               mutants_survived=allm.get("SURVIVED", 0), mutants_no_coverage=allm.get("NO_COVERAGE", 0),
               mutants_timed_out=allm.get("TIMED_OUT", 0), mutation_score=score, test_strength=strength,
               pit_status=pit_status, status="ok" if res["tests"] else "no_runnable_tests")
    return run, class_rows, test_rows, mutant_rows


def rebuild(cfg, report=True):
    """Rewrite runs/classes/tests/mutants.csv from all raw/ folders and build report.html."""
    runs, classes, tests, mutants = [], [], [], []
    for raw in sorted((cfg.results / "raw").glob("*")) if (cfg.results / "raw").exists() else []:
        got = collect_run(cfg, raw) if raw.is_dir() else None
        if got:
            runs.append(got[0])
            classes += got[1]
            tests += got[2]
            mutants += got[3]
    for name, fields, rows in (("runs.csv", RUN_FIELDS, runs), ("classes.csv", CLASS_FIELDS, classes),
                               ("tests.csv", TEST_FIELDS, tests), ("mutants.csv", MUTANT_FIELDS, mutants)):
        with open(cfg.results / name, "w", newline="", encoding="utf-8") as f:
            wr = csv.DictWriter(f, fieldnames=fields, extrasaction="ignore")
            wr.writeheader()
            wr.writerows(rows)
    if report and runs:
        rc, out = sh([sys.executable, str(ROOT / "scripts" / "make_report.py"), "--results", str(cfg.results)])
        print(f"   report: open {cfg.results / 'report.html'}" if rc == 0 else f"!! report failed:\n{out[-1500:]}")
    return runs


# --------------------------------------------------------------------------- commands
def one_run(cfg, args, tool, iteration, model=None, prompt=None):
    seed = 41 + iteration
    label = f"{tool}" + (f" {model} {prompt}" if tool == "llm" else "")
    print(f"\n######## {label} | iteration {iteration} | seed {seed} | {datetime.now():%H:%M}", flush=True)
    if tool == "randoop":
        d = gen_randoop(cfg, seed)
    elif tool == "evosuite":
        d = gen_evosuite(cfg, seed)
    elif tool == "llm":
        d = gen_llm(cfg, model, prompt, seed, args)
    else:
        print(f"!! unknown tool {tool}")
        return False
    if d is None:
        return False
    try:
        measure(cfg, d, read_meta(d / "generation_meta.txt"), iteration)
        return True
    except Exception as e:  # one broken run must not stop the night
        print(f"!! measurement failed: {e!r}")
        return False


def cmd_run(cfg, args):
    if args.tool == "llm" and not (args.model and args.prompt):
        sys.exit("!! --tool llm needs --model and --prompt")
    one_run(cfg, args, args.tool, args.iteration, args.model, args.prompt)
    cmd_summary(cfg, args)


def cmd_measure(cfg, args):
    """Measure a suite that already exists (hand-written tests, golden master written by Bob, ...)."""
    suite = Path(os.path.expanduser(args.suite)).resolve()
    if not suite.is_dir() or not list(suite.rglob("*.java")):
        sys.exit(f"!! no .java test files under {suite}")
    top = sorted({f.relative_to(suite).parts[0] for f in suite.rglob("*.java")})
    pkgs = sorted({fq.split(".")[0] for fq in cfg.classes})
    if not set(top) & set(pkgs):
        print(f"   !! {suite} should be the package ROOT (containing {'/, '.join(pkgs)}/), but it contains: {', '.join(top)}")
    meta = read_meta(suite / "generation_meta.txt")
    meta.update({"tool": args.tool})
    for k in ("model", "notes"):
        if getattr(args, k):
            meta[k] = getattr(args, k)
    print(f"\n######## {args.tool} {meta.get('model', '')} | iteration {args.iteration} | {datetime.now():%H:%M}")
    measure(cfg, suite, meta, args.iteration, record=args.record)
    cmd_summary(cfg, args)


def cmd_all(cfg, args):
    first, last = args.first or 1, args.last or cfg.iterations
    start, failed = time.time(), []
    print(f"== Case study '{cfg.name}': {len(cfg.classes)} classes | iterations {first}..{last} | tools {' '.join(cfg.tools)}")
    for i in range(first, last + 1):   # iteration by iteration: whatever finishes is a complete set
        for tool in cfg.tools:
            if tool == "llm":
                for model in cfg.models:
                    for prompt in cfg.prompts:
                        if not one_run(cfg, args, tool, i, model, prompt):
                            failed.append(f"{model}/{prompt}#{i}")
            elif not one_run(cfg, args, tool, i):
                failed.append(f"{tool}#{i}")
    print(f"\n== Finished after {(time.time() - start) / 3600:.1f} h." + (f" Failed: {' '.join(failed)}" if failed else ""))
    cmd_summary(cfg, args)


def cmd_summary(cfg, args):
    """Rebuilds the CSV files + report.html from raw/ and prints the table."""
    runs = rebuild(cfg)
    if not runs:
        print("no results yet")
        return
    groups = {}
    for r in runs:
        groups.setdefault((r["tool"], r["model"].split("/")[-1], r["prompt_version"]), []).append(r)

    def mean(rows, k):
        v = [float(r[k]) for r in rows if r.get(k) not in ("", None)]
        return sum(v) / len(v) if v else None

    print(f"\n== Results '{cfg.name}' ({(cfg.results / 'runs.csv').relative_to(ROOT)})")
    print(f"   {'tool':14} {'model':30} {'prompt':7} {'runs':>4} {'compiled':>9} {'pass':>7} {'line':>7} {'branch':>7} {'mutation':>9}")
    for (tool, model, prompt), rows in sorted(groups.items()):
        comp = sum(r["test_files_compiled"] for r in rows), sum(r["test_files_total"] for r in rows)
        cells = [mean(rows, k) for k in ("pass_rate", "line_cov", "branch_cov", "mutation_score")]
        print(f"   {tool:14} {model[:30]:30} {prompt:7} {len(rows):4} {f'{comp[0]}/{comp[1]}':>9} " + " ".join(
            f"{c * 100:6.1f}%" if c is not None else "      -" for c in cells[:3]) + (
            f" {cells[3] * 100:8.1f}%" if cells[3] is not None else "        -"))


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--config", default=str(ROOT / "casestudy.conf"))
    ap.add_argument("--host", default="http://localhost:11434")
    sub = ap.add_subparsers(dest="cmd", required=True)
    s = sub.add_parser("setup")
    s.add_argument("--refresh", action="store_true", help="download the jars again")
    a = sub.add_parser("all")
    a.add_argument("--first", type=int)
    a.add_argument("--last", type=int)
    r = sub.add_parser("run")
    r.add_argument("--tool", required=True, choices=["llm", "evosuite", "randoop"])
    r.add_argument("--model")
    r.add_argument("--prompt", choices=["naive", "full"])
    r.add_argument("--iteration", type=int, default=1)
    m = sub.add_parser("measure", help="measure an existing suite folder (golden master, hand-written tests)")
    m.add_argument("--suite", required=True, help="package root of the tests (the folder that contains e.g. otms/...)")
    m.add_argument("--tool", default="golden-master", help="name in the report: golden-master, reference, ...")
    m.add_argument("--model", default="", help="who wrote it, e.g. bob")
    m.add_argument("--notes", default="")
    m.add_argument("--iteration", type=int, default=1)
    m.add_argument("--record", action="store_true",
                   help="golden master with the GoldenMaster.java helper: record *.approved.txt from the current code first")
    sub.add_parser("summary", help="rebuild the CSV files and report.html from raw/, print the table")
    sub.add_parser("report", help="same as summary")
    args = ap.parse_args()
    cfg = Cfg(Path(args.config))
    {"setup": cmd_setup, "all": cmd_all, "run": cmd_run, "measure": cmd_measure, "summary": cmd_summary,
     "report": cmd_summary}[args.cmd](cfg, args)


if __name__ == "__main__":
    main()
