## Day 38: Greedy - Jump Game

**Problem:** LeetCode #55 - Jump Game

**Approach - Greedy (Track Farthest Reachable Index):** O(n) time, O(1) space
- Keep a variable `farthest` = the farthest index reachable so far
- For each index i: if i > farthest, we are stuck, so return false
- Otherwise update farthest = max(farthest, i + nums[i])
- If the loop finishes, the last index is reachable

**Key learning:** Reachable positions always form a continuous range from 0 to farthest, so only the maximum matters. This avoids the slower recursion/DP solutions. Extends to Jump Game II (minimum jumps).

**Why this matters:** Frequently asked at Amazon, Microsoft, Google, Adobe. Tests whether you can spot a greedy simplification instead of over-engineering with DP.

**Time spent:** ~35 min