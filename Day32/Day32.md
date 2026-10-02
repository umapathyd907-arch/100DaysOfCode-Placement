## Day 32: Trees/BST - Lowest Common Ancestor of a BST

**Problem:** LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree

**Approach - Exploit BST Property (Iterative):** O(h) time (h = tree height), O(1) space
- At each node, compare both p.val and q.val to current node's value
- If both smaller, go left. If both bigger, go right.
- Otherwise (paths diverge, or one matches current node), current node IS the LCA

**Key learning:** Recognizing the BST ordering property avoids needing the more complex generic Binary Tree LCA approach (which requires searching both subtrees recursively). Know the difference between this (#235, BST) and the general version (#236, no ordering to exploit).

**Why this matters:** Tests whether you default to a generic solution or recognize exploitable structure. Clean, confidence-building problem — simple to explain and code correctly.

**Time spent:** ~45 min