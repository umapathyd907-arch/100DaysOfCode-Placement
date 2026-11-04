## Day 65: Binary Search on Answer - Split Array Largest Sum

**Problem:** LeetCode #410 - Split Array Largest Sum (HARD)

**Approach - Binary Search on the Answer (Minimize the Maximum):** O(n log(sum - max)) time, O(1) space
- Search the largest allowed piece sum from max(nums) to sum(nums)
- piecesNeeded(cap): fill greedily in order, start a new piece when the sum would exceed cap
- If piecesNeeded <= k, right = mid; otherwise left = mid + 1

**Key learning:** Same problem as Capacity To Ship Packages (Day 62) with different wording. Recognizing the disguised pattern is the skill.

**Time spent:** ~25 min