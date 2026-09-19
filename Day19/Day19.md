## Day 19: Graphs - Number of Islands

**Problem:** LeetCode #200 - Number of Islands

**Approach - DFS on Grid:** O(m×n) time, O(m×n) worst-case space (recursion stack)
- Scan every cell in the grid
- When unvisited land ('1') is found, it's a new island — increment count
- Run DFS from that cell to "flood" and mark the entire connected island as visited
- DFS checks boundaries, checks if still land, marks visited, then recurses in all 4 directions

**Key learning:** This is the foundational grid-traversal template (boundary check → visited check → mark visited → recurse in 4 directions) reused across many problems: Flood Fill, Max Area of Island, Surrounded Regions, Rotting Oranges.

**Why this matters:** Gateway problem into Graph algorithms. Extremely commonly asked — if this isn't fluent, it's a red flag in interviews.

**Time spent:** ~60 min