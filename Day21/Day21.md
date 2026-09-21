## Day 21: Trees - Validate Binary Search Tree

**Problem:** LeetCode #98 - Validate Binary Search Tree

**Approach - Recursive Range Validation:** O(n) time, O(h) space (h = tree height, for recursion stack)
- Pass down a (min, max) valid range to each recursive call
- Left subtree: upper bound becomes the parent's value
- Right subtree: lower bound becomes the parent's value
- Constraints accumulate from ALL ancestors, not just the immediate parent

**Key learning / common trap:** Checking only immediate parent-child relationships is WRONG — a node must satisfy constraints from every ancestor above it, not just its direct parent. Using `long` instead of `int` for bounds avoids edge-case bugs with Integer.MIN_VALUE/MAX_VALUE.

**Why this matters:** This is a classic trap question — tests genuine understanding of the BST property vs. surface-level pattern matching. Alternative approach: in-order traversal should yield strictly increasing values.

**Time spent:** ~65 min