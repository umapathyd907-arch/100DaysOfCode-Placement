## Day 1: Arrays - Two Sum

**Problem:** LeetCode #1 - Two Sum

**Approach 1 - Brute Force:** O(n²) time, O(1) space
- Check every pair with nested loops

**Approach 2 - HashMap (optimal):** O(n) time, O(n) space
- Store each number + index in a HashMap while iterating
- For each number, check if its complement (target - number) already exists
- If yes, return both indices immediately

**Key learning:** HashMap gives O(1) average lookup, trading space for speed.

**Time spent:** ~1 hr