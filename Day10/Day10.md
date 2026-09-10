## Day 10: Math/Arrays - Find Numbers with Even Number of Digits

**Problem:** LeetCode #1295 - Find Numbers with Even Number of Digits

**Approach 1 - String Conversion:** O(n) time
- Convert each number to a string, check its length for evenness

**Approach 2 - Mathematical (no string conversion):** O(n) time
- Repeatedly divide by 10, counting divisions until number reaches 0
- Check if digit count is even

**Key learning:** Simple problem, but good to know both string-based and pure math approaches — interviewers sometimes restrict you from using string conversion to test number-handling fundamentals.

**Honest note:** This is a warm-up level problem, not a major pattern-builder like Sliding Window or Stack. Good for consistency, low weight for actual interview difficulty.

**Time spent:** ~20 min