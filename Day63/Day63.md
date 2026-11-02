## Day 63: Binary Search - Kth Missing Positive Number

**Problem:** LeetCode #1539 - Kth Missing Positive Number

**Approach - Binary Search on Missing Count:** O(log n) time, O(1) space
- Missing numbers before arr[i] = arr[i] - (i + 1), which never decreases
- Find the first index where the missing count >= k (left = 0, right = n)
- The answer is left + k

**Key learning:** Turn the array into a monotonic "missing count" and binary search that. left + k works because left array elements lie below the answer, plus k missing numbers.

**Related:** Missing Number (#268), First Missing Positive (#41), Missing Element in Sorted Array (#1060).

**Why this matters:** Easy problem with an elegant O(log n) idea; tests reasoning about monotonic quantities.

**Time spent:** ~20 min