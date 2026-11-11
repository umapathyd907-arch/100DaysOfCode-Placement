## Day 72: Trees/BFS - Binary Tree Right Side View

**Problem:** LeetCode #199 - Binary Tree Right Side View

**Approach - Level-Order BFS:** O(n) time, O(w) space
- Process the tree level by level using the queue size
- The last node of each level is the one visible from the right, so add its value

**Alternative:** DFS visiting the right child first; the first node seen at each depth is the answer.

**Key learning:** Small change to the Day 20 BFS template. Left-only branches can still be visible.

**Why this matters:** Common Medium at Meta, Amazon, Google, Microsoft.

**Time spent:** ~20 min