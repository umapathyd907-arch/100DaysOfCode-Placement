// LeetCode #410 - Split Array Largest Sum
// https://leetcode.com/problems/split-array-largest-sum/

class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (int n : nums) {
            left = Math.max(left, n);
            right += n;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (piecesNeeded(nums, mid) <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int piecesNeeded(int[] nums, int cap) {
        int pieces = 1;
        int sum = 0;

        for (int n : nums) {
            if (sum + n > cap) {
                pieces++;
                sum = 0;
            }
            sum += n;
        }

        return pieces;
    }
}