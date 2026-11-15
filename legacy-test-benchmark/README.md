# Legacy test-generation benchmark

A small, controlled set of Java classes for comparing unit test generators (no tests, golden master, Randoop, EvoSuite, LLMs) before running the same pipeline on a real legacy project. Each class isolates one testability factor.

| ID | Class | Factor it isolates |
|---|---|---|
| B01 | `PureCalculator` | Pure logic, few branches (easy case / upper bound) |
| B02 | `BranchyValidator` | High cyclomatic complexity, flat (low cognitive complexity) |
| B03 | `NestedRules` | Similar cyclomatic complexity to B02, but deeply nested (high cognitive complexity) |
| B04 | `InjectedService` | Dependencies injected through the constructor (testable) |
| B05 | `HardWiredService` | **Same logic as B04**, but `new` + file I/O + singleton (legacy) |
| B06 | `TimeAndRandom` | System clock, unseeded `Random`, file writes (non-determinism) |
| B07 | `StatefulAccount` | Behaviour depends on state and call order |
| B08 | `ExceptionHeavy` | Edge cases, nulls, checked/unchecked exceptions |
| B09 | `ModernJavaFeatures` | Records, sealed types, pattern `switch` (Java 21) |
| B10 | `StaticCounterRegistry` | Static mutable state shared between tests (ids, counters, a closed flag) |
| B11 | `ShippingPolicy` | Inheritance: abstract base with a template method, two subclasses, overridden hooks |
| B12 | `IbanValidator` | Complex logic in private methods, reachable only through one public method |
| B13 | `OrderStatistics` | Collections and generics: object graphs as input, sorting with ties, nulls, defensive copies |
| B14 | `InvoiceProcessor` | The "God method": 100+ lines that parse, validate, calculate and format in one pass |
| B15 | `CustomerRepository` | Legacy JDBC DAO: `DriverManager` connection from a system property, hand-mapped `ResultSet`, SQL by string concatenation, `SQLException` wrapped |

Support classes in `benchmark.support` (`PriceRepository`, `AuditSink`, `DatabasePriceRepository`, `AuditLog`) are dependencies of B04/B05. They are not targets themselves and are excluded from mutation testing.

## Layout

```
benchmark-core/     B01-B08 and B10-B14, compiled with --release 8
  src/main/java     classes under test
  src/test/java     hand-written reference suite (human baseline, JUnit 5)
  suites/           put generated suites here, e.g. suites/randoop, suites/evosuite, suites/llm-<model>
benchmark-modern/   B09, compiled with --release 21
```

**Why Java 8 bytecode for the core module:** the same `.class` files can then be used by every tool: EvoSuite (JDK 8), Kex/UnitTestBot (JDK 17), Randoop (JDK 21+), and JaCoCo/PIT on JDK 25. All tools see identical bytecode, which keeps the comparison fair. B09 sits in a separate module because it can't be compiled for older Java; it shows which tools can handle modern bytecode at all.

## Running

Run with JDK 25 (or 21):

```bash
mvn verify                                   # compile + reference suite + JaCoCo
mvn -pl benchmark-core verify -Dsuite.dir=suites/randoop -Dmaven.test.failure.ignore=true
mvn -pl benchmark-core test-compile org.pitest:pitest-maven:mutationCoverage -Dsuite.dir=suites/randoop
```

Results:
- Test results: `target/surefire-reports/`
- Coverage per class: `target/site/jacoco/jacoco.csv`
- Mutations: `target/pit-reports/mutations.csv`

Dependency versions are properties in the root `pom.xml`; bump them if Maven can't resolve one. Minimum versions for JDK 25: JaCoCo 0.8.14, PIT 1.25.8, Mockito 5.22.

## Generating tests with Randoop

```bash
bash scripts/generate_randoop.sh            # 60 s per class, seed 42
bash scripts/generate_randoop.sh 60 7       # next iteration with another seed
```

The script downloads Randoop 4.3.4 into `tools/` the first time, compiles the classes, and runs Randoop once per class with the same time budget and seed. It writes the tests to `benchmark-core/suites/randoop/` and the generation times to `gen_times.csv` in the same folder. At the end it prints the exact `run_iteration.py` command to measure the suite. Error-revealing tests are switched off, so only regression tests are kept. Without a limit, Randoop writes every test it finds, often thousands per class (about 28,000 in total at 60 s per class). That makes PIT slow. An optional 4th argument caps the number of tests per class, e.g. `bash scripts/generate_randoop.sh 60 42 benchmark-core 500`; record the cap in the thesis. Randoop officially supports Java 8–24; if it fails on JDK 25, set `RANDOOP_JAVA` to an older JDK's `java`.

## Generating tests with EvoSuite

```bash
bash scripts/generate_evosuite.sh           # 60 s search budget per class, seed 42
bash scripts/generate_evosuite.sh 60 7      # next iteration with another seed
```

EvoSuite 1.2.0 only runs on JDK 8 (or 11). The script finds one automatically: first `EVOSUITE_JAVA_HOME`, then macOS `java_home`, then SDKMAN. On Apple Silicon, install a JDK 8 with `sdk install java 8.0.xxx-zulu` (see `sdk list java`) and answer **n** when asked to make it the default. Only generation uses the old JDK; your project is still built and measured on JDK 25.

The tests are generated as plain JUnit 4 with these settings:
- `-Dno_runtime_dependency=true`, `-Dreplace_calls=false` and `-Dfilter_sandbox_tests=true`. EvoSuite's runtime, with its sandbox and its clock/file-system mocking, depends on the SecurityManager, which was removed in JDK 24+.

Consequences to mention in the thesis:
- **Non-determinism:** EvoSuite can't mock the clock or `Random`, so `TimeAndRandom` gets tests that assert one random value and then fail on every later run.
- **Interfaces:** functional mocking is off by default (`p_functional_mocking=0`), so EvoSuite can't create the `PriceRepository` interface that `InjectedService` needs, and covers it poorly.

## Golden master (baseline B1)

```bash
bash scripts/approve_golden_master.sh            # record the current behaviour (once)
python3 scripts/run_iteration.py --tool golden-master --suite benchmark-core/suites/golden-master
```

The golden master is in `benchmark-core/suites/golden-master/`. Each class gets a `*GoldenMasterTest`. Each test calls the class for every combination of a fixed set of inputs and writes everything it returns or throws, one line per combination, to an `*.approved.txt` file. The approve script records these files once. From then on, the tests fail as soon as any output changes. The comparison is done by `GoldenMaster.java`, a small helper that follows the same principle as ApprovalTests' `CombinationApprovals`. Its approved files come from the classpath, so it works the same in Surefire, in PIT and on the copied suites.

**Methodology:**
- **Input rule:** typical domain values plus simple edge values (null, empty, 0, negative, very large), chosen **without analysing the code's branches**. For example, there is no customer id starting with `"X"`, because nothing tells a user such ids are special.
- **`StatefulAccount`:** all sequences of 3 operations.
- **`TimeAndRandom`:** non-deterministic output (coupon codes, dates, timestamps) is *scrubbed* to placeholders. Only the clock branch that is active at test time is exercised.
- **When to re-approve:** only when you deliberately change the benchmark classes.
- **B15 (JDBC):** H2 is on the test classpath only. The reference suite and the golden master point `benchmark.jdbc.url` at an in-memory H2 database (`jdbc:h2:mem:...;DB_CLOSE_DELAY=-1`) and create the `CUSTOMER` table themselves. A generated test can do the same, or mock `DriverManager`/`Connection` with Mockito; tools that do neither get a `DataAccessException` from every call.
- **B10–B14:** `StaticCounterRegistry` is recorded as sequences of four operations from a reset state; `ShippingPolicy` only through its two shipped subclasses (a golden master records existing behaviour, it does not invent subclasses); `InvoiceProcessor` records the whole report text for 5 customer types × 6 countries × 8 line sets × both flags.

## LLM-generated tests

```bash
# smoke test: one model, one class
python3 scripts/generate_llm.py --model "Qwen3-Coder:latest" --prompt full --classes NestedRules

# all models x both prompts, iteration 1 (then 2..5 the same way)
caffeinate -i bash scripts/run_llm.sh 1 1
caffeinate -i bash scripts/run_llm.sh 2 5
```

`generate_llm.py` calls a local model through Ollama and writes one `<Class>Test.java` per benchmark class to `benchmark-core/suites/llm-<model>-<prompt>/`. There are two prompt strategies:

- **`naive` (B3):** one request per class, "write JUnit 5 tests for this class" plus its source.
- **`full` (the methodology):** rules (JUnit 5 and Mockito 5, how to handle hard-wired dependencies, no time- or random-dependent assertions), the class, and the source of the project types it uses. Then a repair loop: the test is compiled and run, and compiler errors or failing tests are sent back to the model, up to 3 rounds.

**Fixed settings:** temperature 0.2, seed = 41 + iteration, context 16,384 tokens, reasoning ("think") off.

**Comments are stripped:** all comments are removed from the source sent to the model, because the benchmark classes carry researcher notes in theirs. Randoop and EvoSuite don't see comments either.

**Recorded per run** (in `generation_meta.txt`, read automatically by `run_iteration.py`): model, family, parameters, quantization, digest, Ollama version, prompt, seed, temperature, tokens in and out, generation time, repair rounds, and the final status per class.

**Kept for the thesis:**
- `llm_calls.csv`: one row per model call, with its tokens, time, outcome and errors.
- `_logs/<Class>.md`: the full conversation per class, useful for examples.

## More iterations of the baselines

```bash
caffeinate -i bash scripts/run_baselines.sh          # iterations 2-5, Randoop + EvoSuite (~1 h)
bash scripts/run_baselines.sh 2 5 evosuite           # only one tool
```

Seed = 41 + iteration, so iteration 1 = seed 42. The settings are fixed to match iteration 1: 60 s per class, and Randoop capped at 500 tests per class. Output is logged to `results/baselines-<date>.log`. The report is rebuilt at the end.

**How the data stays consistent:**
- **Settings follow the tests automatically:** every generator writes `generation_meta.txt` next to its tests (tool, version, seed, budget, cap, Java version, generation time), and `run_iteration.py` records it on its own.
- **Mixed settings are flagged:** if one tool's runs have different settings, the report shows a warning at the top instead of silently averaging them, and the summary table shows a *Settings* column.
- **Duplicates are flagged:** `run_iteration.py` warns if the same tool, iteration and seed was already recorded.

## Recording results (one iteration = one call)

`scripts/run_iteration.py` builds and measures one suite and **appends** every result to CSV files in `results/`. It uses only the Python 3 standard library and needs `mvn` on PATH. Run it with the JDK you want to measure on (JDK 25).

```bash
# reference suite (human baseline)
python3 scripts/run_iteration.py --tool reference

# a generated suite, with generation metadata
python3 scripts/run_iteration.py --tool randoop --model 4.3.4 \
    --suite benchmark-core/suites/randoop --iteration 1 --seed 42 \
    --budget-s 60 --gen-time 480

# an LLM suite, with tokens, per-class generation times and any extra parameters
python3 scripts/run_iteration.py --tool llm --model qwen2.5-coder:14b --prompt-version v1 \
    --suite benchmark-core/suites/llm-qwen --iteration 3 --tokens-in 15300 --tokens-out 9200 \
    --gen-times-file gen_times.csv --meta temperature=0.2 --meta repair_rounds=3
```

What it does:
1. Copies the suite to `results/raw/<run_id>/suite/`, so you keep exactly what was measured.
2. Compiles it. Test files that don't compile are removed one at a time and recorded with their compiler error, so one broken LLM test doesn't sink the whole suite.
3. Runs the tests with JaCoCo, then PIT.
4. Appends rows to the CSV files below and archives all raw reports and the Maven log.

| File | One row per | Main columns |
|---|---|---|
| `runs.csv` | iteration | tool, model, prompt version, seed, budget, generation time, tokens, cost, extra parameters; OS, CPU, RAM, Java and Maven versions; compile stats; phase durations; totals for tests, pass rate, line/branch/instruction/method coverage, mutants by status, mutation score, test strength |
| `classes.csv` | run × class | source LOC/NCLOC, cyclomatic complexity, all JaCoCo counters (missed/covered/total), coverage ratios, test files and static test metrics, test results, mutants by every PIT status, mutation score, test strength, per-class generation time |
| `methods.csv` | run × method | JaCoCo counters per method, mutants per method |
| `tests.csv` | run × test case | subject class, status, time, failure type and message, flaky reruns |
| `test_files.csv` | run × test file | compiled?, compile errors, framework (JUnit 4/5), number of @Test methods, assertions, mock usage, exception checks, LOC, SHA-256 |
| `mutants.csv` | run × mutant | class, method, line, mutator, status, killing test |

- **Joining files:** every row carries `run_id`, so you can join the files and drop any column you don't need.
- **Test-to-class mapping:** tests are attributed to a class by name prefix (`NestedRules...Test` → `NestedRules`). Randoop and EvoSuite output follow this convention if generated per class.
- **Totals in `runs.csv`:** these count only the classes under test; `benchmark.support` is excluded.
- **Excel with Slovak locale:** add `--delimiter ";"` so the CSV opens correctly. Use the same delimiter for every run.
- **Cognitive complexity:** this isn't computed by the script. Export it from SonarQube once (it doesn't change between runs) and join it on the class name.
- **PIT settings:** PIT runs on all CPU cores and prints its progress. It stops after `--pit-timeout-min` minutes (default 60); the run is then still recorded with `pit_status=timeout` and no mutation data. Use `--no-pit` to skip it.
- **`--gen-times-file`:** a CSV with columns `class,seconds`. The class can be the simple or the fully qualified name.

## Charts (HTML report)

```bash
python3 scripts/make_report.py      # reads results/*.csv → results/report.html
open results/report.html             # macOS
```

`run_iteration.py` rebuilds the report automatically after every run (`--no-report` turns this off). The report is a single offline HTML file with no external libraries. Re-run the script after each new iteration. At the top you can pick the metric, the module and which tools/models to show. It contains:

- **Summary table:** mean ± standard deviation per tool/model.
- **Tool/model overview:** the selected metric per tool/model; whiskers show the min–max across iterations.
- **Test outcomes:** passed, failed, error, skipped and removed (non-compiling) test files.
- **Per-class chart and heatmap:** the selected metric for every class.
- **Designed comparisons:** B02 vs B03 and B04 vs B05.
- **Complexity scatter:** cyclomatic complexity vs the selected metric, one panel per tool/model.
- **PIT results:** mutant outcomes, and which mutation operators survive.
- **Failures and runs:** the most common failure types, and a table of all runs.

Every chart has **SVG** (vector, for the thesis) and **PNG** download buttons. The page follows the system light/dark setting; the button toggles it, and downloads use the current theme. Use light mode for the thesis.

## Notes for the methodology

- The reference suite reaches 100 % line and branch coverage on every class except `TimeAndRandom`, `InvoiceProcessor` (98.8 % branch) and `CustomerRepository` (the ignored exception in `close()` is never triggered by H2). There, only the happy-hour branch active at run time can be covered, which is the point of that class.
- B02 and B03 have similar cyclomatic complexity, so the pair separates the effect of cognitive complexity.
- B04 and B05 contain identical business logic, so any difference in results comes from testability alone. B05 is also the input for the refactoring experiment ("can the tool/LLM turn B05 into B04?").
- The classes were written for this benchmark, not taken from textbooks, to reduce the risk that LLMs have seen them during training.
