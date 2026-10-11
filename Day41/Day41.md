## Day 41: Two Pointers - Move Zeroes

**Problem:** LeetCode #283 - Move Zeroes

**Approach - In-Place Two Pointers (Swap):** O(n) time, O(1) space
- insertPos marks where the next non-zero element should go
- Scan with i; when nums[i] is non-zero, swap it with nums[insertPos] and advance insertPos
- Zeros end up at the back, and the non-zero elements keep their relative order

**Key learning:** The "write pointer + read pointer" pattern for in-place array problems. Sorting would break the order and cost O(n log n). Reused in Remove Element, Remove Duplicates from Sorted Array, Sort Colors.

**Why this matters:** Frequently asked easy warm-up in phone screens and online assessments (Amazon, Microsoft, Adobe, Bloomberg).

**Time spent:** ~20 min