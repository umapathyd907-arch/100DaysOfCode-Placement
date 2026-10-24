## Day 54: Binary Search - Find First and Last Position of Element in Sorted Array

**Problem:** LeetCode #34 - Find First and Last Position of Element in Sorted Array

**Approach - Two Boundary Binary Searches:** O(log n) time, O(1) space
- One helper finds either the first or last index of the target
- On a match, save mid as the answer and keep searching one side: left for first (right = mid - 1), right for last (left = mid + 1)
- If the first search returns -1, the target is absent, so return [-1, -1]

**Key learning:** Don't return at the first match; keep narrowing toward the boundary. Same idea as lower bound / upper bound. Extends Day 15 (Binary Search) and Day 16 (Rotated Array).

**Why this matters:** Very common Medium at Amazon, Microsoft, Google, Meta; tests precise binary search handling.

**Time spent:** ~35 min