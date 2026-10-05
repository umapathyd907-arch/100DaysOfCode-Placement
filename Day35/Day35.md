## Day 35: Dynamic Programming - Coin Change

**Problem:** LeetCode #322 - Coin Change

**Approach - Bottom-Up DP (Unbounded, Reusable Coins):** O(amount × coins.length) time, O(amount) space
- dp[i] = minimum coins needed to make amount i
- For each amount, try every coin: dp[i] = min(dp[i], dp[i-coin] + 1)
- Initialize dp with "amount+1" as a safe "impossible" placeholder, dp[0] = 0 as base case
- If dp[amount] is still the placeholder, no solution exists — return -1

**Key learning:** Greedy (always pick biggest coin) FAILS for arbitrary denominations — must prove this with a counterexample like coins=[1,3,4], amount=6. This is "unbounded knapsack" style DP — each coin reusable unlimited times, different from House Robber's "use once" constraint.

**Why this matters:** Extremely common DP interview question. Directly extends to Coin Change II, Perfect Squares.

**Time spent:** ~60 min