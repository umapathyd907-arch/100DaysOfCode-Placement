## Day 59: Binary Search - Single Element in a Sorted Array

**Problem:** LeetCode #540 - Single Element in a Sorted Array

**Approach - Binary Search on Index Parity:** O(log n) time, O(1) space
- Before the single element, pairs start at even indexes; after it, at odd indexes
- Force mid to be even, then compare nums[mid] with nums[mid + 1]
- If equal, the single element is to the right: left = mid + 2
- Otherwise it is at mid or to its left: right = mid

**Key learning:** XOR solves it in O(n), but sorted order plus index parity allows O(log n). Making mid even is the key step.

**Related:** Single Number (#136), Missing Number (#268).

**Why this matters:** Common Medium at Amazon, Google, Microsoft, Adobe; tests creative binary search reasoning.

**Time spent:** ~25 min