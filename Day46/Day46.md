## Day 46: Arrays - Max Consecutive Ones

**Problem:** LeetCode #485 - Max Consecutive Ones

**Approach - Running Counter with Reset:** O(n) time, O(1) space
- current counts the current run of 1s; max stores the best run
- On 1: current++, update max. On 0: reset current to 0

**Key learning:** The "extend or reset" streak pattern, similar in spirit to Kadane's algorithm. Follow-up (flip up to k zeros) is a sliding window.

**Why this matters:** Common easy warm-up in online assessments. Low difficulty, good for consistency.

**Time spent:** ~15 min