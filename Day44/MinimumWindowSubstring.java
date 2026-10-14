// LeetCode #76 - Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int missing = t.length();
        int left = 0;
        int bestStart = 0;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            if (need[r] > 0) {
                missing--;
            }
            need[r]--;

            while (missing == 0) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }

                char l = s.charAt(left);
                need[l]++;
                if (need[l] > 0) {
                    missing++;
                }
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
