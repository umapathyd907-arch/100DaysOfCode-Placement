## Day 8: Sliding Window - Longest Substring Without Repeating Characters

**Problem:** LeetCode #3 - Longest Substring Without Repeating Characters

**Approach - Sliding Window with HashSet:** O(n) time, O(min(n, charset size)) space
- Two pointers (left, right) define a window
- Expand right, add characters to a HashSet
- If a repeat is found, shrink from left until the repeat is removed
- Track the maximum window size seen

**Key learning:** Sliding Window turns an O(n²) brute-force substring check into O(n). This pattern is reused in many high-frequency interview problems (Minimum Window Substring, Longest Repeating Character Replacement, Longest Substring with K Distinct Characters).

**Why this matters:** One of the most commonly asked questions at top product companies (Google, Amazon, Microsoft, Meta).

**Time spent:** ~50 min