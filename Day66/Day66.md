## Day 66: Binary Search on Answer - Minimum Limit of Balls in a Bag

**Problem:** LeetCode #1760 - Minimum Limit of Balls in a Bag

**Approach - Binary Search on the Answer (Minimize the Maximum):** O(n log M) time, O(1) space
- Search the penalty (largest bag) from 1 to max(nums)
- operationsNeeded(p): sum of (x - 1) / p over all bags
- If operationsNeeded <= maxOperations, right = mid; otherwise left = mid + 1
- Use long for the operation total

**Key learning:** Same template as Koko Eating Bananas (Day 60), with the check formula (x - 1) / p. Using x / p is the classic off-by-one bug.

**Related:** Koko Eating Bananas (#875), Split Array Largest Sum (#410), #2064.

**Time spent:** ~25 min