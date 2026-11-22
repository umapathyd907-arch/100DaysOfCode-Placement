## Day 83: Trees - Balanced Binary Tree

**Problem:** LeetCode #110 - Balanced Binary Tree

**Approach - Height with an Unbalanced Signal:** O(n) time, O(h) space
- One function returns the subtree height, or -1 if that subtree is unbalanced
- If either child returns -1, pass -1 up immediately
- If the two heights differ by more than 1, return -1
- Otherwise return 1 + max(left, right); the tree is balanced if the result is not -1

**Slower alternative:** Call maxDepth at every node: O(n^2) on a skewed tree.

**Key learning:** Combine two jobs (measure and check) in one pass. Check every node, not just the root. Same pattern as Diameter of Binary Tree (#543).

**Related:** Maximum Depth (#104), Minimum Depth (#111), Diameter (#543).

**Why this matters:** Common Easy tree problem; tests whether you can improve O(n^2) to O(n).

**Time spent:** ~15 min