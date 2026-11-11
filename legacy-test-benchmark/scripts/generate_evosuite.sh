#!/usr/bin/env bash
# Generate EvoSuite tests for every benchmark class (one EvoSuite run per class).
#
# Usage (from the project root):
#   bash scripts/generate_evosuite.sh [budget_seconds_per_class] [seed] [module]
#   bash scripts/generate_evosuite.sh                # 60 s search budget per class, seed 42
#   bash scripts/generate_evosuite.sh 60 7           # another iteration with seed 7
#
# EvoSuite 1.2.0 (last release, 2021) only runs on JDK 8 (or 11). The script finds one
# automatically (EVOSUITE_JAVA_HOME, then macOS java_home, then SDKMAN). Your project is still
# built and measured with your normal JDK (25); only the generation step uses the old JDK.
#   Apple Silicon:  sdk install java 8.0.472-zulu      (exact name: sdk list java | grep zulu)
#   Or point to one: EVOSUITE_JAVA_HOME=/path/to/jdk8 bash scripts/generate_evosuite.sh
#
# Tests are generated so they are plain JUnit 4 and run on JDK 25 without EvoSuite's runtime:
#   -Dno_runtime_dependency=true   no EvoRunner/scaffolding (its sandbox needs the SecurityManager,
#                                  which no longer exists in JDK 24+)
#   -Dreplace_calls=false          don't mock the clock/Random (mocked values can't be reproduced
#                                  without the runtime)
#   -Dfilter_sandbox_tests=true    drop tests that only work inside EvoSuite's sandbox
# This switches off EvoSuite's environment mocking; mention it in the methodology.
#
# Output:
#   <module>/suites/evosuite/                 generated tests (*_ESTest.java; old ones are replaced)
#   <module>/suites/evosuite/gen_times.csv    generation wall time per class
#   <module>/suites/evosuite/_report/         EvoSuite's own statistics.csv (its coverage estimate)
#   <module>/suites/evosuite/_logs/           EvoSuite output per class
set -euo pipefail

BUDGET="${1:-60}"
SEED="${2:-42}"
MODULE="${3:-benchmark-core}"
EVOSUITE_VERSION="1.2.0"

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
TOOLS="$ROOT/tools"
JAR="$TOOLS/evosuite-$EVOSUITE_VERSION.jar"
OUT="$ROOT/$MODULE/suites/evosuite"

now() { python3 -c 'import time; print(f"{time.time():.3f}")'; }

# 1. Find a JDK 8 (preferred) or 11. A Java 8 must be a full JDK with lib/tools.jar
#    (an old Oracle JRE, e.g. the browser plug-in, is not enough).
usable() {
  local h="$1" v
  [ -x "$h/bin/java" ] || return 1
  v=$("$h/bin/java" -version 2>&1 | grep -v JAVA_TOOL | head -1)
  case "$v" in
    *'"1.8.'*) [ -f "$h/lib/tools.jar" ] ;;
    *'"11.'*)  return 0 ;;
    *) return 1 ;;
  esac
}
find_old_jdk() {
  if [ -n "${EVOSUITE_JAVA_HOME:-}" ]; then echo "$EVOSUITE_JAVA_HOME"; return; fi
  local d
  for prefix in 8 11; do                                   # SDKMAN first
    for d in "$HOME"/.sdkman/candidates/java/${prefix}.*; do
      for h in "$d" "$d"/Contents/Home "$d"/*.jdk/Contents/Home; do   # macOS bundle layouts
        if usable "$h"; then echo "$h"; return; fi
      done
    done
  done
  if [ -x /usr/libexec/java_home ]; then                   # then every JDK macOS knows about
    while IFS= read -r d; do
      if usable "$d"; then echo "$d"; return; fi
    done < <(/usr/libexec/java_home -V 2>&1 | grep -oE '/[^"]*Home$' || true)
  fi
  return 1
}
if ! JDK=$(find_old_jdk); then
  echo "!! No JDK 8 (with lib/tools.jar) or JDK 11 found. EvoSuite $EVOSUITE_VERSION needs one. Install it with SDKMAN, e.g.:"
  echo "     sdk list java | grep -E ' 8\\.| 11\\.'      # pick a name, on Apple Silicon e.g. 8.0.472-zulu"
  echo "     sdk install java 8.0.472-zulu"
  echo "   (installing does not change your default JDK if you answer 'n' to 'set as default')"
  echo "   or run with EVOSUITE_JAVA_HOME=/path/to/jdk8"
  exit 1
fi
TOOLS_JAR_ARG=()
if [ -f "$JDK/lib/tools.jar" ]; then TOOLS_JAR_ARG=(-Dtools_jar_location="$JDK/lib/tools.jar"); fi
JAVA_VER=$("$JDK/bin/java" -version 2>&1 | grep -v JAVA_TOOL | head -1 | tr -d '"')

# 2. Download EvoSuite once
if [ ! -f "$JAR" ]; then
  echo "== Downloading EvoSuite $EVOSUITE_VERSION ..."
  mkdir -p "$TOOLS"
  curl -fL -o "$JAR" \
    "https://github.com/EvoSuite/evosuite/releases/download/v$EVOSUITE_VERSION/evosuite-$EVOSUITE_VERSION.jar"
fi

# 3. Compile the classes under test with your normal JDK (core module = Java 8 bytecode)
echo "== Compiling $MODULE ..."
mvn -q -B -ntp -f "$ROOT/$MODULE/pom.xml" -DskipTests compile
CLASSES="$ROOT/$MODULE/target/classes"

# 4. Classes under test: top-level classes in src/main/java, without the support package
SRC="$ROOT/$MODULE/src/main/java"
TARGETS=$(cd "$SRC" && find . -name '*.java' ! -path '*/support/*' | sed 's|^\./||; s|\.java$||; s|/|.|g' | sort)

# 5. Clean the output folder (only generated files)
mkdir -p "$OUT/_logs" "$OUT/_work"
find "$OUT" -name '*.java' -delete
rm -rf "$OUT/_report"
echo "class,seconds" > "$OUT/gen_times.csv"
rm -f "$OUT/generation_meta.txt"

echo "== EvoSuite $EVOSUITE_VERSION | budget ${BUDGET}s per class | seed $SEED | $JAVA_VER"
echo "   generation JDK: $JDK"
TOTAL_START=$(now)
FAILED=0
for FQ in $TARGETS; do
  SIMPLE="${FQ##*.}"
  START=$(now)
  # EvoSuite starts a second JVM via PATH/JAVA_HOME, so both must point to the old JDK
  if (cd "$OUT/_work" && JAVA_HOME="$JDK" PATH="$JDK/bin:$PATH" "$JDK/bin/java" -jar "$JAR" \
        -class "$FQ" \
        -projectCP "$CLASSES" \
        -seed "$SEED" \
        -Dsearch_budget="$BUDGET" \
        -Dno_runtime_dependency=true \
        -Dreplace_calls=false \
        -Dfilter_sandbox_tests=true \
        -Dtest_dir="$OUT" \
        -Dreport_dir="$OUT/_report" \
        -Dshow_progress=false \
        ${TOOLS_JAR_ARG[@]+"${TOOLS_JAR_ARG[@]}"} \
        > "$OUT/_logs/$SIMPLE.log" 2>&1) && [ -f "$OUT/${FQ//.//}_ESTest.java" ]; then
    STATUS="ok"
  else
    STATUS="FAILED (see $MODULE/suites/evosuite/_logs/$SIMPLE.log)"
    FAILED=$((FAILED + 1))
  fi
  SECS=$(python3 -c "print(round($(now) - $START, 2))")
  echo "$FQ,$SECS" >> "$OUT/gen_times.csv"
  FILE="$OUT/${FQ//.//}_ESTest.java"
  TESTS=$( [ -f "$FILE" ] && grep -c '@Test' "$FILE" || echo 0 )
  COV=$(grep -E 'Coverage of criterion BRANCH' "$OUT/_logs/$SIMPLE.log" | grep -oE '[0-9]+%' | tail -1 || true)
  printf '   %-40s %7ss  %5s tests  branch %-5s %s\n' "$FQ" "$SECS" "$TESTS" "${COV:--}" "$STATUS"
done
TOTAL=$(python3 -c "print(round($(now) - $TOTAL_START, 1))")
rm -rf "$OUT/_work"

# settings of this generation; run_iteration.py reads them automatically
cat > "$OUT/generation_meta.txt" <<META
tool=evosuite
model=$EVOSUITE_VERSION
seed=$SEED
budget_s=$BUDGET
evosuite_flags=no_runtime_dependency+no_replace_calls+filter_sandbox_tests
generation_jdk=$JAVA_VER
gen_time_s=$TOTAL
failed_classes=$FAILED
META

echo "== Done in ${TOTAL}s, $FAILED class(es) failed. Tests are in $MODULE/suites/evosuite"
echo "   (the branch % above is EvoSuite's own estimate; the real numbers come from the measurement)"
echo
echo "Measure them with (settings are read from generation_meta.txt; change --iteration per repetition):"
echo "  python3 scripts/run_iteration.py --tool evosuite --module $MODULE --suite $MODULE/suites/evosuite --iteration 1"
if [ "$FAILED" -gt 0 ] && [ "$FAILED" -eq "$(echo "$TARGETS" | wc -w)" ]; then exit 1; fi
