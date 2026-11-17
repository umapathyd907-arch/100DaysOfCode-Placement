## Day 78: Binary Search on Answer (Maximize) - Maximum Candies Allocated to K Children

**Problem:** LeetCode #2226 - Maximum Candies Allocated to K Children

**Approach - Binary Search on the Answer (Maximize):** O(n log M) time, O(1) space
- Search the candies per child from 0 to max(candies)
- canGive(x): sum of candies[i] / x >= k (use long)
- If it works, left = mid; otherwise right = mid - 1; use the upper mid to avoid an infinite loop

**Key learning:** Same maximize template as Magnetic Force Between Two Balls (Day 64). Start left at 0 because the answer can be 0.

**Related:** Magnetic Force (#1552), Koko Eating Bananas (#875), Cutting Ribbons (#1891).

**Time spent:** ~25 min