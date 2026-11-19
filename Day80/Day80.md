## Day 80: Trees - Binary Tree Inorder Traversal

**Problem:** LeetCode #94 - Binary Tree Inorder Traversal

**Approach - Iterative with a Stack:** O(n) time, O(h) space
- Dive left from the current node, pushing each node
- Pop a node, record it, then move to its right child
- Repeat until there is no current node and the stack is empty

**Alternative:** Recursive DFS (left, node, right). Morris traversal gives O(1) extra space.

**Key learning:** Preorder, inorder and postorder differ only in when the node is recorded. Record on pop (not on push) for inorder. On a BST, inorder gives sorted order.

**Related:** Preorder (#144), Postorder (#145), Kth Smallest in a BST (#230), Validate BST (#98).

**Why this matters:** Easy warm-up; the iterative follow-up is a common interview ask.

**Time spent:** ~15 min