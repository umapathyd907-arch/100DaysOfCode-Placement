// LeetCode #1901 - Find a Peak Element II
// https://leetcode.com/problems/find-a-peak-element-ii/

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int maxRow = 0;
            for (int r = 1; r < rows; r++) {
                if (mat[r][mid] > mat[maxRow][mid]) {
                    maxRow = r;
                }
            }

            int current = mat[maxRow][mid];
            int leftVal = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int rightVal = (mid < cols - 1) ? mat[maxRow][mid + 1] : -1;

            if (current > leftVal && current > rightVal) {
                return new int[]{maxRow, mid};
            } else if (leftVal > current) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}