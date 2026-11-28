// LeetCode #662 - Maximum Width of Binary Tree
// https://leetcode.com/problems/maximum-width-of-binary-tree/

import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Long> indexes = new LinkedList<>();
        nodes.offer(root);
        indexes.offer(0L);

        long maxWidth = 0;

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            long first = indexes.peek();
            long last = first;

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                long index = indexes.poll() - first;
                last = index;

                if (node.left != null) {
                    nodes.offer(node.left);
                    indexes.offer(2 * index);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                    indexes.offer(2 * index + 1);
                }
            }

            maxWidth = Math.max(maxWidth, last + 1);
        }

        return (int) maxWidth;
    }
}