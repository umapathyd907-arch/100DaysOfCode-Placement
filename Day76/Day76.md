## Day 76: Binary Search on Answer - Find the Smallest Divisor Given a Threshold

**Problem:** LeetCode #1283 - Find the Smallest Divisor Given a Threshold

**Approach - Binary Search on the Answer:** O(n log M) time, O(1) space
- Search divisors from 1 to max(nums)
- sumOfCeilings(d) = sum of (n + d - 1) / d; use long to avoid overflow
- If the sum <= threshold, right = mid; otherwise left = mid + 1

**Key learning:** Same template as Koko Eating Bananas (Day 60); only the check changes. Integer ceiling division avoids floating point.

**Related:** Koko Eating Bananas (#875), Capacity To Ship Packages (#1011), Minimum Limit of Balls in a Bag (#1760).

**Time spent:** ~20 min