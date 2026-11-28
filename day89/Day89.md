## Day 89: Trees/BFS - Maximum Width of Binary Tree

**Problem:** LeetCode #662 - Maximum Width of Binary Tree

**Approach - Level-Order BFS with Heap-Style Indexes:** O(n) time, O(w) space
- Number nodes like a heap: left child = 2 * i, right child = 2 * i + 1
- Width of a level = last index - first index + 1 (null gaps are counted automatically)
- Subtract the first index of each level before computing children, to avoid overflow on skewed trees

**Key learning:** Counting nodes per level is wrong because gaps count. Normalizing indexes per level prevents overflow. Never put null placeholders in the queue.

**Related:** Level Order Traversal (#102), Right Side View (#199), Vertical Order Traversal (#987).

**Why this matters:** Common Medium at Amazon, Meta, Google.

**Time spent:** ~25 min