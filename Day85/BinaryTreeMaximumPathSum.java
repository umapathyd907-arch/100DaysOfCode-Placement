// LeetCode #124 - Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/

class Solution {
    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(0, gain(node.left));
        int rightGain = Math.max(0, gain(node.right));

        maxSum = Math.max(maxSum, node.val + leftGain + rightGain);

        return node.val + Math.max(leftGain, rightGain);
    }
}