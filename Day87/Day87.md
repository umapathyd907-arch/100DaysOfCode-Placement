## Day 87: Trees - Symmetric Tree

**Problem:** LeetCode #101 - Symmetric Tree

**Approach - Recursive Mirror Comparison:** O(n) time, O(h) space
- Compare root.left and root.right with isMirror(a, b)
- Both null: true; exactly one null: false; values differ: false
- Otherwise a.left must mirror b.right AND a.right must mirror b.left

**Alternative:** Iterative with a queue of node pairs (use LinkedList, since it allows nulls).

**Key learning:** Same as Same Tree (Day 86), but the children are crossed: outer with outer, inner with inner. Symmetric means mirrored, not identical.

**Related:** Same Tree (#100), Invert Binary Tree (#226), Subtree of Another Tree (#572).

**Time spent:** ~15 min