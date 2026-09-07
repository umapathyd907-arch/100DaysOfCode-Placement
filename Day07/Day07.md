## Day 7: Linked List - Reverse Linked List

**Problem:** LeetCode #206 - Reverse Linked List

**Approach - Iterative Pointer Reversal:** O(n) time, O(1) space
- Use three pointers: prev, curr, next
- For each node: save next, reverse curr's pointer to prev, shift prev and curr forward
- When curr becomes null, prev is the new head

**Key learning:** This exact three-pointer reversal technique is foundational — it's reused in problems like reversing parts of a list, reversing in groups of k, and palindrome linked list checks.

**Time spent:** ~45 min