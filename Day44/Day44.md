## Day 44: Sliding Window - Minimum Window Substring

**Problem:** LeetCode #76 - Minimum Window Substring (HARD)

**Approach - Variable Sliding Window with Counts:** O(|s| + |t|) time, O(1) space
- need[c] = copies of c still required; missing = required characters not yet covered
- Expand right: if need[c] > 0 then missing--, always need[c]--
- While missing == 0: record the smallest window, then shrink from left (need[l]++, if > 0 then missing++)
- Return the best window or ""

**Key learning:** Only decrement `missing` when the character was actually needed (handles duplicates). Expand until valid, shrink while valid, record inside the shrink loop. Same template as Longest Substring with K Distinct and Permutation in String.

**Why this matters:** Very frequently asked Hard problem at Amazon, Google, Meta, Microsoft, Uber.

**Time spent:** ~60 min