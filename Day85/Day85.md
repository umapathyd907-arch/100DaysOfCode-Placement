## Day 85: Trees - Binary Tree Maximum Path Sum

**Problem:** LeetCode #124 - Binary Tree Maximum Path Sum (HARD)

**Approach - Gain Function with a Side Update:** O(n) time, O(h) space
- gain(node) = best sum of a downward path that starts at node
- leftGain and rightGain are clamped with max(0, ...) so negative branches are ignored
- Best path bending at this node = node.val + leftGain + rightGain; keep the global maximum
- Return node.val + max(leftGain, rightGain) to the parent (a path going up uses one branch)

**Key learning:** Same pattern as Diameter (Day 84): return one value up, update the answer on the side. New parts: clamp negative gains, and start the maximum at Integer.MIN_VALUE for all-negative trees.

**Related:** Diameter of Binary Tree (#543), Longest Univalue Path (#687), House Robber III (#337).

**Why this matters:** Famous Hard tree problem at Meta, Google, Amazon, Microsoft.

**Time spent:** ~30 min