// LeetCode #133 - Clone Graph
// https://leetcode.com/problems/clone-graph/

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return dfs(node, new HashMap<>());
    }

    private Node dfs(Node node, Map<Node, Node> copies) {
        if (copies.containsKey(node)) {
            return copies.get(node);
        }

        Node clone = new Node(node.val);
        copies.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, copies));
        }

        return clone;
    }
}
