## Day 64: Binary Search on Answer - Magnetic Force Between Two Balls

**Problem:** LeetCode #1552 - Magnetic Force Between Two Balls

**Approach - Binary Search on the Answer (Maximize the Minimum):** O(n log n + n log(range)) time
- Sort positions
- Search the minimum gap from 1 to max - min
- canPlace(d): greedily place a ball at the first basket at least d away from the last; true if m balls fit
- If it works, left = mid; otherwise right = mid - 1; use the upper mid to avoid an infinite loop

**Key learning:** "Maximize the minimum" flips the template: left = mid with upper mid, compared with "minimize" where right = mid. Greedy check plus binary search.

**Related:** Aggressive Cows, Split Array Largest Sum (#410), Maximum Candies Allocated to K Children (#2226).

**Why this matters:** Tests whether you can adapt the binary-search-on-answer pattern to a maximize problem.

**Time spent:** ~30 min