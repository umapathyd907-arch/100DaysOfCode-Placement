## Day 77: Floyd's Cycle Detection - Find the Duplicate Number

**Problem:** LeetCode #287 - Find the Duplicate Number

**Approach - Floyd's Cycle Detection on the Array:** O(n) time, O(1) space
- Treat index i as a node pointing to nums[i]; values are in 1..n, so index 0 is outside any cycle
- The duplicate value is the node with two incoming pointers, which is the cycle entrance
- Phase 1: slow moves 1 step, fast moves 2 steps until they meet
- Phase 2: reset slow to the start; move both 1 step at a time; they meet at the entrance (the duplicate)

**Alternative:** Binary search on the value range using counts (pigeonhole): O(n log n) time, O(1) space.

**Key learning:** An array can be viewed as a linked list. Must not modify the array and must use O(1) space, which rules out HashSet, sorting, and negation.

**Related:** Linked List Cycle (Day 6), Linked List Cycle II (#142), Set Mismatch (Day 52).

**Why this matters:** Common Medium at Amazon, Microsoft, Google, Meta; tests whether you can spot a hidden cycle problem.

**Time spent:** ~38 min
