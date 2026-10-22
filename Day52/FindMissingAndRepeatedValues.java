// LeetCode #2965 - Find Missing and Repeated Values
// https://leetcode.com/problems/find-missing-and-repeated-values/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];

        for (int[] row : grid) {
            for (int value : row) {
                count[value]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for (int v = 1; v <= n * n; v++) {
            if (count[v] == 2) {
                repeated = v;
            } else if (count[v] == 0) {
                missing = v;
            }
        }

        return new int[]{repeated, missing};
    }
}