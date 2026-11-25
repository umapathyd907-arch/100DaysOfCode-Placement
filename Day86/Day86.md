## Day 86: Trees - Same Tree

**Problem:** LeetCode #100 - Same Tree

**Approach - Recursive Comparison of Two Trees:** O(min(n, m)) time, O(h) space
- Both null: true
- Exactly one null: false
- Values differ: false
- Otherwise both left pair and right pair must be the same

**Key learning:** Walk two trees at once. Check null cases before touching .val. Compare structure as well as values. Basis for Subtree of Another Tree (#572) and Symmetric Tree (#101).

**Related:** Subtree of Another Tree (#572), Symmetric Tree (#101), Invert Binary Tree (#226).

**Time spent:** ~10 min