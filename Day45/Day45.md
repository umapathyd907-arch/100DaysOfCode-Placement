## Day 45: Backtracking/Grid DFS - Word Search

**Problem:** LeetCode #79 - Word Search

**Approach - DFS with Backtracking:** O(m*n*4^L) time, O(L) space
- Try every cell as a starting point
- dfs(r, c, idx): match word[idx] at the cell, then explore 4 neighbors for idx+1
- Choose: mark the cell as '#'; Unchoose: restore the original letter after exploring
- Success when idx reaches word.length()

**Key learning:** Grid DFS (Day 19) plus choose/explore/unchoose (Days 27, 36, 37). Always restore the cell, or later paths see a damaged board. Follow-up Word Search II uses a Trie (Day 31).

**Why this matters:** Common Medium at Amazon, Microsoft, Google, Bloomberg.

**Time spent:** ~45 min