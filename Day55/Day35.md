## Day 55: Binary Search - Search Insert Position

**Problem:** LeetCode #35 - Search Insert Position

**Approach - Lower Bound Binary Search:** O(log n) time, O(1) space
- Find the first index where nums[index] >= target
- left = 0, right = n (answer can be n)
- If nums[mid] < target, left = mid + 1; otherwise right = mid
- Return left when left == right

**Key learning:** Lower bound template with an exclusive right bound. Same idea as the first-position search in Day 54. Foundation for Sqrt(x), Koko Eating Bananas.

**Why this matters:** Common easy warm-up (Amazon, Microsoft, Adobe); the template is reused in many harder binary search problems.

**Time spent:** ~15 min