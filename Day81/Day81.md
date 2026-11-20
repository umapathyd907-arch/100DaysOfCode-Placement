## Day 81: Trees - Binary Tree Postorder Traversal

**Problem:** LeetCode #145 - Binary Tree Postorder Traversal

**Approach - Iterative Stack (Reverse of Node-Right-Left):** O(n) time, O(h) stack space
- Pop a node, prepend its value to the result
- Push the left child, then the right child (so the right is popped first)
- Prepending reverses node, right, left into left, right, node

**Alternative:** Recursive DFS (left, right, node). One-stack version tracks the last visited node.

**Key learning:** Postorder records a node only after both subtrees are done. Completes the traversal trio: preorder (Day 79), inorder (Day 80), postorder (Day 81).

**Related:** Preorder (#144), Inorder (#94), Maximum Depth (#104), Diameter of Binary Tree (#543).

**Why this matters:** Easy problem, but the iterative version tests real stack understanding.

**Time spent:** ~20 min