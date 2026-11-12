## Day 73: Dynamic Programming - Unique Paths

**Problem:** LeetCode #62 - Unique Paths

**Approach - 2D DP Reduced to One Row:** O(m * n) time, O(n) space
- paths(i, j) = paths(i-1, j) + paths(i, j-1); the first row and column are 1
- One array of size n is enough: dp[j] (from above) += dp[j-1] (from the left)

**Alternative:** Combinatorics, C(m + n - 2, m - 1), computed with a loop using long.

**Key learning:** First grid DP. Same "last move" idea as Climbing Stairs, in two dimensions. Follow-ups: Unique Paths II (obstacles), Minimum Path Sum.

**Why this matters:** Very common DP warm-up at Amazon, Microsoft, Google, Adobe.

**Time spent:** ~20 min