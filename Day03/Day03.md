## Day 3: Strings - Valid Anagram

**Problem:** LeetCode #242 - Valid Anagram

**Approach - Array Frequency Count:** O(n) time, O(1) space
- Check if lengths match first (quick fail-fast check)
- Use int[26] to count character frequency — increment for s, decrement for t
- If all counts end at 0, strings are anagrams

**Key learning:** Fixed-size array (26 letters) is more space-efficient than HashMap when dealing with just lowercase English letters.

**Time spent:** ~30 min