## Day 71: Trees/BST - Kth Smallest Element in a BST

**Problem:** LeetCode #230 - Kth Smallest Element in a BST

**Approach - Iterative In-Order Traversal with Early Exit:** O(h + k) time, O(h) space
- In-order traversal of a BST visits values in ascending order
- Use a stack: push all left nodes, pop the next node, decrement k, return when k == 0
- Then move to the popped node's right child

**Follow-up:** If the tree changes often, store the left-subtree size in each node and answer each query in O(h).

**Key learning:** BST property + in-order = sorted order. An iterative traversal can stop as soon as the kth node is reached.

**Related:** Validate BST (Day 21), Binary Tree Inorder Traversal (#94), Kth Largest Element (Day 23).

**Why this matters:** Common Medium at Amazon, Meta, Google, Microsoft.

**Time spent:** ~25 min