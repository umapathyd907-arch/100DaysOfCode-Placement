## Day 22: Graphs - Course Schedule

**Problem:** LeetCode #207 - Course Schedule

**Approach - DFS Cycle Detection (Three-State Marking):** O(V+E) time, O(V+E) space
- Build a directed graph from prerequisites
- Use three states per node: Unvisited (0), Visiting (1), Visited (2)
- If DFS revisits a node currently marked "Visiting," a cycle exists — impossible to finish
- If a node is already "Visited," skip re-exploring it (already confirmed safe)

**Key learning:** This is graph cycle detection disguised as a scheduling problem. The three-state system is essential for DIRECTED graphs (different from simple visited/unvisited used in undirected graph cycle detection).

**Why this matters:** Real-world pattern used in build systems, package managers, dependency resolution — not just interview trivia. Natural follow-up: "return the actual valid order" (Course Schedule II).

**Time spent:** ~65 min