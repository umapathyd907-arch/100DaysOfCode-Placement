## Day 51: Arrays/Two Pointers - 4Sum

**Problem:** LeetCode #18 - 4Sum

**Approach - Sort + Two Nested Loops + Two Pointers:** O(n^3) time, O(1) extra space
- Sort the array
- Fix i and j (skipping duplicate values), then use left/right pointers on the rest
- On a match, record and skip duplicates on both pointers
- Use long for the sum to avoid int overflow

**Key learning:** Direct extension of 3Sum (Day 13). Duplicate skipping at i, j, left, and right. The j-skip condition is j > i + 1. Generalizes to k-Sum with recursion.

**Why this matters:** Frequently asked at Amazon, Google, Meta; tests whether you can extend a known pattern and catch the overflow trap.

**Time spent:** ~45 min