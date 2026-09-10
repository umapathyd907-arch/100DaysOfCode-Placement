// LeetCode #1295 - Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/



class Solution {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {

        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }

        return false;
    }

    static int digits(int num) {

        int count = 0;

        while (num > 0) {

            count++;
            num = num / 10;
        }

        return count;
    }
}