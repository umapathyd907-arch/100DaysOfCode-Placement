## Day 58: Binary Search - Find Minimum in Rotated Sorted Array

**Problem:** LeetCode #153 - Find Minimum in Rotated Sorted Array

**Approach - Binary Search on the Rotation Point:** O(log n) time, O(1) space
- Compare nums[mid] with nums[right]
- If nums[mid] > nums[right], the minimum is to the right: left = mid + 1
- Otherwise the minimum is at mid or to its left: right = mid
- Return nums[left] when left == right

**Key learning:** Compare with the right end, not the left, because it also works when the array is not visibly rotated. With duplicates (#154), use right-- on ties, making the worst case O(n).

**Related:** Search in Rotated Sorted Array I and II (Days 16, 57).

**Why this matters:** Common Medium at Amazon, Microsoft, Google, Meta; the pivot-finding step appears inside other problems.

**Time spent:** ~20 min