## Day 40: Linked List/Heap - Merge k Sorted Lists

**Problem:** LeetCode #23 - Merge k Sorted Lists (HARD)

**Approach - Min-Heap of Front Nodes:** O(N log k) time, O(k) space
- Put the head of every non-empty list into a min-heap ordered by value
- Repeatedly poll the smallest node, attach it to the result (dummy node + tail)
- If the polled node has a next, push it into the heap
- Heap size never exceeds k, so each operation is O(log k)

**Alternative:** Divide and conquer, merging lists in pairs. Also O(N log k).

**Key learning:** Combines the dummy node trick with the bounded min-heap idea (Day 18). Skip null lists before inserting into the heap.

**Why this matters:** Very frequently asked Hard problem at Amazon, Google, Microsoft, Meta, Uber.

**Time spent:** ~50 min