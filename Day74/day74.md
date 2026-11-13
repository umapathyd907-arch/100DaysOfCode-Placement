## Day 74: Binary Search - Find a Peak Element II

**Problem:** LeetCode #1901 - Find a Peak Element II

**Approach - Binary Search on Columns:** O(m log n) time, O(1) space
- Take the middle column and find the row with the largest value in it
- That cell already beats its up/down neighbors; compare with left and right
- If it beats both, it is a peak; if the left is bigger, search left; otherwise search right
- Outside the grid counts as -1

**Key learning:** 2D extension of Find Peak Element (Day 56). Choosing the column maximum handles two directions at once, so the problem reduces to the 1D uphill argument.

**Related:** Find Peak Element (#162), Peak Index in a Mountain Array (#852).

**Why this matters:** Typical follow-up to the 1D peak problem at Google, Amazon, Meta.

**Time spent:** ~30 min