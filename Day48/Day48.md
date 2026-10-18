## Day 48: Dynamic Programming - Longest Increasing Subsequence

**Problem:** LeetCode #300 - Longest Increasing Subsequence

**Approach 1 - DP:** O(n^2) time, O(n) space
- dp[i] = length of the longest increasing subsequence ending at index i
- Start with dp[i] = 1; for each j < i with nums[j] < nums[i], dp[i] = max(dp[i], dp[j] + 1)
- Answer = max over all dp[i]

**Approach 2 - Binary Search (tails array):** O(n log n) time
- tails[k] = smallest possible last value of an increasing subsequence of length k+1
- For each number, binary search the first tails entry >= num and replace it; append if none
- tails is not the actual subsequence, only a length tracker

**Key learning:** "Best result ending at i" DP style. The answer is the max over all dp[i], not dp[n-1]. Connects DP with binary search (Day 15).

**Why this matters:** One of the most repeated DP questions at Amazon, Google, Microsoft, Meta, Adobe.

**Time spent:** ~50 min