## Day 82: Trees - Maximum Depth of Binary Tree

**Problem:** LeetCode #104 - Maximum Depth of Binary Tree

**Approach - Recursive DFS (Postorder):** O(n) time, O(h) space
- depth(null) = 0
- depth(node) = 1 + max(depth(left), depth(right))

**Alternative:** BFS level counting with a queue (Day 20 template), O(w) space.

**Key learning:** A node's answer depends on its children's answers. The same pattern solves Diameter (#543), Balanced Tree (#110), and Minimum Depth (#111, watch the one-child case).

**Why this matters:** One of the most common tree basics; the foundation for many harder tree problems.

**Time spent:** ~10 min