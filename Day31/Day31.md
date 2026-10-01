## Day 31: Design/Trees - Implement Trie (Prefix Tree)

**Problem:** LeetCode #208 - Implement Trie (Prefix Tree)

**Approach - Tree of Characters with End-of-Word Flags:** O(m) time per operation (m = word/prefix length)
- Each TrieNode has 26 children slots (a-z) and an isEndOfWord flag
- insert: walk/create path letter by letter, mark final node as end of word
- search: walk path, require BOTH path exists AND isEndOfWord flag is true
- startsWith: walk path, only require path exists (ignore the flag)

**Key learning:** A Trie organizes words by shared prefixes, making prefix-based lookups very efficient. The shared findNode() helper avoids duplicating path-walking logic between search and startsWith.

**Why this matters:** Backbone of autocomplete systems, spell checkers. Directly used in Word Search II, Longest Word in Dictionary. Tests data structure design skill, not just algorithm application.

**Time spent:** ~60 min