#!/usr/bin/env python3
"""
Build an interactive HTML report from the CSV files written by run_iteration.py.

  python3 scripts/make_report.py                 # reads results/*.csv, writes results/report.html
  python3 scripts/make_report.py --results other_results_dir --out my_report.html

The page is a single self-contained file (no internet needed). Open it in any browser.
Every chart can be downloaded as SVG (vector, best for the thesis) or PNG.
Re-run this script after each new iteration to refresh the page.
"""

import argparse
import csv
import json
from collections import Counter
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent


def read_csv(path):
    if not path.exists():
        return []
    with open(path, encoding="utf-8", newline="") as f:
        head = f.readline()
        f.seek(0)
        delim = ";" if head.count(";") > head.count(",") else ","
        return list(csv.DictReader(f, delimiter=delim))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--results", default=str(ROOT / "results"))
    ap.add_argument("--out", default=None)
    args = ap.parse_args()
    res = Path(args.results)

    runs = read_csv(res / "runs.csv")
    if not runs:
        raise SystemExit(f"No runs found in {res / 'runs.csv'} - run scripts/run_iteration.py first.")
    classes = read_csv(res / "classes.csv")

    tests_agg = Counter()
    for t in read_csv(res / "tests.csv"):
        tests_agg[(t["run_id"], t["subject_class"], t["status"], t["failure_type"])] += 1
    mut_agg = Counter()
    for m in read_csv(res / "mutants.csv"):
        mut_agg[(m["run_id"], m["class"].split("$")[0], m["status"], m["mutator"])] += 1

    data = {
        "runs": runs,
        "classes": classes,
        "tests": [dict(run_id=k[0], cls=k[1], status=k[2], ftype=k[3], n=v) for k, v in tests_agg.items()],
        "mutants": [dict(run_id=k[0], cls=k[1], status=k[2], mutator=k[3], n=v) for k, v in mut_agg.items()],
    }
    payload = json.dumps(data, ensure_ascii=False).replace("</", "<\\/")
    out = Path(args.out) if args.out else res / "report.html"
    out.write_text(TEMPLATE.replace("__DATA__", payload), encoding="utf-8")
    print(f"Report written to {out}  ({len(runs)} runs)")


TEMPLATE = r"""<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Test Generation Results</title>
<style>
:root {
  color-scheme: light;
  --surface-0: #f4f3f0; --surface-1: #fcfcfb; --border: #e2e1dc; --grid: #ebeae6;
  --text-primary: #0b0b0b; --text-secondary: #52514e; --text-muted: #7a7974;
  --s1: #2a78d6; --s2: #eb6834; --s3: #1baf7a; --s4: #eda100;
  --s5: #e87ba4; --s6: #008300; --s7: #6250d6; --s8: #e34948;
  --seq-lo: #cde2fb; --seq-hi: #104281; --accent: #2a78d6;
}
@media (prefers-color-scheme: dark) {
  :root:not([data-theme="light"]) {
    color-scheme: dark;
    --surface-0: #121211; --surface-1: #1a1a19; --border: #2e2e2b; --grid: #2a2a27;
    --text-primary: #f0efec; --text-secondary: #c3c2b7; --text-muted: #8f8e86;
    --s1: #3987e5; --s2: #d95926; --s3: #199e70; --s4: #c98500;
    --s5: #d55181; --s6: #008300; --s7: #9085e9; --s8: #e66767;
    --seq-lo: #1d2b3d; --seq-hi: #86b6ef; --accent: #3987e5;
  }
}
:root[data-theme="dark"] {
  color-scheme: dark;
  --surface-0: #121211; --surface-1: #1a1a19; --border: #2e2e2b; --grid: #2a2a27;
  --text-primary: #f0efec; --text-secondary: #c3c2b7; --text-muted: #8f8e86;
  --s1: #3987e5; --s2: #d95926; --s3: #199e70; --s4: #c98500;
  --s5: #d55181; --s6: #008300; --s7: #9085e9; --s8: #e66767;
  --seq-lo: #1d2b3d; --seq-hi: #86b6ef; --accent: #3987e5;
}
* { box-sizing: border-box; }
body { margin: 0; background: var(--surface-0); color: var(--text-primary);
  font: 14px/1.45 -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif; }
header { padding: 20px 24px 8px; }
h1 { font-size: 20px; margin: 0 0 4px; }
.sub { color: var(--text-secondary); margin: 0; }
.filters { position: sticky; top: 0; z-index: 5; display: flex; flex-wrap: wrap; gap: 16px;
  align-items: center; padding: 10px 24px; background: var(--surface-0);
  border-bottom: 1px solid var(--border); }
.filters label { color: var(--text-secondary); font-size: 13px; }
select, button { font: inherit; color: var(--text-primary); background: var(--surface-1);
  border: 1px solid var(--border); border-radius: 6px; padding: 4px 8px; }
button { cursor: pointer; font-size: 12px; }
button:hover { border-color: var(--accent); }
.chips { display: flex; flex-wrap: wrap; gap: 6px; }
.chip { display: inline-flex; align-items: center; gap: 6px; padding: 3px 9px; border-radius: 999px;
  border: 1px solid var(--border); background: var(--surface-1); cursor: pointer; font-size: 13px;
  user-select: none; }
.chip.off { opacity: .4; }
.sw { width: 10px; height: 10px; border-radius: 3px; display: inline-block; flex: none; }
main { padding: 16px 24px 48px; display: grid; gap: 16px; grid-template-columns: repeat(12, 1fr); }
.card { background: var(--surface-1); border: 1px solid var(--border); border-radius: 10px;
  padding: 14px 16px; grid-column: span 12; min-width: 0; }
.half { grid-column: span 6; }
@media (max-width: 1000px) { .half { grid-column: span 12; } }
.card h2 { font-size: 15px; margin: 0; }
.card .desc { color: var(--text-secondary); font-size: 12.5px; margin: 2px 0 10px; }
.card-head { display: flex; justify-content: space-between; gap: 8px; align-items: flex-start; }
.dl { display: flex; gap: 4px; flex: none; }
.legend { display: flex; flex-wrap: wrap; gap: 4px 14px; margin: 4px 0 6px;
  color: var(--text-secondary); font-size: 12.5px; }
.legend span { display: inline-flex; align-items: center; gap: 6px; }
svg text { font-family: inherit; }
.scroll { overflow-x: auto; }
table { border-collapse: collapse; width: 100%; font-size: 12.5px; }
th, td { padding: 5px 8px; text-align: right; border-bottom: 1px solid var(--grid); white-space: nowrap; }
th { color: var(--text-secondary); font-weight: 600; position: sticky; top: 0; background: var(--surface-1); }
th:first-child, td:first-child { text-align: left; }
td.heat { color: #0b0b0b; font-variant-numeric: tabular-nums; }
td.heat.dark-ink { color: #ffffff; }
.num { font-variant-numeric: tabular-nums; }
.multiples { display: grid; grid-template-columns: repeat(auto-fill, minmax(260px, 1fr)); gap: 12px; }
.multiples h3 { font-size: 12.5px; margin: 0 0 2px; color: var(--text-secondary); font-weight: 600;
  display: flex; align-items: center; gap: 6px; }
#tip { position: fixed; pointer-events: none; z-index: 10; background: var(--surface-1);
  color: var(--text-primary); border: 1px solid var(--border); border-radius: 6px;
  padding: 6px 9px; font-size: 12px; box-shadow: 0 4px 14px rgba(0,0,0,.15); display: none;
  max-width: 320px; }
#tip b { font-weight: 600; }
.empty { color: var(--text-muted); font-style: italic; padding: 12px 0; }
</style>
</head>
<body>
<header>
  <h1>Test generation results</h1>
  <p class="sub" id="subtitle"></p>
</header>
<div class="filters">
  <label>Metric <select id="metric"></select></label>
  <label>Module <select id="module"></select></label>
  <div class="chips" id="seriesChips"></div>
  <button id="theme" title="Toggle light/dark">Light / dark</button>
</div>
<main id="main"></main>
<div id="tip"></div>
<script id="data" type="application/json">__DATA__</script>
<script>
"use strict";
const DATA = JSON.parse(document.getElementById("data").textContent);
const NS = "http://www.w3.org/2000/svg";
const CLASS_ORDER = ["PureCalculator", "BranchyValidator", "NestedRules", "InjectedService",
  "HardWiredService", "TimeAndRandom", "StatefulAccount", "ExceptionHeavy", "ModernJavaFeatures"];
const METRICS = [
  { key: "branch_cov", label: "Branch coverage", pct: true },
  { key: "line_cov", label: "Line coverage", pct: true },
  { key: "instruction_cov", label: "Instruction coverage", pct: true },
  { key: "mutation_score", label: "Mutation score", pct: true },
  { key: "test_strength", label: "Test strength", pct: true },
  { key: "pass_rate", label: "Pass rate", pct: true },
  { key: "tests", label: "Number of tests", pct: false },
  { key: "gen_time_s", label: "Generation time (s)", pct: false },
];

// ---------------------------------------------------------------- data prep
const num = v => (v === "" || v == null || isNaN(+v)) ? null : +v;
const truthy = v => String(v).toLowerCase() === "true";
// Display names for the --tool values; anything else is shown as typed.
const TOOL_NAMES = { reference: "Reference (hand-written)", "golden-master": "Golden master",
  randoop: "Randoop", evosuite: "EvoSuite", kex: "Kex", utbot: "UnitTestBot", unittestbot: "UnitTestBot",
  llm: "LLM", none: "No tests" };
const toolName = t => TOOL_NAMES[(t || "").toLowerCase()] || t;
// Short display name for a model id; the full id stays in the CSV. "hf.co/unsloth/Qwen3.6-35B-A3B-GGUF:UD-IQ4_XS"
// becomes "Qwen3.6-35B-A3B (UD-IQ4_XS)", "Qwen3-Coder:latest" stays as it is.
const modelName = m => {
  if (!m) return "";
  const hf = m.match(/^hf\.co\/[^/]+\/(.+?)(?:-GGUF)?(?::(.+))?$/i);
  if (hf) return hf[1] + (hf[2] ? ` (${hf[2]})` : "");
  return m;
};
const seriesOf = r => [toolName(r.tool), modelName(r.model), r.prompt_version].filter(Boolean).join(" · ");
const runById = {};
DATA.runs.forEach(r => { r.series = seriesOf(r); runById[r.run_id] = r; });
DATA.classes.forEach(c => { const r = runById[c.run_id] || {}; c.series = r.series || c.tool;
  c.module = r.module || ""; c.simple = c.simple_name || c["class"].split(".").pop(); });
// "settings" of a run: everything that should be identical between iterations of one tool
const IGNORE_META = new Set(["generation_jdk", "generation_java", "failed_classes", "gen_time_s",
  "classes_final_status", "repair_rounds_total", "tokens_in", "tokens_out", "model_digest"]);
DATA.runs.forEach(r => {
  let m = {}; try { m = r.extra_meta ? JSON.parse(r.extra_meta) : {}; } catch (e) { m = {}; }
  const parts = []; if (r.budget_s) parts.push(`budget ${r.budget_s}s`);
  Object.keys(m).sort().forEach(k => { if (!IGNORE_META.has(k)) parts.push(`${k}=${m[k]}`); });
  r.config = parts.join(", ") || "default";
});
DATA.runs.forEach(r => {
  r.compile_rate = num(r.test_files_total) ? num(r.test_files_compiled) / num(r.test_files_total) : null;
});
const ALL_SERIES = [...new Set(DATA.runs.map(r => r.series))].sort();
const colorVar = s => `var(--s${(ALL_SERIES.indexOf(s) % 8) + 1})`;   // color follows the entity
const MODULES = [...new Set(DATA.runs.map(r => r.module))].sort();

const state = { metric: "branch_cov", module: MODULES.includes("benchmark-core") ? "benchmark-core" : "all",
  off: new Set() };

const mean = a => a.length ? a.reduce((s, x) => s + x, 0) / a.length : null;
const sd = a => { if (a.length < 2) return 0; const m = mean(a);
  return Math.sqrt(a.reduce((s, x) => s + (x - m) ** 2, 0) / (a.length - 1)); };
const metricDef = k => METRICS.find(m => m.key === k) ||
  { key: k, label: k.replace(/_/g, " "), pct: /rate|cov|score|strength/.test(k) };
const fmt = (v, pct) => v == null ? "–" : pct ? (v * 100).toFixed(1) + " %" :
  Math.abs(v) >= 100 ? v.toFixed(0) : Math.abs(v) >= 10 ? v.toFixed(1) : v.toFixed(2);
const stats = vals => { const a = vals.filter(v => v != null);
  return a.length ? { mean: mean(a), sd: sd(a), min: Math.min(...a), max: Math.max(...a), n: a.length, vals: a } : null; };
const classRank = s => { const i = CLASS_ORDER.indexOf(s); return i < 0 ? 100 : i; };
const classLabel = s => { const i = CLASS_ORDER.indexOf(s); return i < 0 ? s : `B0${i + 1} ${s}`; };

function visibleRuns() {
  return DATA.runs.filter(r => !state.off.has(r.series) && (state.module === "all" || r.module === state.module));
}
function visibleClassRows() {
  const ids = new Set(visibleRuns().map(r => r.run_id));
  return DATA.classes.filter(c => ids.has(c.run_id) && !truthy(c.is_support));
}
const activeSeries = () => ALL_SERIES.filter(s => visibleRuns().some(r => r.series === s));
const activeClasses = rows => [...new Set(rows.map(c => c.simple))].sort((a, b) => classRank(a) - classRank(b) || a.localeCompare(b));

// ---------------------------------------------------------------- svg helpers
function el(tag, attrs = {}, parent) {
  const e = document.createElementNS(NS, tag);
  for (const [k, v] of Object.entries(attrs)) e.setAttribute(k, v);
  if (parent) parent.appendChild(e);
  return e;
}
function text(parent, x, y, str, attrs = {}) {
  const t = el("text", Object.assign({ x, y, fill: "var(--text-secondary)", "font-size": 11 }, attrs), parent);
  t.textContent = str; return t;
}
const tip = document.getElementById("tip");
function hover(node, html) {
  node.addEventListener("mousemove", e => { tip.innerHTML = html; tip.style.display = "block";
    const w = tip.offsetWidth; tip.style.left = Math.min(e.clientX + 14, innerWidth - w - 8) + "px";
    tip.style.top = (e.clientY + 14) + "px"; });
  node.addEventListener("mouseleave", () => { tip.style.display = "none"; });
}
function niceMax(v) { if (v <= 0) return 1; const p = 10 ** Math.floor(Math.log10(v)); const n = v / p;
  return (n <= 1 ? 1 : n <= 2 ? 2 : n <= 2.5 ? 2.5 : n <= 5 ? 5 : 10) * p; }

function axisY(svg, x0, y0, h, w, max, pct) {
  for (let i = 0; i <= 4; i++) {
    const v = max * i / 4, y = y0 + h - h * i / 4;
    el("line", { x1: x0, x2: x0 + w, y1: y, y2: y, stroke: "var(--grid)", "stroke-width": 1 }, svg);
    text(svg, x0 - 6, y + 3.5, pct ? Math.round(v * 100) + "%" : fmt(v, false), { "text-anchor": "end" });
  }
}

// grouped bars: groups = categories on x, series inside each group
// single = true: one bar per group, the group IS the series (used for the per-tool overview)
function groupedBars(container, { groups, series, value, pct, height = 300, single = false }) {
  const perGroup = g => single ? [g] : series, nPer = single ? 1 : series.length;
  const avail = container.clientWidth || 640;
  const W = Math.max(avail, groups.length * (nPer * 12 + 34) + 70);
  const gwEst = (W - 64) / groups.length, longest = Math.max(...groups.map(g => g.length));
  const rotate = longest * 6.6 > gwEst - 6;
  const m = { l: 52, r: 12, t: 10, b: rotate ? 26 + Math.min(longest, 26) * 4.6 : 30 };
  const H = height + (m.b - 30);
  const svg = el("svg", { viewBox: `0 0 ${W} ${H}`, width: W, height: H, role: "img" });
  const w = W - m.l - m.r, h = H - m.t - m.b;
  let max = 0; groups.forEach(g => perGroup(g).forEach(s => { const st = value(g, s); if (st) max = Math.max(max, st.max); }));
  max = pct ? 1 : niceMax(max * 1.05);
  axisY(svg, m.l, m.t, h, w, max, pct);
  const gw = w / groups.length, bw = Math.min(single ? 56 : 26, (gw - 16) / Math.max(1, nPer)) - 2;
  groups.forEach((g, gi) => {
    const gx = m.l + gi * gw + (gw - nPer * (bw + 2)) / 2;
    perGroup(g).forEach((s, si) => {
      const st = value(g, s); if (!st) return;
      const x = gx + si * (bw + 2), y = m.t + h - h * st.mean / max, bh = Math.max(0.5, m.t + h - y);
      const r = Math.min(4, bw / 2, bh);
      const path = `M${x},${m.t + h} V${y + r} Q${x},${y} ${x + r},${y} H${x + bw - r} Q${x + bw},${y} ${x + bw},${y + r} V${m.t + h} Z`;
      const bar = el("path", { d: path, fill: colorVar(s) }, svg);
      if (single) text(svg, x + bw / 2, Math.min(y, m.t + h - h * st.max / max) - 6, fmt(st.mean, pct),
        { "text-anchor": "middle", fill: "var(--text-primary)", "font-size": 11.5, "font-weight": 600 });
      if (st.n > 1) {  // min-max whisker across iterations
        const cx = x + bw / 2, y1 = m.t + h - h * st.min / max, y2 = m.t + h - h * st.max / max;
        el("line", { x1: cx, x2: cx, y1, y2, stroke: "var(--text-primary)", "stroke-width": 1.2, opacity: .55 }, svg);
      }
      const hit = el("rect", { x: x - 1, y: m.t, width: bw + 2, height: h, fill: "transparent" }, svg);
      hover(hit, `<b>${s}</b>${single ? "" : "<br>" + g}<br>mean ${fmt(st.mean, pct)}` +
        (st.n > 1 ? ` (sd ${fmt(st.sd, pct)})<br>min ${fmt(st.min, pct)} – max ${fmt(st.max, pct)}` : "") +
        `<br>${st.n} iteration${st.n > 1 ? "s" : ""}`);
      hit.addEventListener("mouseenter", () => bar.setAttribute("opacity", .8));
      hit.addEventListener("mouseleave", () => bar.removeAttribute("opacity"));
    });
    const label = g.length > 26 ? g.slice(0, 25) + "…" : g, lx = m.l + gi * gw + gw / 2;
    const t = text(svg, lx, m.t + h + 16, label, { "text-anchor": "middle", fill: "var(--text-primary)", "font-size": 12 });
    if (rotate) { t.setAttribute("transform", `rotate(-30 ${lx} ${m.t + h + 16})`); t.setAttribute("text-anchor", "end"); }
  });
  el("line", { x1: m.l, x2: m.l + w, y1: m.t + h, y2: m.t + h, stroke: "var(--text-muted)", "stroke-width": 1 }, svg);
  container.appendChild(svg);
}

// horizontal 100% stacked bars, one row per series
function stackedRows(container, { rows, segments, values }) {
  const W = Math.max(360, container.clientWidth || 760), longest = Math.max(...rows.map(r => Math.min(r.length, 28)));
  const rowH = 26, m = { l: Math.min(220, 14 + longest * 6.8), r: 16, t: 4, b: 22 }, H = m.t + m.b + rows.length * (rowH + 8);
  const svg = el("svg", { viewBox: `0 0 ${W} ${H}`, width: W, height: H, role: "img" });
  const w = W - m.l - m.r;
  [0, .25, .5, .75, 1].forEach(v => { const x = m.l + w * v;
    el("line", { x1: x, x2: x, y1: m.t, y2: H - m.b, stroke: "var(--grid)" }, svg);
    text(svg, x, H - 6, Math.round(v * 100) + "%", { "text-anchor": "middle" }); });
  rows.forEach((r, ri) => {
    const y = m.t + ri * (rowH + 8), counts = values(r), total = counts.reduce((a, b) => a + b, 0);
    text(svg, m.l - 8, y + rowH / 2 + 4, r.length > 28 ? r.slice(0, 27) + "…" : r,
      { "text-anchor": "end", fill: "var(--text-primary)", "font-size": 12 });
    if (!total) return;
    let x = m.l;
    counts.forEach((c, si) => {
      if (!c) return;
      const sw = w * c / total;
      const rect = el("rect", { x: x + 1, y, width: Math.max(0.5, sw - 2), height: rowH, rx: 3, fill: segments[si].color }, svg);
      if (sw > 34) text(svg, x + sw / 2, y + rowH / 2 + 4, Math.round(100 * c / total) + "%",
        { "text-anchor": "middle", fill: "#fff", "font-size": 11, "font-weight": 600 });
      hover(rect, `<b>${r}</b><br>${segments[si].name}: ${c} (${(100 * c / total).toFixed(1)} %)`);
      x += sw;
    });
  });
  container.appendChild(svg);
}

// scatter small multiples: one panel per series, x = class complexity, y = metric
function scatterPanel(container, { points, color, pct, xLabel, xMax, yMax }) {
  const W = Math.max(240, container.clientWidth || 300), H = 220, m = { l: 44, r: 12, t: 8, b: 34 };
  const svg = el("svg", { viewBox: `0 0 ${W} ${H}`, width: W, height: H, role: "img" });
  const w = W - m.l - m.r, h = H - m.t - m.b;
  axisY(svg, m.l, m.t, h, w, yMax, pct);
  for (let i = 0; i <= 4; i++) { const v = xMax * i / 4;
    text(svg, m.l + w * i / 4, m.t + h + 14, fmt(v, false), { "text-anchor": "middle" }); }
  text(svg, m.l + w / 2, H - 4, xLabel, { "text-anchor": "middle", "font-size": 10.5 });
  el("line", { x1: m.l, x2: m.l + w, y1: m.t + h, y2: m.t + h, stroke: "var(--text-muted)" }, svg);
  points.forEach(p => {
    const cx = m.l + w * p.x / xMax, cy = m.t + h - h * p.y / yMax;
    const c = el("circle", { cx, cy, r: 5, fill: color, stroke: "var(--surface-1)", "stroke-width": 2 }, svg);
    const hit = el("circle", { cx, cy, r: 10, fill: "transparent" }, svg);
    hover(hit, `<b>${p.label}</b><br>${xLabel}: ${p.x}<br>value: ${fmt(p.y, pct)}${p.n > 1 ? ` (mean of ${p.n})` : ""}`);
    hit.addEventListener("mouseenter", () => c.setAttribute("r", 7));
    hit.addEventListener("mouseleave", () => c.setAttribute("r", 5));
  });
  container.appendChild(svg);
}

// ---------------------------------------------------------------- downloads
function resolvedSvg(svg) {
  const clone = svg.cloneNode(true), cs = getComputedStyle(document.documentElement);
  const fix = v => v && v.replace(/var\((--[\w-]+)\)/g, (_, n) => cs.getPropertyValue(n).trim());
  clone.querySelectorAll("*").forEach(n => ["fill", "stroke"].forEach(a => {
    if (n.getAttribute(a)) n.setAttribute(a, fix(n.getAttribute(a))); }));
  const vb = svg.viewBox.baseVal;
  clone.setAttribute("xmlns", NS); clone.setAttribute("width", vb.width); clone.setAttribute("height", vb.height);
  const bg = document.createElementNS(NS, "rect");
  bg.setAttribute("width", "100%"); bg.setAttribute("height", "100%"); bg.setAttribute("fill", fix("var(--surface-1)"));
  clone.insertBefore(bg, clone.firstChild);
  clone.style.fontFamily = "Helvetica, Arial, sans-serif";
  return new XMLSerializer().serializeToString(clone);
}
function download(name, href) { const a = document.createElement("a"); a.href = href; a.download = name; a.click(); }
function addDownloads(card, name) {
  const box = card.querySelector(".dl");
  const svgBtn = document.createElement("button"); svgBtn.textContent = "SVG";
  const pngBtn = document.createElement("button"); pngBtn.textContent = "PNG";
  svgBtn.onclick = () => card.querySelectorAll("svg").forEach((s, i) => download(`${name}${i ? "-" + i : ""}.svg`,
    URL.createObjectURL(new Blob([resolvedSvg(s)], { type: "image/svg+xml" }))));
  pngBtn.onclick = () => card.querySelectorAll("svg").forEach((s, i) => {
    const img = new Image(), vb = s.viewBox.baseVal, scale = 3;
    img.onload = () => { const c = document.createElement("canvas"); c.width = vb.width * scale; c.height = vb.height * scale;
      const ctx = c.getContext("2d"); ctx.scale(scale, scale); ctx.drawImage(img, 0, 0);
      download(`${name}${i ? "-" + i : ""}.png`, c.toDataURL("image/png")); };
    img.src = "data:image/svg+xml;charset=utf-8," + encodeURIComponent(resolvedSvg(s));
  });
  box.append(svgBtn, pngBtn);
}

// ---------------------------------------------------------------- cards
const main = document.getElementById("main");
function card(title, desc, opts = {}) {
  const c = document.createElement("section"); c.className = "card" + (opts.half ? " half" : "");
  c.innerHTML = `<div class="card-head"><div><h2>${title}</h2><p class="desc">${desc}</p></div><div class="dl"></div></div><div class="body"></div>`;
  main.appendChild(c);
  if (opts.download !== false) addDownloads(c, opts.file || title.toLowerCase().replace(/[^a-z0-9]+/g, "-"));
  return c.querySelector(".body");
}
function legend(body, series) {
  const lg = document.createElement("div"); lg.className = "legend";
  lg.innerHTML = series.map(s => `<span><i class="sw" style="background:${s.color || colorVar(s)}"></i>${s.name || s}</span>`).join("");
  body.appendChild(lg);
}
function empty(body, msg) { body.innerHTML = `<div class="empty">${msg}</div>`; }

function render() {
  main.innerHTML = "";
  const md = metricDef(state.metric), pct = md.pct;
  const runs = visibleRuns(), rows = visibleClassRows(), series = activeSeries(), classes = activeClasses(rows);
  document.getElementById("subtitle").textContent =
    `${DATA.runs.length} runs · ${ALL_SERIES.length} tools/models · showing ${runs.length} runs` +
    (state.module === "all" ? "" : ` from ${state.module}`);

  // 0. warning if one tool/model mixes runs with different settings
  {
    const mixed = series.map(s => [s, runs.filter(r => r.series === s)])
      .map(([s, rs]) => [s, [...new Set(rs.map(r => r.config))].map(c => [c, rs.filter(r => r.config === c).length])])
      .filter(([, cfgs]) => cfgs.length > 1);
    if (mixed.length) {
      const body = card("Warning: runs with different settings are averaged together",
        "These tools/models have iterations with different settings. Their averages mix different setups. Fix the settings, or move the odd runs out of results/*.csv.",
        { download: false });
      body.parentElement.style.borderColor = "var(--s2)";
      body.innerHTML = "<ul>" + mixed.map(([s, cfgs]) => `<li><b>${s}</b>: ` +
        cfgs.map(([c, n]) => `${n} run${n > 1 ? "s" : ""} with <code>${c}</code>`).join("; ") + "</li>").join("") + "</ul>";
    }
  }

  // 1. summary table
  {
    const body = card("Summary per tool / model", "Mean ± standard deviation across iterations (classes under test only).", { download: false });
    const cols = [["line_cov", 1], ["branch_cov", 1], ["mutation_score", 1], ["test_strength", 1], ["pass_rate", 1],
      ["compile_rate", 1], ["tests", 0], ["gen_time_s", 0], ["tokens_out", 0]];
    const label = { line_cov: "Line", branch_cov: "Branch", mutation_score: "Mutation", test_strength: "Strength",
      pass_rate: "Pass rate", compile_rate: "Compiles", tests: "Tests", gen_time_s: "Gen. time (s)", tokens_out: "Tokens out" };
    let html = `<div class="scroll"><table><thead><tr><th>Tool / model</th><th>Runs</th>${cols.map(c => `<th>${label[c[0]]}</th>`).join("")}<th style="text-align:left">Settings</th></tr></thead><tbody>`;
    series.forEach(s => {
      const rs = runs.filter(r => r.series === s);
      html += `<tr><td><i class="sw" style="background:${colorVar(s)};margin-right:6px"></i>${s}</td><td class="num">${rs.length}</td>`;
      cols.forEach(([k, p]) => { const st = stats(rs.map(r => k === "compile_rate" ? r.compile_rate : num(r[k])));
        html += `<td class="num">${st ? fmt(st.mean, p) + (st.n > 1 ? ` <span style="color:var(--text-muted)">± ${fmt(st.sd, p)}</span>` : "") : "–"}</td>`; });
      html += `<td style="text-align:left;color:var(--text-secondary)">${[...new Set(rs.map(r => r.config))].join(" | ")}</td></tr>`;
    });
    body.innerHTML = html + "</tbody></table></div>";
    if (!series.length) empty(body, "No runs match the filters.");
  }

  // 2. overall metric per series
  {
    const body = card(`${md.label} per tool / model`, "All classes together. Bar = mean over iterations; thin line = min–max across iterations.", { half: true, file: "overall-" + md.key });
    if (!series.length) empty(body, "No runs.");
    else {
      groupedBars(body, { groups: series, series, pct, height: 280, single: true,
        value: (g, s) => stats(runs.filter(r => r.series === s).map(r => md.key === "gen_time_s" ? num(r.gen_time_s) : num(r[md.key]))) }); }
  }

  // 3. compile + test outcomes
  {
    const body = card("Test outcomes", "All test cases per tool / model. Removed = test files that did not compile and were dropped before running.", { half: true, file: "test-outcomes" });
    const segs = [{ name: "Passed", color: "var(--s3)" }, { name: "Failed", color: "var(--s2)" },
      { name: "Error", color: "var(--s8)" }, { name: "Skipped", color: "var(--s4)" }, { name: "Removed files", color: "var(--s7)" }];
    if (!series.length) empty(body, "No runs.");
    else { legend(body, segs);
      stackedRows(body, { rows: series, segments: segs, values: s => { const rs = runs.filter(r => r.series === s);
        return [num, num, num, num, num].map((f, i) => rs.reduce((a, r) => a + (f(r[["tests_passed", "tests_failed", "tests_errors", "tests_skipped", "test_files_removed"][i]]) || 0), 0)); } }); }
  }

  // 4. per class grouped bars
  {
    const body = card(`${md.label} per class`, "Each group is one benchmark class; bars are tools / models (mean over iterations, line = min–max).", { file: "per-class-" + md.key });
    if (!classes.length) empty(body, "No class data.");
    else { legend(body, series); const wrap = document.createElement("div"); wrap.className = "scroll"; body.appendChild(wrap);
      groupedBars(wrap, { groups: classes.map(classLabel), series, pct, height: 340,
        value: (g, s) => stats(rows.filter(c => classLabel(c.simple) === g && c.series === s).map(c => num(c[md.key]))) }); }
  }

  // 5. heatmap table
  {
    const body = card(`Heatmap: ${md.label}`, "Mean per class and tool / model. Darker = higher. Also usable as a table for the thesis.", { download: false });
    const vals = []; classes.forEach(cl => series.forEach(s => { const st = stats(rows.filter(c => c.simple === cl && c.series === s).map(c => num(c[md.key]))); if (st) vals.push(st.mean); }));
    const hi = pct ? 1 : Math.max(...vals, 1e-9);
    const cs = getComputedStyle(document.documentElement);
    const lo = cs.getPropertyValue("--seq-lo").trim(), top = cs.getPropertyValue("--seq-hi").trim();
    const mix = t => `color-mix(in oklab, ${top} ${Math.round(t * 100)}%, ${lo})`;
    const darkTheme = document.documentElement.dataset.theme === "dark" ||
      (!document.documentElement.dataset.theme && matchMedia("(prefers-color-scheme: dark)").matches);
    let html = `<div class="scroll"><table><thead><tr><th>Class</th>${series.map(s => `<th><i class="sw" style="background:${colorVar(s)};margin-right:5px"></i>${s}</th>`).join("")}</tr></thead><tbody>`;
    classes.forEach(cl => { html += `<tr><td>${classLabel(cl)}</td>`;
      series.forEach(s => { const st = stats(rows.filter(c => c.simple === cl && c.series === s).map(c => num(c[md.key])));
        if (!st) { html += "<td>–</td>"; return; }
        const t = Math.max(0, Math.min(1, st.mean / hi)), ink = darkTheme ? t < .55 : t > .55;
        html += `<td class="heat${ink ? " dark-ink" : ""}" style="background:${mix(t)}">${fmt(st.mean, pct)}</td>`; });
      html += "</tr>"; });
    body.innerHTML = html + "</tbody></table></div>";
    if (!classes.length) empty(body, "No class data.");
  }

  // 6. designed comparison pairs
  [["BranchyValidator", "NestedRules", "B02 vs B03: flat vs nested (same cyclomatic, different cognitive complexity)"],
   ["InjectedService", "HardWiredService", "B04 vs B05: injected vs hard-wired dependencies (identical logic)"]].forEach(([a, b, title]) => {
    const body = card(title, `${md.label}. Any gap between the two classes comes from the single factor they differ in.`, { half: true, file: `pair-${a}-${b}-${md.key}` });
    const g = [a, b].filter(x => classes.includes(x));
    if (!g.length) { empty(body, "These classes are not in the selected data."); return; }
    legend(body, series);
    groupedBars(body, { groups: g.map(classLabel), series, pct, height: 260,
      value: (gl, s) => stats(rows.filter(c => classLabel(c.simple) === gl && c.series === s).map(c => num(c[md.key]))) });
  });

  // 7. complexity vs metric, small multiples
  {
    const body = card(`Cyclomatic complexity vs ${md.label.toLowerCase()}`, "One panel per tool / model; each dot is a class (mean over iterations). Shows whether more complex classes get worse results.", { file: "complexity-vs-" + md.key });
    if (!classes.length) { empty(body, "No class data."); }
    else {
      const grid = document.createElement("div"); grid.className = "multiples"; body.appendChild(grid);
      const xMax = niceMax(Math.max(...rows.map(c => num(c.cyclomatic_complexity) || 0)) * 1.05);
      let yAll = rows.map(c => num(c[md.key])).filter(v => v != null);
      const yMax = pct ? 1 : niceMax(Math.max(...yAll, 1e-9) * 1.05);
      series.forEach(s => {
        const box = document.createElement("div");
        box.innerHTML = `<h3><i class="sw" style="background:${colorVar(s)}"></i>${s}</h3>`; grid.appendChild(box);
        const points = classes.map(cl => { const cr = rows.filter(c => c.simple === cl && c.series === s);
          const st = stats(cr.map(c => num(c[md.key]))); const x = cr.length ? num(cr[0].cyclomatic_complexity) : null;
          return st && x != null ? { x, y: st.mean, n: st.n, label: classLabel(cl) } : null; }).filter(Boolean);
        scatterPanel(box, { points, color: colorVar(s), pct, xLabel: "cyclomatic complexity", xMax, yMax });
      });
    }
  }

  // 8. mutant status distribution
  {
    const ids = new Set(runs.map(r => r.run_id));
    const muts = DATA.mutants.filter(m => ids.has(m.run_id) && !/\.support\./.test("." + m.cls));
    const body = card("Mutant outcomes (PIT)", "Share of mutants per status. Killed = detected by a test; Survived = covered but undetected; No coverage = never executed.", { half: true, file: "mutant-outcomes" });
    const order = ["KILLED", "SURVIVED", "NO_COVERAGE", "TIMED_OUT"], segs = [
      { name: "Killed", color: "var(--s3)" }, { name: "Survived", color: "var(--s2)" },
      { name: "No coverage", color: "var(--s7)" }, { name: "Timed out", color: "var(--s4)" }, { name: "Other", color: "var(--s5)" }];
    if (!muts.length) empty(body, "No PIT data yet.");
    else { legend(body, segs);
      stackedRows(body, { rows: series, segments: segs, values: s => { const out = [0, 0, 0, 0, 0];
        muts.forEach(m => { if (runById[m.run_id].series !== s) return; const i = order.indexOf(m.status); out[i < 0 ? 4 : i] += m.n; });
        return out; } }); }
  }

  // 9. surviving mutators table
  {
    const ids = new Set(runs.map(r => r.run_id));
    const muts = DATA.mutants.filter(m => ids.has(m.run_id) && !/\.support\./.test("." + m.cls));
    const body = card("Which mutations survive", "Survived / total per mutation operator (lower is better). Shows what kinds of faults the tests miss.", { half: true, download: false });
    const mutators = [...new Set(muts.map(m => m.mutator))].sort();
    if (!mutators.length) { empty(body, "No PIT data yet."); }
    else {
      let html = `<div class="scroll"><table><thead><tr><th>Mutator</th>${series.map(s => `<th><i class="sw" style="background:${colorVar(s)};margin-right:5px"></i>${s}</th>`).join("")}</tr></thead><tbody>`;
      mutators.forEach(mu => { html += `<tr><td>${mu.replace(/Mutator$/, "")}</td>`;
        series.forEach(s => { const sel = muts.filter(m => m.mutator === mu && runById[m.run_id].series === s);
          const tot = sel.reduce((a, m) => a + m.n, 0), sur = sel.filter(m => m.status === "SURVIVED" || m.status === "NO_COVERAGE").reduce((a, m) => a + m.n, 0);
          html += `<td class="num">${tot ? `${sur} / ${tot}` : "–"}</td>`; });
        html += "</tr>"; });
      body.innerHTML = html + "</tbody></table></div>";
    }
  }

  // 10. failure types
  {
    const ids = new Set(runs.map(r => r.run_id));
    const fails = DATA.tests.filter(t => ids.has(t.run_id) && (t.status === "failed" || t.status === "error"));
    const body = card("Why tests fail", "Most common exception types among failing tests (count over all iterations).", { download: false });
    if (!fails.length) { empty(body, "No failing tests in the selection."); }
    else {
      const types = {}; fails.forEach(f => { const k = (f.ftype || "(none)").split(".").pop(); types[k] = (types[k] || 0) + f.n; });
      const top = Object.entries(types).sort((a, b) => b[1] - a[1]).slice(0, 12).map(e => e[0]);
      let html = `<div class="scroll"><table><thead><tr><th>Exception type</th>${series.map(s => `<th><i class="sw" style="background:${colorVar(s)};margin-right:5px"></i>${s}</th>`).join("")}</tr></thead><tbody>`;
      top.forEach(tp => { html += `<tr><td>${tp}</td>`;
        series.forEach(s => { const n = fails.filter(f => (f.ftype || "(none)").split(".").pop() === tp && runById[f.run_id].series === s).reduce((a, f) => a + f.n, 0);
          html += `<td class="num">${n || "–"}</td>`; });
        html += "</tr>"; });
      body.innerHTML = html + "</tbody></table></div>";
    }
  }

  // 11. runs table
  {
    const body = card("All runs", "Every iteration in the selection, newest first.", { download: false });
    const cols = ["timestamp_utc", "tool", "model", "prompt_version", "iteration", "seed", "module", "status",
      "test_files_compiled", "test_files_total", "tests", "pass_rate", "line_cov", "branch_cov", "mutation_score", "test_strength", "gen_time_s", "total_s"];
    const pctCols = new Set(["pass_rate", "line_cov", "branch_cov", "mutation_score", "test_strength"]);
    let html = `<div class="scroll"><table><thead><tr>${cols.map(c => `<th>${c.replace(/_/g, " ")}</th>`).join("")}</tr></thead><tbody>`;
    [...runs].sort((a, b) => b.timestamp_utc.localeCompare(a.timestamp_utc)).forEach(r => {
      html += "<tr>" + cols.map(c => `<td class="num">${pctCols.has(c) ? fmt(num(r[c]), true) : (r[c] ?? "")}</td>`).join("") + "</tr>"; });
    body.innerHTML = html + "</tbody></table></div>";
  }
}

// ---------------------------------------------------------------- controls
const metricSel = document.getElementById("metric");
metricSel.innerHTML = METRICS.map(m => `<option value="${m.key}">${m.label}</option>`).join("");
metricSel.value = state.metric; metricSel.onchange = () => { state.metric = metricSel.value; render(); };
const modSel = document.getElementById("module");
modSel.innerHTML = `<option value="all">all</option>` + MODULES.map(m => `<option>${m}</option>`).join("");
modSel.value = state.module; modSel.onchange = () => { state.module = modSel.value; render(); };
const chips = document.getElementById("seriesChips");
ALL_SERIES.forEach(s => { const c = document.createElement("span"); c.className = "chip";
  c.innerHTML = `<i class="sw" style="background:${colorVar(s)}"></i>${s}`;
  c.onclick = () => { state.off.has(s) ? state.off.delete(s) : state.off.add(s); c.classList.toggle("off"); render(); };
  chips.appendChild(c); });
document.getElementById("theme").onclick = () => {
  const root = document.documentElement, dark = root.dataset.theme === "dark" ||
    (!root.dataset.theme && matchMedia("(prefers-color-scheme: dark)").matches);
  root.dataset.theme = dark ? "light" : "dark"; render(); };
render();
let resizeTimer; addEventListener("resize", () => { clearTimeout(resizeTimer); resizeTimer = setTimeout(render, 150); });
</script>
</body>
</html>
"""

if __name__ == "__main__":
    main()
