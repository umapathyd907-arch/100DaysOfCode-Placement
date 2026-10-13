## Day 43: Sorting/Two Pointers - Sort Colors + Quick Sort

**Problem:** LeetCode #75 - Sort Colors

**Approach - Dutch National Flag (3-way partition):** O(n) time, O(1) space
- low = boundary of 0s, high = boundary of 2s, mid = element being inspected
- 0: swap with low, advance low and mid
- 1: advance mid
- 2: swap with high, decrement high (do NOT advance mid, the swapped value is unchecked)

**Quick Sort notes:**
- Partition around a pivot, then recurse on both sides
- Average O(n log n), worst O(n^2); random pivot avoids the worst case
- In-place, not stable. Quickselect (same partition) finds the k-th largest in O(n) average

**Key learning:** Partitioning is the core idea behind quick sort. Sort Colors is a 3-way partition done in one pass.

**Why this matters:** Frequently asked at Amazon, Microsoft, Meta, Adobe. Tests in-place pointer manipulation.

**Time spent:** ~40 min