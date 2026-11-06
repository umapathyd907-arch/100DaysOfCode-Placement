## Day 67: Binary Search on Partition - Median of Two Sorted Arrays

**Problem:** LeetCode #4 - Median of Two Sorted Arrays (HARD)

**Approach - Binary Search on the Partition:** O(log(min(m, n))) time, O(1) space
- Always binary search the shorter array; i = elements taken from nums1, j = (m + n + 1) / 2 - i from nums2
- Border values: l1, r1 around the cut in nums1; l2, r2 around the cut in nums2 (use MIN/MAX sentinels at the edges)
- Valid split when l1 <= r2 and l2 <= r1
- If l1 > r2, move i left; otherwise move i right
- Odd total: max(l1, l2); even total: (max(l1, l2) + min(r1, r2)) / 2.0

**Key learning:** Binary search can search a cut position, not just a value. The merge approach is O(m + n); the partition approach reaches O(log(min(m, n))).

**Related:** Find Median from Data Stream (#295), Kth Element of Two Sorted Arrays.

**Why this matters:** Famous Hard problem at Google, Amazon, Microsoft, Meta, Apple.

**Time spent:** ~60 min