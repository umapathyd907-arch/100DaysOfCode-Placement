## Day 88: Trees - Vertical Order Traversal of a Binary Tree

**Problem:** LeetCode #987 - Vertical Order Traversal of a Binary Tree (HARD)

**Approach - DFS + Sort:** O(n log n) time, O(n) space
- Record every node as (col, row, value); left child is (row + 1, col - 1), right child is (row + 1, col + 1)
- Sort by col, then row, then value
- Walk the sorted list and start a new group whenever the column changes

**Key learning:** Nodes at the same row and column must be ordered by value, so plain BFS order isn't enough. Easier version without the tie-break: #314.

**Related:** Level Order Traversal (#102), Right Side View (#199), #314.

**Why this matters:** Common Hard tree problem at Meta, Amazon, Google.

**Time spent:** ~30 min