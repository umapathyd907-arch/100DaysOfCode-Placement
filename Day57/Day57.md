## Day 57: Binary Search - Search in Rotated Sorted Array II

**Problem:** LeetCode #81 - Search in Rotated Sorted Array II

**Approach - Modified Binary Search with Duplicate Handling:** O(log n) average, O(n) worst case, O(1) space
- Same as Day 16: find the sorted half, check if the target lies in it
- New case: if nums[left] == nums[mid] == nums[right], we can't tell which half is sorted, so shrink both ends (left++, right--)
- Return true on finding the target, false when the range collapses

**Key learning:** Duplicates break the "which half is sorted" test, which makes the worst case O(n). Check the all-equal case first.

**Related:** Find Minimum in Rotated Sorted Array I and II (#153, #154).

**Why this matters:** Classic follow-up to #33 at Amazon, Microsoft, Google.

**Time spent:** ~35 min
