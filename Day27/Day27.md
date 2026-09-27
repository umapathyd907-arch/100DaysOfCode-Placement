## Day 28: Backtracking - Subsets

**Problem:** LeetCode #78 - Subsets

**Approach - Backtracking (Choose/Explore/Unchoose):** O(2^n) time
- At every recursive call, record the current subset (it's always valid)
- For each remaining element: include it, recurse further, then remove it (backtrack) to try the next option
- Starting index prevents duplicate subsets from different orderings

**Key learning:** This is THE core backtracking template — reused directly in Permutations, Combination Sum, Palindrome Partitioning, N-Queens. The "add, recurse, remove" shape is the pattern to memorize.

**Why this matters:** First real Backtracking problem — new major pattern beyond DP. Genuinely unlocks a large family of "generate all X" interview questions.

**Time spent:** ~55 min