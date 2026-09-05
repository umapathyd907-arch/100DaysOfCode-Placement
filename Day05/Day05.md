## Day 5: Arrays - Best Time to Buy and Sell Stock

**Problem:** LeetCode #121 - Best Time to Buy and Sell Stock

**Approach - Single Pass Greedy:** O(n) time, O(1) space
- Track minPrice (cheapest price seen so far) and maxProfit (best profit so far)
- For each day: if price is lower than minPrice, update minPrice
- Otherwise, check if selling today beats current maxProfit, update if so

**Key learning:** Don't need to check every buy/sell pair (O(n²)) — a single pass tracking min value and max difference solves it in O(n). This greedy single-pass pattern is very common.

**Bonus:** Also tested locally using a main() method — confirmed output matches expected (Max Profit: 5 for [7,1,5,3,6,4]).

**Time spent:** ~45 min