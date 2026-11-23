## Day 84: Trees - Diameter of Binary Tree

**Problem:** LeetCode #543 - Diameter of Binary Tree

**Approach - Height Function with a Side Update:** O(n) time, O(h) space
- height(node) returns the node's height in nodes
- At every node, the longest path bending there is left + right (in edges); keep the maximum in a field
- Return 1 + max(left, right) to the parent, since a path going up can use only one branch

**Key learning:** The diameter may not pass through the root, so check every node. "Return one value up, update the answer on the side" is the pattern behind Binary Tree Maximum Path Sum (#124).

**Related:** Maximum Depth (#104), Balanced Binary Tree (#110), Max Path Sum (#124).

**Why this matters:** Very common Easy tree problem at Meta, Amazon, Google, Microsoft.

**Time spent:** ~15 min