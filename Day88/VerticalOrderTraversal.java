// LeetCode #987 - Vertical Order Traversal of a Binary Tree
// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

import java.util.*;

class Solution {
    private List<int[]> nodes;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        nodes = new ArrayList<>();
        dfs(root, 0, 0);

        nodes.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for (int[] n : nodes) {
            if (n[0] != prevCol) {
                result.add(new ArrayList<>());
                prevCol = n[0];
            }
            result.get(result.size() - 1).add(n[2]);
        }

        return result;
    }

    private void dfs(TreeNode node, int row, int col) {
        if (node == null) {
            return;
        }
        nodes.add(new int[]{col, row, node.val});
        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }
}
