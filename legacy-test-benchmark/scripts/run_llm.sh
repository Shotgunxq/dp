#!/usr/bin/env bash
# Generate + measure LLM test suites for several models, prompts and iterations.
#
# Usage (from the project root):
#   caffeinate -i bash scripts/run_llm.sh                    # iteration 1 for all models x prompts
#   caffeinate -i bash scripts/run_llm.sh 2 5                # iterations 2..5
#   MODELS="Qwen3-Coder:latest" PROMPTS="full" bash scripts/run_llm.sh 1 1
#
# Seed = 41 + iteration (iteration 1 = seed 42), same as the baselines.
# Fixed settings: temperature 0.2, 3 repair rounds for the full prompt, context 16384 tokens.
# Loops model by model, so each model is loaded into memory only once.
set -uo pipefail

FIRST="${1:-1}"
LAST="${2:-1}"
MODELS="${MODELS:-hf.co/unsloth/Qwen3.6-35B-A3B-GGUF:UD-IQ4_XS Qwen3-Coder:latest phi4-mini:latest}"
PROMPTS="${PROMPTS:-naive full}"
MODULE="benchmark-core"

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"
mkdir -p results
LOG="results/llm-$(date +%Y%m%d-%H%M).log"
exec > >(tee -a "$LOG") 2>&1

echo "== LLM runs: iterations $FIRST..$LAST | prompts: $PROMPTS"
echo "   models: $MODELS"
echo "   log: $LOG   started $(date '+%Y-%m-%d %H:%M')"
DONE=0; FAILED=""
for MODEL in $MODELS; do
  SLUG=$(echo "${MODEL##*/}" | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/-/g; s/^-|-$//g')
  for PROMPT in $PROMPTS; do
    for i in $(seq "$FIRST" "$LAST"); do
      SEED=$((41 + i))
      SUITE="$MODULE/suites/llm-$SLUG-$PROMPT"
      echo
      echo "######## $MODEL | $PROMPT | iteration $i | seed $SEED | $(date '+%H:%M')"
      if ! python3 scripts/generate_llm.py --model "$MODEL" --prompt "$PROMPT" --seed "$SEED" --module "$MODULE"; then
        echo "!! generation failed - not measured"; FAILED="$FAILED $SLUG/$PROMPT#$i"; continue
      fi
      if python3 scripts/run_iteration.py --tool llm --module "$MODULE" --suite "$SUITE" \
           --iteration "$i" --pit-timeout-min 120 --no-report; then
        DONE=$((DONE + 1))
      else
        echo "!! measurement failed"; FAILED="$FAILED $SLUG/$PROMPT#$i"
      fi
    done
  done
done

echo
python3 scripts/make_report.py
echo "== Finished $(date '+%Y-%m-%d %H:%M'): $DONE run(s) recorded.${FAILED:+ Failed:$FAILED}"
echo "   open results/report.html"
