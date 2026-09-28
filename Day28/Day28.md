## Day 28: Design - LRU Cache

**Problem:** LeetCode #146 - LRU Cache

**Approach - HashMap + Doubly Linked List:** O(1) time for get and put, O(capacity) space
- HashMap maps key -> node for O(1) lookup
- Doubly linked list keeps usage order (front = most recent, back = least recent)
- Dummy head/tail nodes avoid null edge cases
- On get/put, move the node to the front; when full, evict the node before tail

**Key learning:** Combining two data structures to meet an O(1) requirement. Real-world use: browser cache, database caching, CPU cache.

**Why this matters:** Very frequently asked design-style question at Amazon, Microsoft, Google, Uber, Flipkart.

**Time spent:** ~70 min