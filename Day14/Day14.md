## Day 14: Arrays/Strings - Group Anagrams

**Problem:** LeetCode #49 - Group Anagrams

**Approach - HashMap with Sorted String as Key:** O(n × k log k) time, where n = number of words, k = max word length
- For each word, sort its characters to create a canonical "key"
- Use a HashMap to group words that share the same sorted key
- Anagrams always produce the same sorted key, so they naturally group together

**Key learning:** This "compute a canonical key, then group by it" pattern is reused in many problems beyond anagrams. Builds directly on Day 3's anagram-checking logic, extended into a grouping problem.

**Why this matters:** Frequently asked at Amazon, Microsoft, Bloomberg, Uber — tests chaining string manipulation with HashMap usage.

**Time spent:** ~45 min