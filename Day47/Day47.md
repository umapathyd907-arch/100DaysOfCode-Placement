## Day 47: Trees - Lowest Common Ancestor of a Binary Tree

**Problem:** LeetCode #236 - Lowest Common Ancestor of a Binary Tree

**Approach - Recursive Post-Order:** O(n) time, O(h) space
- Return the node itself if it is null, p, or q
- Recurse into left and right subtrees
- If both sides return non-null, p and q are split across this node, so it is the LCA
- Otherwise return whichever side is non-null

**Key learning:** Each recursive call reports "what did I find in this subtree". Without BST ordering (Day 32) both subtrees must be searched. Assumes p and q both exist in the tree.

**Alternative:** Parent map + ancestor set (O(n) extra space).

**Why this matters:** One of the most frequently asked tree problems at Meta, Amazon, Google, Microsoft, LinkedIn.

**Time spent:** ~40 min