#!/usr/bin/env bash
# Generate Randoop tests for every benchmark class (one Randoop run per class).
#
# Usage (from the project root):
#   bash scripts/generate_randoop.sh [budget_seconds_per_class] [seed] [module] [max_tests_per_class]
#   bash scripts/generate_randoop.sh                 # 60 s per class, seed 42, benchmark-core
#   bash scripts/generate_randoop.sh 60 7            # another iteration with seed 7
#   bash scripts/generate_randoop.sh 60 42 benchmark-modern
#   bash scripts/generate_randoop.sh 60 42 benchmark-core 500   # keep at most 500 tests per class
#
# Without a limit Randoop writes every test it found (often thousands per class), which makes
# PIT mutation testing slow. A limit keeps PIT fast but is a change to Randoop's default
# behaviour, so record it (the measurement command below passes it as --meta).
#
# Output:
#   <module>/suites/randoop/                generated JUnit 4 tests (old *.java files are replaced)
#   <module>/suites/randoop/gen_times.csv   generation wall time per class
#   <module>/suites/randoop/_logs/          Randoop output per class
#
# Randoop officially supports Java 8-24. If it fails on your default JDK 25, run it with an
# older JDK, e.g.:  RANDOOP_JAVA=$(sdk home java 21.0.8-tem)/bin/java bash scripts/generate_randoop.sh
set -euo pipefail

BUDGET="${1:-60}"
SEED="${2:-42}"
MODULE="${3:-benchmark-core}"
OUTPUT_LIMIT="${4:-}"
LIMIT_ARG=()
if [ -n "$OUTPUT_LIMIT" ]; then LIMIT_ARG=(--output-limit="$OUTPUT_LIMIT"); fi
RANDOOP_VERSION="4.3.4"

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
TOOLS="$ROOT/tools"
JAR="$TOOLS/randoop-$RANDOOP_VERSION/randoop-all-$RANDOOP_VERSION.jar"
OUT="$ROOT/$MODULE/suites/randoop"
JAVA="${RANDOOP_JAVA:-java}"

now() { python3 -c 'import time; print(f"{time.time():.3f}")'; }

# 1. Download Randoop once
if [ ! -f "$JAR" ]; then
  echo "== Downloading Randoop $RANDOOP_VERSION ..."
  mkdir -p "$TOOLS"
  curl -fL -o "$TOOLS/randoop.zip" \
    "https://github.com/randoop/randoop/releases/download/v$RANDOOP_VERSION/randoop-$RANDOOP_VERSION.zip"
  unzip -q -o "$TOOLS/randoop.zip" -d "$TOOLS"
  rm -f "$TOOLS/randoop.zip"
fi

# 2. Compile the classes under test (no tests)
echo "== Compiling $MODULE ..."
mvn -q -B -ntp -f "$ROOT/$MODULE/pom.xml" -DskipTests compile
CLASSES="$ROOT/$MODULE/target/classes"

# 3. Find the classes under test: top-level classes in src/main/java, without the support package
SRC="$ROOT/$MODULE/src/main/java"
TARGETS=$(cd "$SRC" && find . -name '*.java' ! -path '*/support/*' | sed 's|^\./||; s|\.java$||; s|/|.|g' | sort)

# 4. Clean the output folder (only generated files)
mkdir -p "$OUT/_logs"
find "$OUT" -name '*.java' -delete
echo "class,seconds" > "$OUT/gen_times.csv"
rm -f "$OUT/generation_meta.txt"

echo "== Randoop $RANDOOP_VERSION | budget ${BUDGET}s per class | seed $SEED | max tests per class: ${OUTPUT_LIMIT:-no limit} | $("$JAVA" -version 2>&1 | grep -v JAVA_TOOL | head -1)"
TOTAL_START=$(now)
FAILED=0
for FQ in $TARGETS; do
  SIMPLE="${FQ##*.}"
  PKG="${FQ%.*}"
  START=$(now)
  if "$JAVA" -classpath "$CLASSES:$JAR" randoop.main.Main gentests \
      --testclass="$FQ" \
      --time-limit="$BUDGET" \
      --randomseed="$SEED" \
      --junit-output-dir="$OUT" \
      --junit-package-name="$PKG" \
      --regression-test-basename="${SIMPLE}RandoopTest" \
      --no-error-revealing-tests=true \
      ${LIMIT_ARG[@]+"${LIMIT_ARG[@]}"} \
      > "$OUT/_logs/$SIMPLE.log" 2>&1; then
    STATUS="ok"
  else
    STATUS="FAILED (see $MODULE/suites/randoop/_logs/$SIMPLE.log)"
    FAILED=$((FAILED + 1))
  fi
  SECS=$(python3 -c "print(round($(now) - $START, 2))")
  echo "$FQ,$SECS" >> "$OUT/gen_times.csv"
  TESTS=$(grep -o 'Regression test count: *[0-9]*' "$OUT/_logs/$SIMPLE.log" | grep -o '[0-9]*$' || echo "?")
  printf '   %-40s %7ss  %5s tests  %s\n' "$FQ" "$SECS" "${TESTS:-?}" "$STATUS"
done
TOTAL=$(python3 -c "print(round($(now) - $TOTAL_START, 1))")

# settings of this generation; run_iteration.py reads them automatically
cat > "$OUT/generation_meta.txt" <<META
tool=randoop
model=$RANDOOP_VERSION
seed=$SEED
budget_s=$BUDGET
output_limit=${OUTPUT_LIMIT:-none}
generation_java=$("$JAVA" -version 2>&1 | grep -v JAVA_TOOL | head -1 | tr -d '"')
gen_time_s=$TOTAL
failed_classes=$FAILED
META

echo "== Done in ${TOTAL}s, $FAILED class(es) failed. Tests are in $MODULE/suites/randoop"
echo
echo "Measure them with (settings are read from generation_meta.txt; change --iteration per repetition):"
echo "  python3 scripts/run_iteration.py --tool randoop --module $MODULE --suite $MODULE/suites/randoop --iteration 1"
if [ "$FAILED" -gt 0 ] && [ "$FAILED" -eq "$(echo "$TARGETS" | wc -w)" ]; then exit 1; fi
