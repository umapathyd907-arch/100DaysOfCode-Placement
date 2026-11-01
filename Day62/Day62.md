## Day 62: Binary Search on Answer - Capacity To Ship Packages Within D Days

**Problem:** LeetCode #1011 - Capacity To Ship Packages Within D Days

**Approach - Binary Search on the Answer:** O(n log(sum - max)) time, O(1) space
- Search capacity from max(weights) to sum(weights)
- daysNeeded(capacity): fill packages in order; if the next one exceeds capacity, start a new day
- If daysNeeded <= days, right = mid; otherwise left = mid + 1

**Key learning:** Same template as Days 60 and 61. The lower bound must be max(weights), because the ship has to carry the heaviest package. Packages can't be reordered, so a greedy fill is correct.

**Related:** Split Array Largest Sum (#410) is the same problem.

**Why this matters:** Common Medium at Amazon, Google, Meta, Microsoft; completes the binary-search-on-answer trio.

**Time spent:** ~25 min