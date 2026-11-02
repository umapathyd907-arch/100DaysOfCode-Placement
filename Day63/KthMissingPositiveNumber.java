// LeetCode #1539 - Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] - (mid + 1) < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left + k;
    }
}