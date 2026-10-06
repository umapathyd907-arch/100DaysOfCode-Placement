## Day 36: Backtracking - Combination Sum

**Problem:** LeetCode #39 - Combination Sum

**Approach - Backtracking with Reuse:** O(2^target) time worst case
- Same "choose, explore, unchoose" skeleton as Subsets (Day 27)
- Base cases: remaining==0 means found a valid combination (record it); remaining<0 means overshot (prune, backtrack)
- Critical difference from Subsets: recurse with the SAME index i (not i+1), allowing a candidate to be reused

**Key learning:** The i vs i+1 distinction is the key adaptation from Subsets — using i allows unlimited reuse of the same candidate. Pruning (stopping early when remaining<0) is an important backtracking efficiency technique.

**Why this matters:** Frequently asked at Amazon, Microsoft, Google. Directly extends to Combination Sum II and III — same skeleton, different constraints.

**Time spent:** ~55 min