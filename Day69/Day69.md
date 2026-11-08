## Day 69: Matrix - Search a 2D Matrix II

**Problem:** LeetCode #240 - Search a 2D Matrix II

**Approach - Staircase Search from the Top-Right:** O(m + n) time, O(1) space
- Start at the top-right corner
- If value == target, return true
- If value > target, discard the column (col--)
- If value < target, discard the row (row++)

**Key learning:** Rows and columns are sorted but not chained, so flattening (Day 68) fails. The top-right (or bottom-left) corner is the largest in its row and smallest in its column, so each step removes a whole row or column.

**Why this matters:** Common Medium at Amazon, Microsoft, Google, Apple.

**Time spent:** ~20 min