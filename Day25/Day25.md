## Day 25: Dynamic Programming - Word Break

**Problem:** LeetCode #139 - Word Break

**Approach - Bottom-Up DP (Boolean Array):** O(n² × m) time, O(n) space
- dp[i] = true if the first i characters of s can be segmented into dictionary words
- dp[0] = true (empty prefix is trivially breakable)
- For each position i, try every earlier split point j — if dp[j] is true AND s[j..i) is a valid word, dp[i] = true

**Key learning:** Pure recursion without memoization leads to exponential time due to overlapping subproblems (same substrings re-checked repeatedly). This "can I reach position i" boolean DP pattern reused in Jump Game, Perfect Squares, Coin Change.

**Why this matters:** Top-tier DP problem asked at Amazon, Google, Meta, Microsoft. Tests genuine DP pattern recognition, not just brute force.

**Time spent:** ~65 min