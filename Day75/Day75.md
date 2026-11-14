## Day 75: Binary Search on Answer - Kth Smallest Element in a Sorted Matrix

**Problem:** LeetCode #378 - Kth Smallest Element in a Sorted Matrix

**Approach - Binary Search on Value + Staircase Count:** O(n log(max - min)) time, O(1) space
- Search values between matrix[0][0] and matrix[n-1][n-1]
- count(mid): walk from the bottom-left; if value <= mid, add row + 1 and move right; otherwise move up
- If count >= k, right = mid; otherwise left = mid + 1
- The final left is the smallest value with count >= k, so it is a real element

**Alternative:** Min-heap of row heads, poll k times: O(k log n).

**Key learning:** Combines binary search on the answer (Days 60-66) with the staircase walk (Day 69). Search values, not indexes, because the flat matrix isn't sorted.

**Related:** Kth Smallest in a BST (Day 71), #373, #668.

**Why this matters:** Common Medium at Amazon, Google, Meta, Microsoft.

**Time spent:** ~35 min