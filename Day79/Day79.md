## Day 79: Trees - Binary Tree Preorder Traversal

**Problem:** LeetCode #144 - Binary Tree Preorder Traversal

**Approach - Iterative with a Stack:** O(n) time, O(h) space
- Push the root; pop a node, record it, then push its right child and then its left child
- Right is pushed first so the left child is popped first (LIFO)

**Alternative:** Recursive DFS (node, left, right). Morris traversal gives O(1) extra space.

**Key learning:** The stack replaces the recursion stack. Push order matters. Preorder is also the basis for serializing a tree.

**Related:** Inorder (#94), Postorder (#145), Serialize and Deserialize Binary Tree (#297).

**Why this matters:** Easy warm-up; the iterative follow-up is a common interview ask.

**Time spent:** ~15 min