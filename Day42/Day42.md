## Day 42: Linked List - Sort List

**Problem:** LeetCode #148 - Sort List

**Approach - Top-Down Merge Sort:** O(n log n) time, O(log n) space (recursion)
- Base case: 0 or 1 node is already sorted
- Find the middle with slow/fast pointers (fast starts at head.next), cut the list with slow.next = null
- Recursively sort both halves
- Merge the two sorted halves using the dummy node technique

**Key learning:** Merge sort suits linked lists because it needs no random access. Combines fast/slow pointers (Day 6) and merging two sorted lists. Starting fast at head.next avoids infinite recursion on 2-node lists.

**Follow-up:** Bottom-up merge sort gives O(1) extra space.

**Why this matters:** Common Medium linked list problem at Amazon, Microsoft, Google, Bloomberg.

**Time spent:** ~45 min