## Day 49: Arrays - Majority Element

**Problem:** LeetCode #169 - Majority Element

**Approach - Boyer-Moore Voting Algorithm:** O(n) time, O(1) space
- Keep a candidate and a count
- If count is 0, take the current number as the new candidate
- Same as candidate: count++; different: count--
- The majority element (guaranteed to exist) survives

**Other approaches:** HashMap frequency count (O(n) space); sort and take nums[n/2] (O(n log n)).

**Key learning:** Pairs of different elements cancel out, and the majority element has more than half the votes so it can't be fully cancelled. Needs a verification pass if a majority isn't guaranteed. Follow-up: Majority Element II (n/3).

**Why this matters:** Common at Amazon, Microsoft, Adobe and in online assessments; tests whether you know the O(1) space trick.

**Time spent:** ~25 min