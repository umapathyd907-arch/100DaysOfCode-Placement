## Day 6: Linked List - Linked List Cycle

**Problem:** LeetCode #141 - Linked List Cycle

**Approach - Floyd's Cycle Detection (Fast & Slow Pointers):** O(n) time, O(1) space
- Two pointers: slow moves 1 step, fast moves 2 steps
- If they ever meet, there's a cycle
- If fast reaches null, no cycle exists

**Key learning:** This "Tortoise and Hare" pattern is a classic interview question, reused in problems like finding the middle of a linked list, detecting cycle start, and more.

**Time spent:** ~40 min