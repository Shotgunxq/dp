#!/usr/bin/env bash
# Record ("approve") the golden master (baseline B1).
#
# Runs the golden-master tests once in approve mode: every test writes the CURRENT behaviour of
# the benchmark classes to <Test>.<name>.approved.txt next to the tests. From then on the same
# tests fail whenever that behaviour changes. Re-run this only if you deliberately change the
# benchmark classes - and look through the approved files once (they ARE the expected values).
#
# Usage (from the project root):  bash scripts/approve_golden_master.sh
set -euo pipefail
MODULE="${1:-benchmark-core}"
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SUITE="$ROOT/$MODULE/suites/golden-master"
now() { python3 -c 'import time; print(f"{time.time():.3f}")'; }

find "$SUITE" -name '*.approved.txt' -delete
rm -f "$SUITE/generation_meta.txt"
echo "== Recording golden master for $MODULE ..."
START=$(now)
mvn -q -B -ntp -f "$ROOT/$MODULE/pom.xml" clean test \
    -Dsuite.dir="$SUITE" -Dgolden.approve=true -Dgolden.dir="$SUITE" -Djacoco.skip=true
SECS=$(python3 -c "print(round($(now) - $START, 1))")

FILES=$(find "$SUITE" -name '*.approved.txt' | wc -l | tr -d ' ')
LINES=$(find "$SUITE" -name '*.approved.txt' -exec cat {} + | wc -l | tr -d ' ')
cat > "$SUITE/generation_meta.txt" <<META
tool=golden-master
model=combinations-v1
input_rule=typical domain values + simple edge values, chosen without branch analysis
approved_files=$FILES
approved_lines=$LINES
approved_at=$(date '+%Y-%m-%d %H:%M')
gen_time_s=$SECS
META

echo "== Approved $FILES files with $LINES recorded input/output lines in ${SECS}s:"
find "$SUITE" -name '*.approved.txt' | sed "s|$ROOT/||" | sort
echo
echo "Look through a few of them, then measure the golden master like any other suite:"
echo "  python3 scripts/run_iteration.py --tool golden-master --module $MODULE --suite $MODULE/suites/golden-master"
