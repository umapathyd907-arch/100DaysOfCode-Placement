## Day 61: Binary Search on Answer - Minimum Number of Days to Make m Bouquets

**Problem:** LeetCode #1482 - Minimum Number of Days to Make m Bouquets

**Approach - Binary Search on the Answer:** O(n log(maxDay - minDay)) time, O(1) space
- If m * k > n, return -1 (use long for the product)
- Search days between min(bloomDay) and max(bloomDay)
- canMake(day): scan left to right, count runs of k adjacent bloomed flowers (bloom <= day); a closed flower resets the run
- If canMake is true, right = mid; otherwise left = mid + 1

**Key learning:** Same template as Koko Eating Bananas (Day 60); only the feasibility check changes. Adjacency means runs must reset on a gap.

**Related:** Capacity to Ship Packages (#1011), Split Array Largest Sum (#410).

**Why this matters:** Tests whether you can reuse the binary-search-on-answer pattern with a new check function.

**Time spent:** ~30 min