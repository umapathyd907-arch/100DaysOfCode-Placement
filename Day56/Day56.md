## Day 56: Binary Search - Find Peak Element

**Problem:** LeetCode #162 - Find Peak Element

**Approach - Binary Search on Slope:** O(log n) time, O(1) space
- Compare nums[mid] with nums[mid + 1]
- If nums[mid] < nums[mid + 1] (uphill), a peak exists on the right: left = mid + 1
- Otherwise (downhill), mid or a peak on its left works: right = mid
- When left == right, that index is a peak

**Key learning:** Binary search doesn't need a sorted array, only a rule that guarantees which half contains an answer. The -infinity boundaries guarantee a peak exists in the uphill direction.

**Related:** Peak Index in a Mountain Array (#852), Find in Mountain Array (#1095).

**Why this matters:** Common Medium at Amazon, Google, Microsoft, Meta; tests binary search reasoning beyond sorted arrays.

**Time spent:** ~25 min