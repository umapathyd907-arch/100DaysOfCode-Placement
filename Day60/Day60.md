## Day 60: Binary Search on Answer - Koko Eating Bananas

**Problem:** LeetCode #875 - Koko Eating Bananas

**Approach - Binary Search on the Answer:** O(n log M) time, O(1) space
- Search speeds from 1 to max(piles)
- Check a speed k: total hours = sum of ceil(pile / k), computed as (pile + k - 1) / k
- If hours <= h, the speed works: right = mid; otherwise left = mid + 1
- Return left, the smallest working speed

**Key learning:** When "does X work?" is monotonic, binary search the answer range instead of an array. Same lower-bound template as Day 55. Use long for the hour total.

**Related:** Capacity to Ship Packages (#1011), Split Array Largest Sum (#410), Sqrt(x) (#69).

**Why this matters:** Common Medium at Amazon, Google, Meta, Microsoft; introduces a pattern that unlocks many harder problems.

**Time spent:** ~30 min