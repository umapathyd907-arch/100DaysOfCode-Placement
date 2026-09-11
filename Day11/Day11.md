## Day 11: Arrays - Product of Array Except Self

**Problem:** LeetCode #238 - Product of Array Except Self

**Approach - Prefix and Suffix Products (Two Pass):** O(n) time, O(1) extra space
- First pass (left to right): build up product of everything to the LEFT of each index
- Second pass (right to left): multiply in the product of everything to the RIGHT of each index
- No division used — avoids the division-by-zero trap

**Key learning:** The "obvious" division-based solution fails on arrays with zeros and is explicitly banned in most interviews. This two-pass prefix/suffix technique is a reusable pattern for problems needing "everything except X" calculations.

**Why this matters:** Frequently asked at Amazon and Microsoft — tests whether you can find a smart O(n) solution under a specific constraint (no division), not just solve it the "easy" way.

**Time spent:** ~50 min