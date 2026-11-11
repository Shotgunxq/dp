#!/usr/bin/env bash
# Run more iterations of the non-AI baselines with exactly the same settings as iteration 1.
#
# Usage (from the project root):
#   bash scripts/run_baselines.sh                       # iterations 2..5 for randoop and evosuite
#   bash scripts/run_baselines.sh 2 5 evosuite          # only EvoSuite
#   bash scripts/run_baselines.sh 6 10                  # five more iterations later
# On a Mac, keep it awake while it runs:
#   caffeinate -i bash scripts/run_baselines.sh
#
# Seed = 41 + iteration  (iteration 1 = seed 42, 2 = 43, ... 5 = 46)
# Fixed settings (identical to iteration 1 - don't change between iterations):
#   budget 60 s per class, Randoop capped at 500 tests per class, module benchmark-core
# Override only for a deliberately NEW setup:  BUDGET=120 RANDOOP_LIMIT=none bash scripts/run_baselines.sh
set -uo pipefail

FIRST="${1:-2}"
LAST="${2:-5}"
TOOLS="${3:-randoop evosuite}"
BUDGET="${BUDGET:-60}"
RANDOOP_LIMIT="${RANDOOP_LIMIT:-500}"
MODULE="benchmark-core"

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"
mkdir -p results
LOG="results/baselines-$(date +%Y%m%d-%H%M).log"
exec > >(tee -a "$LOG") 2>&1

LIMIT_ARG="$RANDOOP_LIMIT"; [ "$RANDOOP_LIMIT" = "none" ] && LIMIT_ARG=""
echo "== Baselines: iterations $FIRST..$LAST | tools: $TOOLS | budget ${BUDGET}s | Randoop limit: $RANDOOP_LIMIT"
echo "   log: $LOG   started $(date '+%Y-%m-%d %H:%M')"
DONE=0; FAILED=""
for i in $(seq "$FIRST" "$LAST"); do
  SEED=$((41 + i))
  for TOOL in $TOOLS; do
    echo
    echo "######## $TOOL | iteration $i | seed $SEED | $(date '+%H:%M')"
    case "$TOOL" in
      randoop)  bash scripts/generate_randoop.sh "$BUDGET" "$SEED" "$MODULE" $LIMIT_ARG ;;
      evosuite) bash scripts/generate_evosuite.sh "$BUDGET" "$SEED" "$MODULE" ;;
      *) echo "!! unknown tool '$TOOL' (use randoop and/or evosuite)"; FAILED="$FAILED $TOOL#$i"; continue ;;
    esac
    if [ $? -ne 0 ]; then
      echo "!! generation failed - not measured"; FAILED="$FAILED $TOOL#$i"; continue
    fi
    if python3 scripts/run_iteration.py --tool "$TOOL" --module "$MODULE" \
         --suite "$MODULE/suites/$TOOL" --iteration "$i" --pit-timeout-min 120 --no-report; then
      DONE=$((DONE + 1))
    else
      echo "!! measurement failed"; FAILED="$FAILED $TOOL#$i"
    fi
  done
done

echo
python3 scripts/make_report.py
echo "== Finished $(date '+%Y-%m-%d %H:%M'): $DONE run(s) recorded.${FAILED:+ Failed:$FAILED}"
echo "   open results/report.html"
