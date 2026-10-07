## Day 37: Backtracking - Permutations

**Problem:** LeetCode #46 - Permutations

**Approach - Backtracking with Used-Tracking:** O(n! × n) time
- Base case: when current permutation size equals nums.length, record it (all elements placed)
- Loop through ALL elements each time (not from a start index) — any unused element can go in any position
- Use a boolean[] used array to track which elements are currently placed, skip used ones
- Choose/explore/unchoose same as always, but toggling used[i] instead of using a start index

**Key learning:** Third core backtracking shape, completing the set: Subsets (include/exclude), Combination Sum (reuse with target), Permutations (use all exactly once, track used state). The used[] array technique reused in N-Queens, Sudoku Solver.

**Why this matters:** Frequently asked. Completes the essential backtracking toolkit needed for most interview-level backtracking problems.

**Time spent:** ~50 min