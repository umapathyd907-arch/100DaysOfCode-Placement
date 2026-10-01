## Day 30: Two Pointers - Trapping Rain Water

**Problem:** LeetCode #42 - Trapping Rain Water (HARD)

**Approach - Two Pointers:** O(n) time, O(1) space
- Water at any position = min(tallest to left, tallest to right) - height at that position
- Process whichever side (left/right) currently has the smaller height — it's guaranteed safe since the other side has something tall enough
- Track leftMax/rightMax as running maximums, accumulate trapped water as you go

**Key learning:** First Hard-difficulty problem completed. The insight of "process the shorter side" avoids needing to precompute full left-max/right-max arrays, going from O(n) space to O(1) space.

**Why this matters:** Extremely famous interview problem, frequently used as a bar-raiser question at Amazon, Google, Microsoft. Genuinely tests deep array/two-pointer understanding.

**Time spent:** ~70 min (Hard problem, took extra time to understand the two-pointer insight)
