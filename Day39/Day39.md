## Day 39: Strings - Find the Index of the First Occurrence in a String

**Problem:** LeetCode #28 - Find the Index of the First Occurrence in a String

**Approach - Sliding Window Comparison (Brute Force):** O(n × m) time, O(1) space
- Try every start index i from 0 to n - m
- At each i, compare needle with haystack character by character
- If all m characters match, return i; otherwise move to the next i
- Return -1 if no start index works

**Key learning:** The loop bound i <= n - m is the critical detail: any later start can't fit the needle. Know that KMP solves this in O(n + m) by skipping redundant comparisons after a mismatch.

**Why this matters:** Common warm-up string problem. Tests careful index handling and whether you know the optimized follow-up (KMP).

**Time spent:** ~30 min