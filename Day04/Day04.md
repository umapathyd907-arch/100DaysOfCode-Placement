## Day 4: Two Pointers - Valid Palindrome

**Problem:** LeetCode #125 - Valid Palindrome

**Approach - Two Pointers:** O(n) time, O(1) space
- Use left pointer (start) and right pointer (end), move them toward each other
- Skip non-alphanumeric characters on either side
- Compare characters case-insensitively (convert both to lowercase)
- If mismatch found, return false immediately
- If pointers meet without mismatch, return true

**Key learning:** Two Pointers technique avoids creating a new cleaned string, saving space. This pattern reappears in many problems (Reverse String, Container With Most Water, 3Sum, etc.)

**Time spent:** ~40 min