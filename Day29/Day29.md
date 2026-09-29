## Day 29: Strings - Longest Palindromic Substring

**Problem:** LeetCode #5 - Longest Palindromic Substring

**Approach - Expand Around Center:** O(n²) time, O(1) space
- Try every position as a center, twice — once for odd-length palindromes (single char center), once for even-length (gap between two chars)
- Expand outward while characters match on both sides
- Track the longest palindrome found across all centers

**Key learning:** Must handle BOTH odd and even length centers — a common trap that breaks on inputs like "cbbd". Converts brute force O(n³) to O(n²).

**Why this matters:** Frequently asked at Amazon, Microsoft, Meta. Follow-up: O(n) solution exists via Manacher's Algorithm (advanced, good to know exists).

**Time spent:** ~65 min