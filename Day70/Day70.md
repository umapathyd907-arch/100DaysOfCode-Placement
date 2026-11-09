## Day 70: Graphs - Clone Graph

**Problem:** LeetCode #133 - Clone Graph

**Approach - DFS with a HashMap of Original to Clone:** O(V + E) time, O(V) space
- Map each original node to its clone
- If a node is already in the map, return its clone (handles cycles and shared neighbors)
- Otherwise create the clone, store it in the map BEFORE visiting neighbors, then clone each neighbor recursively

**Key learning:** Registering the clone before recursing prevents infinite recursion on cycles. The same "map of copies" idea solves Copy List with Random Pointer (#138). BFS with a queue is the iterative alternative.

**Why this matters:** Common Medium at Meta, Amazon, Google, Microsoft; tests deep-copy reasoning on cyclic structures.

**Time spent:** ~35 min