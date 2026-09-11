
// LeetCode #3 - Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
            
            window.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}