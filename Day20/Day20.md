## Day 20: Trees/BFS - Binary Tree Level Order Traversal

**Problem:** LeetCode #102 - Binary Tree Level Order Traversal

**Approach - BFS with Queue:** O(n) time, O(n) space
- Use a Queue (FIFO) to process nodes level by level
- Capture queue.size() BEFORE the inner loop — this tells you exactly how many nodes belong to the current level
- Process that many nodes, adding their children to the queue for the next level
- Repeat until the queue is empty

**Key learning:** BFS explores level by level (vs DFS which goes deep first). The levelSize capture trick is essential for cleanly separating levels. Queue = FIFO, contrasts with Day 9's Stack = LIFO.

**Why this matters:** Foundational BFS template reused in many tree/graph problems (Right Side View, Zigzag Traversal, Minimum Depth, Rotting Oranges).

**Time spent:** ~55 min