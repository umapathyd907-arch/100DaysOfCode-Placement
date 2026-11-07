## Day 68: Binary Search - Search a 2D Matrix

**Problem:** LeetCode #74 - Search a 2D Matrix

**Approach - Binary Search on the Flattened Matrix:** O(log(m * n)) time, O(1) space
- Rows are sorted and each row starts after the previous one ends, so the matrix is one sorted list in row-major order
- Search indexes 0 to rows * cols - 1
- Convert mid to a cell: row = mid / cols, col = mid % cols
- Standard binary search comparison on that value

**Key learning:** Treat a 2D structure as a 1D one with index math. Different from #240, where rows are not chained and the staircase search (O(m + n)) is used instead.

**Why this matters:** Common Medium at Amazon, Microsoft, Adobe, Bloomberg; tests index conversion on top of basic binary search.

**Time spent:** ~20 min