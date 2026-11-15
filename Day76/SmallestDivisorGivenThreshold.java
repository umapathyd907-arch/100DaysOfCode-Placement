// LeetCode #1283 - Find the Smallest Divisor Given a Threshold
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for (int n : nums) {
            right = Math.max(right, n);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (sumOfCeilings(nums, mid) <= threshold) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long sumOfCeilings(int[] nums, int divisor) {
        long sum = 0;
        for (int n : nums) {
            sum += (n + divisor - 1) / divisor;
        }
        return sum;
    }
}