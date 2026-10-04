## Day 34: Graphs/BFS - Rotting Oranges

**Problem:** LeetCode #994 - Rotting Oranges

**Approach - Multi-Source BFS:** O(m×n) time, O(m×n) space
- Add ALL initially rotten oranges to the queue at once (multi-source setup)
- Run BFS level by level — each level represents one minute
- Only increment the minute counter if something actually rotted that round (avoids overcounting)
- If fresh oranges remain after BFS completes, they're unreachable — return -1

**Key learning:** Multi-source BFS starts from many points simultaneously rather than one. The rottedThisRound flag is a subtle but critical correctness detail. Extends the grid traversal (Day 19) and BFS (Day 20) patterns into a combined "grid BFS" approach.

**Why this matters:** Reused in Walls and Gates, 01 Matrix, and other "shortest distance spreading from multiple sources" problems. Frequently asked at Amazon.

**Time spent:** ~55 min