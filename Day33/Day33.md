## Day 33: Two Pointers - Container With Most Water

**Problem:** LeetCode #11 - Container With Most Water

**Approach - Two Pointers (Greedy):** O(n) time, O(1) space
- Start with widest container (both ends), calculate water = min(heights) * width
- Always move the pointer at the SHORTER line inward — moving the taller one can never improve the result
- Track the maximum water found while narrowing

**Key learning:** Must be able to explain WHY moving the shorter side is always safe (moving the taller side can only shrink width while keeping the same height cap). Different from Trapping Rain Water (Day 30) — this picks just 2 lines for ONE container, not summing water at every position.

**Why this matters:** Extremely frequently asked. Tests the ability to prove a greedy choice is correct, not just apply two pointers mechanically.

**Time spent:** ~50 min