// LeetCode #1760 - Minimum Limit of Balls in a Bag
// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for (int n : nums) {
            right = Math.max(right, n);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (operationsNeeded(nums, mid) <= maxOperations) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long operationsNeeded(int[] nums, int limit) {
        long ops = 0;
        for (int n : nums) {
            ops += (n - 1) / limit;
        }
        return ops;
    }
}