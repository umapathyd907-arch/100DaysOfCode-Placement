## Day 53: Divide and Conquer - Reverse Pairs

**Problem:** LeetCode #493 - Reverse Pairs (HARD)

**Approach - Merge Sort with Counting:** O(n log n) time, O(n) space
- Recursively sort both halves, counting reverse pairs inside each
- Before merging, count crossing pairs with two pointers: for each i in the left half, advance j in the right half while nums[i] > 2 * nums[j]
- j never moves backward because both halves are sorted
- Then merge the halves normally
- Use long in the comparison to avoid int overflow

**Key learning:** Count first, then merge. Same idea as Count Inversions, with a different condition. Related: Count of Smaller Numbers After Self (#315), Count of Range Sum (#327). Alternative: Fenwick tree with coordinate compression.

**Why this matters:** Famous Hard problem at Amazon, Google, Microsoft; tests whether you can extend merge sort to count pairs.

**Time spent:** ~60 min