## Day 50: Arrays/HashSet - Longest Consecutive Sequence

**Problem:** LeetCode #128 - Longest Consecutive Sequence

**Approach - HashSet + Start-of-Sequence Check:** O(n) time, O(n) space
- Put all numbers in a HashSet
- For each number, only start counting if (num - 1) is NOT in the set (it is the start of a run)
- Extend forward with while (set.contains(current + 1)) and track the longest length

**Key learning:** Skipping non-start numbers keeps the total work O(n), because each number is visited at most twice. Sorting would be O(n log n), which violates the problem's requirement.

**Why this matters:** Very frequently asked at Amazon, Google, Meta, Microsoft. Tests whether you can beat sorting with a hash-based idea.

**Time spent:** ~35 min