#!/usr/bin/env bash
# QUICK test run of the whole pipeline: one iteration of every approach with short budgets.
# Use it to check that everything works (new classes B10-B15 included) before a long run.
# The numbers are NOT for the thesis - budgets are shorter than in the real setup.
#
# Results go to results-quick/ (report: results-quick/report.html), so they never mix with results/.
#
# Usage (from the project root):
#   caffeinate -dis bash scripts/quick_run.sh            # everything, ~45-75 min
#   SKIP="evosuite" bash scripts/quick_run.sh            # leave some steps out
#   LLM_MODELS="Qwen3-Coder:latest" bash scripts/quick_run.sh
# Steps: reference golden-master randoop evosuite llm
#
# Quick settings: Randoop/EvoSuite 20 s per class (Randoop max 200 tests), LLM naive prompt only,
# PIT stops after 30 min per run. Seed 42.
set -uo pipefail

BUDGET="${BUDGET:-20}"
RANDOOP_LIMIT="${RANDOOP_LIMIT:-200}"
LLM_MODELS="${LLM_MODELS:-hf.co/unsloth/Qwen3.6-35B-A3B-GGUF:UD-IQ4_XS Qwen3-Coder:latest}"
LLM_PROMPT="${LLM_PROMPT:-naive}"
SKIP="${SKIP:-}"
SEED=42
MODULE="benchmark-core"
PIT_MIN=30

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"
export TESTGEN_RESULTS="$ROOT/results-quick"   # run_iteration.py writes here instead of results/
mkdir -p "$TESTGEN_RESULTS"
LOG="$TESTGEN_RESULTS/quick-$(date +%Y%m%d-%H%M).log"
exec > >(tee -a "$LOG") 2>&1

START=$(date +%s)
DONE=0; FAILED=""
skip() { case " $SKIP " in *" $1 "*) echo "-- skipping $1"; return 0 ;; esac; return 1; }
step() { echo; echo "######## $1 | $(date '+%H:%M') | $(( ($(date +%s) - START) / 60 )) min so far"; }
measure() {  # measure <tool> <suite> [extra args]
  local tool="$1" suite="$2"; shift 2
  if python3 scripts/run_iteration.py --tool "$tool" --module "$MODULE" --suite "$suite" \
       --iteration 1 --pit-timeout-min "$PIT_MIN" --no-report --notes "quick run" "$@"; then
    DONE=$((DONE + 1))
  else
    echo "!! measurement failed: $tool"; FAILED="$FAILED $tool"
  fi
}
wait_ollama() {  # Ollama can take a while after a restart
  for _ in $(seq 1 30); do
    curl -sf http://localhost:11434/api/tags >/dev/null && return 0
    echo "   waiting for Ollama ..."; sleep 10
  done
  echo "!! Ollama is not answering (try: brew services restart ollama)"; return 1
}

echo "== QUICK run | budget ${BUDGET}s | Randoop limit $RANDOOP_LIMIT | LLM prompt: $LLM_PROMPT"
echo "   results: $TESTGEN_RESULTS   log: $LOG   started $(date '+%Y-%m-%d %H:%M')"

step "dependencies"
mvn -q -B -ntp dependency:resolve -DincludeScope=test >/dev/null || echo "!! dependency download had problems"
mvn -q -B -ntp compile >/dev/null || { echo "!! project does not build - stopping"; exit 1; }

if ! skip reference; then
  step "reference (hand-written tests)"
  measure reference "$MODULE/src/test/java"
fi

if ! skip golden-master; then
  step "golden master (record + measure)"
  if bash scripts/approve_golden_master.sh "$MODULE"; then
    measure golden-master "$MODULE/suites/golden-master"
  else
    echo "!! golden master recording failed"; FAILED="$FAILED golden-master"
  fi
fi

if ! skip randoop; then
  step "Randoop"
  if bash scripts/generate_randoop.sh "$BUDGET" "$SEED" "$MODULE" "$RANDOOP_LIMIT"; then
    measure randoop "$MODULE/suites/randoop"
  else
    echo "!! Randoop generation failed"; FAILED="$FAILED randoop"
  fi
fi

if ! skip evosuite; then
  step "EvoSuite"
  if bash scripts/generate_evosuite.sh "$BUDGET" "$SEED" "$MODULE"; then
    measure evosuite "$MODULE/suites/evosuite"
  else
    echo "!! EvoSuite generation failed"; FAILED="$FAILED evosuite"
  fi
fi

if ! skip llm; then
  for MODEL in $LLM_MODELS; do
    SLUG=$(echo "${MODEL##*/}" | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/-/g; s/^-|-$//g')
    SUITE="$MODULE/suites/quick-llm-$SLUG-$LLM_PROMPT"   # own folder: the full-run suites stay untouched
    step "LLM $MODEL ($LLM_PROMPT)"
    wait_ollama || { FAILED="$FAILED llm-$SLUG"; continue; }
    if python3 scripts/generate_llm.py --model "$MODEL" --prompt "$LLM_PROMPT" --seed "$SEED" \
         --module "$MODULE" --out "$SUITE"; then
      measure llm "$SUITE"
    else
      echo "!! generation failed: $MODEL"; FAILED="$FAILED llm-$SLUG"
    fi
  done
fi

step "report"
python3 scripts/make_report.py --results "$TESTGEN_RESULTS" --out "$TESTGEN_RESULTS/report.html"
echo
echo "== Quick run finished $(date '+%H:%M') after $(( ($(date +%s) - START) / 60 )) min: $DONE run(s) measured.${FAILED:+ Failed:$FAILED}"
echo "   open $TESTGEN_RESULTS/report.html"
