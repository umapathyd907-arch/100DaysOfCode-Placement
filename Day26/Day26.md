## Day 26: Dynamic Programming - Climbing Stairs

**Problem:** LeetCode #70 - Climbing Stairs

**Approach - Iterative DP (Space Optimized):** O(n) time, O(1) space
- ways(n) = ways(n-1) + ways(n-2) — last move was either a single step or a double step
- Base cases: ways(1)=1, ways(2)=2
- Track only the last two values instead of a full array, sliding the window forward each iteration

**Key learning:** This is literally the Fibonacci sequence in disguise. Space optimization (array → two variables) is a technique to explicitly mention in interviews. Recurrence pattern reused in House Robber, Min Cost Climbing Stairs, Decode Ways.

**Why this matters:** The standard first DP problem — clean introduction to the mindset (define subproblem, find recurrence, build from base case) without extra complexity.

**Time spent:** ~40 min