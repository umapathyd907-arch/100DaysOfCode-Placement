// LeetCode #1482 - Minimum Number of Days to Make m Bouquets
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long needed = (long) m * k;
        if (needed > bloomDay.length) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = 0;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int run = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                run++;
                if (run == k) {
                    bouquets++;
                    run = 0;
                }
            } else {
                run = 0;
            }
        }

        return bouquets >= m;
    }
}