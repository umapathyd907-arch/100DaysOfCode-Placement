## Day 16: Binary Search - Search in Rotated Sorted Array

**Problem:** LeetCode #33 - Search in Rotated Sorted Array

**Approach - Modified Binary Search:** O(log n) time, O(1) space
- A rotated sorted array always has at least one fully sorted half at any mid point
- Check if the left half is sorted using `nums[left] <= nums[mid]`
- If the target falls inside the sorted half's range, search there; otherwise search the other half
- Repeat until found or the range collapses

**Key learning:** Plain binary search isn't enough here — the extra step is identifying which half is sorted before deciding where to go. This "adapt a known algorithm to a twisted constraint" skill is exactly what separates candidates in interviews.

**Why this matters:** Very high-frequency question at Amazon, Google, Microsoft, Facebook. Common follow-up: how does the solution change if duplicates are allowed?

**Time spent:** ~60 min