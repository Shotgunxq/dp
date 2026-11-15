#!/usr/bin/env python3
"""
Generate unit tests for every benchmark class with a local LLM (via Ollama).

  python3 scripts/generate_llm.py --model "Qwen3-Coder:latest" --prompt naive
  python3 scripts/generate_llm.py --model "hf.co/unsloth/Qwen3.6-35B-A3B-GGUF:UD-IQ4_XS" --prompt full --seed 43

Prompt strategies
  naive  one request per class: "write JUnit 5 tests for this class" + its source (baseline B3)
  full   the methodology: rules + the class + the types it uses, then a repair loop: the test is
         compiled and run, and compiler errors / failing tests are sent back to the model
         (at most --max-repairs rounds)

Output (old *.java files are replaced):
  <module>/suites/llm-<model>-<prompt>/<package>/<Class>Test.java   the generated tests
  .../gen_times.csv          generation wall time per class (incl. repair rounds)
  .../llm_calls.csv          one row per model call: tokens, seconds, outcome, errors
  .../generation_meta.txt    all settings - run_iteration.py records them automatically
  .../_logs/<Class>.md       full conversation per class (prompts + answers) for the thesis

Requires Ollama running locally (the Ollama app, or `ollama serve`). Only the Python 3
standard library is used. Run from the project root.
"""

import argparse
import csv
import json
import re
import shutil
import subprocess
import sys
import threading
import time
import urllib.error
import urllib.request
import xml.etree.ElementTree as ET
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent

NAIVE_PROMPT = """Write JUnit 5 unit tests for the following Java class.
Return one complete Java file for the test class {test_class} in package {package}.

```java
{source}
```"""

FULL_SYSTEM = ("You are an experienced Java developer writing unit tests for a legacy code base. "
               "Answer with exactly one complete Java source file in a ```java code block and nothing else.")

FULL_PROMPT = """Write a JUnit 5 test class for the class under test below.

Requirements:
- File {test_class}.java, package {package}, public or package-private class {test_class}.
- Available libraries: JUnit 5 (org.junit.jupiter.api.*, org.junit.jupiter.params.*), Mockito 5
  (org.mockito.*; mockStatic and mockConstruction work) and the H2 in-memory database driver
  (jdbc:h2:mem:... URLs via java.sql.DriverManager). Nothing else.
- Tests are compiled with Java 17; the class under test is compiled for Java 8.
- Do not change the class under test. Test it as it is, including its legacy design.
- Cover every public method and every branch: normal cases, boundary values, invalid input and
  the exceptions thrown (assertThrows, and check the message where it is meaningful).
- Assert concrete expected values. Never assert values that depend on the current time or on
  randomness; check their format or range instead.
- If the class has hard-wired dependencies (new inside methods, static calls, singletons, files,
  system properties), keep the tests self-contained: e.g. create temporary files, set and restore
  system properties, reset singletons, or use Mockito's mockConstruction / mockStatic.
- Tests must not depend on each other or on the order in which they run.

Class under test ({fq}):
```java
{source}
```
{context}"""

CONTEXT_PROMPT = """
Types it uses (for reference only - do not write tests for them):
{files}"""

REPAIR_PROMPT = """The test class does not work yet. {problem}:
```
{details}
```
Fix the test class (never the class under test) and return the complete corrected file."""

# order of preference when the repair loop ends: keep the best version, not necessarily the last one
RANK = {"passed": 0, "not_checked": 0, "tests_fail": 1, "compile_error": 2, "build_error": 3,
        "timeout": 4, "jvm_crash": 5, "too_long": 6, "no_code": 7}

ERR_RE = re.compile(r"\[ERROR\]\s+((?:[A-Za-z]:)?[^\[\]]*?\.java):\[(\d+),(\d+)\]\s*(.*)")


# --------------------------------------------------------------------------- ollama
def ollama(host, path, payload, timeout):
    req = urllib.request.Request(host.rstrip("/") + path, data=json.dumps(payload).encode(),
                                 headers={"Content-Type": "application/json"})
    with urllib.request.urlopen(req, timeout=timeout) as r:
        return json.loads(r.read().decode("utf-8"))


def ollama_get(host, path):
    with urllib.request.urlopen(host.rstrip("/") + path, timeout=30) as r:
        return json.loads(r.read().decode("utf-8"))


def model_info(host, model):
    info = {"ollama_version": "", "model_digest": "", "model_family": "", "model_parameters": "",
            "model_quantization": "", "thinking_capable": False}
    try:
        info["ollama_version"] = ollama_get(host, "/api/version").get("version", "")
        for m in ollama_get(host, "/api/tags").get("models", []):
            if m.get("name", "").lower() == model.lower() or m.get("model", "").lower() == model.lower():
                info["model_digest"] = m.get("digest", "")
        show = ollama(host, "/api/show", {"model": model}, 60)
        d = show.get("details", {})
        info["model_family"] = d.get("family", "")
        info["model_parameters"] = d.get("parameter_size", "")
        info["model_quantization"] = d.get("quantization_level", "")
        info["thinking_capable"] = "thinking" in (show.get("capabilities") or [])
    except (urllib.error.URLError, OSError) as e:
        sys.exit(f"!! Cannot reach Ollama at {host} ({e}). Start the Ollama app and try again.")
    except urllib.error.HTTPError as e:
        sys.exit(f"!! Ollama does not know the model '{model}' ({e}). Check `ollama list`.")
    return info


def chat(args, messages, think_flag, label=""):
    """One model call, streamed so the progress (tokens, seconds) is visible while it runs."""
    payload = {"model": args.model, "messages": messages, "stream": True,
               "options": {"temperature": args.temperature, "seed": args.seed, "num_ctx": args.num_ctx,
                           "num_predict": args.max_tokens}}
    if think_flag is not None:
        payload["think"] = think_flag
    start = time.time()
    req = urllib.request.Request(args.host.rstrip("/") + "/api/chat", data=json.dumps(payload).encode(),
                                 headers={"Content-Type": "application/json"})
    parts, chunks, final, last_print = [], 0, {}, 0.0
    waiting = threading.Event()

    def heartbeat():  # shows the elapsed time even before the first token arrives
        while not waiting.wait(5):
            if chunks == 0:
                print(f"\r      {label} waiting for the model (loading / reading prompt) ... "
                      f"{time.time() - start:5.0f}s   ", end="", flush=True)
    threading.Thread(target=heartbeat, daemon=True).start()
    try:
        r = urllib.request.urlopen(req, timeout=args.request_timeout)
    except Exception:
        waiting.set()
        raise
    with r:
        for line in r:
            if not line.strip():
                continue
            msg = json.loads(line.decode("utf-8"))
            if msg.get("error"):
                raise urllib.error.URLError(msg["error"])
            parts.append(msg.get("message", {}).get("content", ""))
            chunks += 1
            now = time.time()
            if now - last_print > 1 or msg.get("done"):
                state = "loading model / reading prompt" if chunks <= 1 and not parts[-1] else f"{chunks} tokens"
                print(f"\r      {label} {state} ... {now - start:5.0f}s   ", end="", flush=True)
                last_print = now
            if msg.get("done"):
                final = msg
                break
    waiting.set()
    print(f"\r      {label} answer: {final.get('eval_count', chunks)} tokens in {time.time() - start:.0f}s"
          + " " * 30)
    return {"text": "".join(parts), "tokens_in": final.get("prompt_eval_count", 0) or 0,
            "tokens_out": final.get("eval_count", 0) or 0, "seconds": round(time.time() - start, 2),
            "truncated": final.get("done_reason") == "length"}


# --------------------------------------------------------------------------- code helpers
def extract_java(text, package, test_class):
    """Take the java code block from the answer and make package/class name match."""
    text = re.sub(r"<think>.*?</think>", "", text, flags=re.S)
    blocks = re.findall(r"```(?:java)?\s*\n(.*?)```", text, flags=re.S)
    code = max(blocks, key=len) if blocks else text
    code = code.strip()
    if "class " not in code:
        return None
    if re.search(r"^\s*package\s+[\w.]+\s*;", code, re.M):
        code = re.sub(r"^\s*package\s+[\w.]+\s*;", f"package {package};", code, count=1, flags=re.M)
    else:
        code = f"package {package};\n\n{code}"
    m = re.search(r"^(?:public\s+|final\s+|abstract\s+)*class\s+(\w+)", code, re.M)
    if m and m.group(1) != test_class:
        code = re.sub(rf"\b{re.escape(m.group(1))}\b", test_class, code)
    return code + "\n"


def strip_comments(java):
    """Remove // and /* */ comments (string and char literals are kept intact).

    The benchmark classes carry researcher notes in their comments (what each class is meant to
    test, which result is expected). The model must not see them - Randoop and EvoSuite don't
    either - so every source is sent without comments."""
    out, i, n = [], 0, len(java)
    while i < n:
        c = java[i]
        if c in "\"'":
            j = i + 1
            while j < n and java[j] != c:
                j += 2 if java[j] == "\\" else 1
            out.append(java[i:j + 1])
            i = j + 1
        elif java.startswith("//", i):
            while i < n and java[i] != "\n":
                i += 1
        elif java.startswith("/*", i):
            end = java.find("*/", i + 2)
            i = n if end < 0 else end + 2
        else:
            out.append(c)
            i += 1
    text = "".join(out)
    text = re.sub(r"[ \t]+\n", "\n", text)            # trailing spaces left by removed comments
    return re.sub(r"\n{3,}", "\n\n", text).strip() + "\n"


def subjects(module_dir):
    src = module_dir / "src/main/java"
    all_files = {f.stem: f for f in src.rglob("*.java")}
    targets = []
    for f in sorted(src.rglob("*.java")):
        if "/support/" in f.as_posix():
            continue
        pkg = re.search(r"^\s*package\s+([\w.]+)\s*;", f.read_text(encoding="utf-8"), re.M)
        targets.append((pkg.group(1) if pkg else "", f.stem, f))
    return targets, all_files


def context_files(code, own_name, all_files):
    """Other project classes the code (without comments) refers to by name (one level)."""
    used = []
    for name, f in sorted(all_files.items()):
        if name != own_name and re.search(rf"\b{re.escape(name)}\b", code):
            used.append(f)
    return used


# --------------------------------------------------------------------------- check one test class
def check(args, module_dir, work_root, package, test_class, code):
    """Compile and run one test class. Returns (status, details)."""
    work = work_root / test_class
    shutil.rmtree(work, ignore_errors=True)
    target = work / package.replace(".", "/") / f"{test_class}.java"
    target.parent.mkdir(parents=True, exist_ok=True)
    target.write_text(code, encoding="utf-8")
    reports = module_dir / "target/surefire-reports"
    shutil.rmtree(reports, ignore_errors=True)
    cmd = [args.mvn, "-B", "-ntp", "-q", "-f", str(module_dir / "pom.xml"), "test",
           f"-Dsuite.dir={work}", f"-Dtest={test_class}", "-Djacoco.skip=true",
           "-Dsurefire.failIfNoSpecifiedTests=false"]
    try:
        out = subprocess.run(cmd, cwd=ROOT, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                             text=True, errors="replace", timeout=args.check_timeout).stdout
    except subprocess.TimeoutExpired:
        return "timeout", f"The tests did not finish within {args.check_timeout} seconds (endless loop or blocking call?)."
    if "forked VM terminated" in out or "There was a timeout in the fork" in out:
        return "jvm_crash", ("The test JVM crashed or was killed before the tests finished "
                             "(Surefire: 'The forked VM terminated without properly saying goodbye'). "
                             "Typical causes: mocking JDK classes such as java.lang.Math, System or String "
                             "with mockStatic, calling System.exit, or an endless loop.")
    errors = [f"line {m.group(2)}: {m.group(4).strip()}" for m in ERR_RE.finditer(out)
              if m.group(1).endswith(f"{test_class}.java")]
    if errors:
        return "compile_error", "\n".join(dict.fromkeys(errors))[:4000]
    failures = []
    for xml in reports.glob("TEST-*.xml"):
        try:
            root = ET.parse(xml).getroot()
        except ET.ParseError:
            continue
        for tc in root.iter("testcase"):
            for tag in ("failure", "error"):
                el = tc.find(tag)
                if el is not None:
                    msg = (el.get("message") or "").strip().replace("\n", " ")[:300]
                    failures.append(f"{tc.get('name')}: {el.get('type', '')}: {msg}")
    if failures:
        return "tests_fail", "\n".join(failures)[:4000]
    if not list(reports.glob("TEST-*.xml")):
        tail = "\n".join(out.strip().splitlines()[-15:])
        return "build_error", tail[:2000] or "Maven produced no test report."
    return "passed", ""


# --------------------------------------------------------------------------- main
def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--model", required=True, help="Ollama model name exactly as in `ollama list`")
    ap.add_argument("--prompt", choices=["naive", "full"], default="full")
    ap.add_argument("--module", default="benchmark-core")
    ap.add_argument("--seed", type=int, default=42)
    ap.add_argument("--temperature", type=float, default=0.2)
    ap.add_argument("--max-repairs", type=int, default=3, help="repair rounds for --prompt full")
    ap.add_argument("--num-ctx", type=int, default=16384, help="context window in tokens")
    ap.add_argument("--max-tokens", type=int, default=8192,
                    help="maximum answer length; stops models that repeat themselves endlessly")
    ap.add_argument("--think", choices=["off", "on"], default="off",
                    help="reasoning mode for models that support it (default off)")
    ap.add_argument("--classes", nargs="*", help="only these simple class names (default: all)")
    ap.add_argument("--out", default=None, help="output folder (default: <module>/suites/llm-<model>-<prompt>)")
    ap.add_argument("--host", default="http://localhost:11434")
    ap.add_argument("--request-timeout", type=int, default=1800, help="seconds per model call")
    ap.add_argument("--check-timeout", type=int, default=300, help="seconds per compile+test check")
    ap.add_argument("--mvn", default="mvn")
    args = ap.parse_args()

    module_dir = ROOT / args.module
    slug = re.sub(r"[^a-z0-9]+", "-", args.model.split("/")[-1].lower()).strip("-")
    out = Path(args.out).resolve() if args.out else module_dir / "suites" / f"llm-{slug}-{args.prompt}"
    logs, work_root = out / "_logs", out / "_work"
    for f in out.rglob("*.java"):
        f.unlink()
    for f in ("generation_meta.txt", "gen_times.csv", "llm_calls.csv"):
        (out / f).unlink(missing_ok=True)
    shutil.rmtree(logs, ignore_errors=True)
    logs.mkdir(parents=True, exist_ok=True)

    info = model_info(args.host, args.model)
    think_flag = (args.think == "on") if info["thinking_capable"] else None
    max_repairs = args.max_repairs if args.prompt == "full" else 0
    targets, all_files = subjects(module_dir)
    if args.classes:
        targets = [t for t in targets if t[1] in args.classes]

    print(f"== LLM {args.model} | prompt {args.prompt} | seed {args.seed} | temperature {args.temperature}"
          f" | repairs {max_repairs} | {info['model_parameters']} {info['model_quantization']}"
          f" | Ollama {info['ollama_version']}")
    print(f"   output: {out.relative_to(ROOT) if out.is_relative_to(ROOT) else out}")
    # warm-up: load the model and check it answers at all, before the real work starts
    print("   warm-up: loading the model and asking for a one-word answer ...", flush=True)
    try:
        w = chat(args, [{"role": "user", "content": "Reply with the single word OK."}], think_flag, "warm-up:")
    except (urllib.error.URLError, OSError) as e:
        sys.exit(f"!! The model did not answer the warm-up ({e}).")
    if w["seconds"] > 120:
        print(f"   !! The warm-up took {w['seconds']:.0f}s. The model is probably not fully in GPU memory.\n"
              "      Check `ollama ps` (PROCESSOR should say 100% GPU) and close LM Studio or other apps "
              "that hold a model.")
    print("   compiling the classes under test ...", flush=True)
    subprocess.run([args.mvn, "-B", "-ntp", "-q", "-f", str(module_dir / "pom.xml"), "-DskipTests", "compile"],
                   cwd=ROOT, check=True)

    calls_f = open(out / "llm_calls.csv", "w", newline="", encoding="utf-8")
    calls = csv.writer(calls_f)
    calls.writerow(["class", "round", "tokens_in", "tokens_out", "seconds", "outcome", "details"])
    times = [("class", "seconds")]
    total_in = total_out = total_rounds = 0
    final_status = {}
    t_start = time.time()

    for package, name, src_file in targets:
        test_class = f"{name}Test"
        fq = f"{package}.{name}" if package else name
        source = strip_comments(src_file.read_text(encoding="utf-8"))
        if args.prompt == "naive":
            messages = [{"role": "user", "content": NAIVE_PROMPT.format(
                test_class=test_class, package=package, source=source)}]
        else:
            ctx = "".join(f"\n```java\n// {f.name}\n{strip_comments(f.read_text(encoding='utf-8'))}```\n"
                          for f in context_files(source, name, all_files))
            messages = [{"role": "system", "content": FULL_SYSTEM},
                        {"role": "user", "content": FULL_PROMPT.format(
                            test_class=test_class, package=package, fq=fq, source=source,
                            context=CONTEXT_PROMPT.format(files=ctx) if ctx else "")}]
        log = [f"# {fq} - {args.model} - prompt {args.prompt} - seed {args.seed}\n"]
        cls_start = time.time()
        code, status, used = None, "no_code", 0
        best = (99, None, "no_code")           # (rank, code, status): lower rank = better
        for rnd in range(max_repairs + 1):
            used = rnd
            log.append(f"\n## Round {rnd} - prompt\n\n{messages[-1]['content']}\n")
            try:
                reply = chat(args, messages, think_flag, f"{name} round {rnd}:")
            except (urllib.error.URLError, OSError) as e:
                status = "llm_error"
                calls.writerow([fq, rnd, 0, 0, 0, status, str(e)[:300]])
                log.append(f"\n!! model call failed: {e}\n")
                break
            total_in += reply["tokens_in"]
            total_out += reply["tokens_out"]
            log.append(f"\n## Round {rnd} - answer ({reply['tokens_in']} in / {reply['tokens_out']} out tokens, "
                       f"{reply['seconds']}s)\n\n{reply['text']}\n")
            new_code = extract_java(reply["text"], package, test_class)
            if reply.get("truncated") and new_code is None:
                status, details = "too_long", (f"The answer was cut off after {args.max_tokens} tokens "
                                               "without a complete Java file. Write a shorter test class.")
            elif new_code is None:
                status, details = "no_code", "The answer contained no Java class."
            else:
                code = new_code
                if args.prompt == "naive":
                    status, details = "not_checked", ""
                else:
                    print(f"      {name} round {rnd}: compiling and running the tests ...", flush=True)
                    status, details = check(args, module_dir, work_root, package, test_class, code)
                    print(f"      {name} round {rnd}: {status}", flush=True)
            rank = RANK.get(status, 9)
            if new_code is not None and rank <= best[0]:
                best = (rank, new_code, status)
            calls.writerow([fq, rnd, reply["tokens_in"], reply["tokens_out"], reply["seconds"], status,
                            details.replace("\n", " | ")[:500]])
            calls_f.flush()
            if rnd > 0:
                total_rounds += 1
            if status in ("passed", "not_checked") or rnd == max_repairs:
                break
            problem = {"compile_error": "It does not compile", "tests_fail": "Some tests fail",
                       "jvm_crash": "The test run crashed", "too_long": "The answer was too long",
                       "timeout": "The tests hang", "build_error": "The build failed",
                       "no_code": "Your answer contained no Java code"}.get(status, "It does not work")
            log.append(f"\n## Round {rnd} - check: {status}\n\n```\n{details}\n```\n")
            messages += [{"role": "assistant", "content": reply["text"]},
                         {"role": "user", "content": REPAIR_PROMPT.format(problem=problem, details=details)}]
        secs = round(time.time() - cls_start, 2)
        if best[1] is not None and best[2] != status:
            log.append(f"\n## Kept the best round's version ({best[2]}) instead of the last one ({status})\n")
            code, status = best[1], best[2]
        final_status[fq] = status
        if code:
            target = out / package.replace(".", "/") / f"{test_class}.java"
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(code, encoding="utf-8")
        (logs / f"{name}.md").write_text("".join(log), encoding="utf-8")
        times.append((fq, secs))
        print(f"   {fq:40} {secs:8.1f}s  repairs {used}  {status}")

    calls_f.close()
    shutil.rmtree(work_root, ignore_errors=True)
    total = round(time.time() - t_start, 1)
    with open(out / "gen_times.csv", "w", newline="", encoding="utf-8") as f:
        csv.writer(f).writerows(times)
    counts = {s: list(final_status.values()).count(s) for s in sorted(set(final_status.values()))}
    meta = {
        "tool": "llm", "model": args.model, "prompt_version": args.prompt, "seed": args.seed,
        "temperature": args.temperature, "max_repairs": max_repairs, "num_ctx": args.num_ctx,
        "max_tokens": args.max_tokens,
        "think": args.think if info["thinking_capable"] else "n/a",
        "model_family": info["model_family"], "model_parameters": info["model_parameters"],
        "model_quantization": info["model_quantization"], "model_digest": info["model_digest"][:16],
        "ollama_version": info["ollama_version"], "gen_time_s": total,
        "tokens_in": total_in, "tokens_out": total_out, "repair_rounds_total": total_rounds,
        "classes_final_status": " ".join(f"{k}={v}" for k, v in counts.items()),
        "source_comments": "stripped",
    }
    (out / "generation_meta.txt").write_text("".join(f"{k}={v}\n" for k, v in meta.items()), encoding="utf-8")

    rel = out.relative_to(ROOT) if out.is_relative_to(ROOT) else out
    print(f"== Done in {total}s | tokens in {total_in}, out {total_out} | repair rounds {total_rounds} | {meta['classes_final_status']}")
    print("\nMeasure the tests with (settings are read from generation_meta.txt):")
    print(f"  python3 scripts/run_iteration.py --tool llm --module {args.module} --suite {rel} --iteration 1")


if __name__ == "__main__":
    main()
