// LeetCode #2226 - Maximum Candies Allocated to K Children
// https://leetcode.com/problems/maximum-candies-allocated-to-k-children/

class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = 0;
        for (int c : candies) {
            right = Math.max(right, c);
        }

        while (left < right) {
            int mid = left + (right - left + 1) / 2;

            if (canGive(candies, k, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean canGive(int[] candies, long k, int size) {
        long count = 0;
        for (int c : candies) {
            count += c / size;
        }
        return count >= k;
    }
}