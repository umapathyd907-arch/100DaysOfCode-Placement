## Day 9: Stack - Valid Parentheses

**Problem:** LeetCode #20 - Valid Parentheses

**Approach - Stack (LIFO):** O(n) time, O(n) space
- Push opening brackets onto a stack
- On a closing bracket, pop the stack and check it matches the correct opening type
- If stack is empty when trying to pop, or bracket types don't match, return false
- At the end, stack must be empty for the string to be valid

**Key learning:** Stacks are perfect for "most recent first" matching problems. This exact pattern (LIFO matching) appears in compilers, JSON/XML parsers, and expression evaluators — not just interview questions.

**Why this matters:** Extremely high-frequency question — tests real understanding of stack behavior, not just memorization.

**Time spent:** ~40 min