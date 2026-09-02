## Day 2: Arrays - Contains Duplicate

**Problem:** LeetCode #217 - Contains Duplicate

**Approach - HashSet:** O(n) time, O(n) space
- Loop through array, check if current number already exists in HashSet
- If yes, return true (duplicate found)
- If no, add it to the set and continue
- If loop finishes with no match, return false

**Key learning:** HashSet is ideal when you only need to track "have I seen this value" — no need for key-value pairs like HashMap.

**Time spent:** ~30 min