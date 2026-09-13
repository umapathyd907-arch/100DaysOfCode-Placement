## Day 13: Arrays - 3Sum

**Problem:** LeetCode #15 - 3Sum

**Approach - Sort + Two Pointers:** O(n²) time, O(1) extra space (excluding output)
- Sort the array first
- Fix one number, use two pointers (left, right) to find pairs that sum to -fixed
- Skip duplicates at both the fixed index and the two pointers to avoid repeated triplets

**Key learning:** Sorting first enables the two-pointer technique to work efficiently. Duplicate handling is the trickiest part — must skip at three different points (outer loop, left pointer, right pointer).

**Why this matters:** Top 5 most frequently asked interview problem across companies. Extends directly to 4Sum and k-Sum variations.

**Time spent:** ~60 min