## Day 18: Heap/Priority Queue - Top K Frequent Elements

**Problem:** LeetCode #347 - Top K Frequent Elements

**Approach - HashMap + Sort by Frequency:** O(n log n) time, O(n) space
- Count frequency of each number using a HashMap
- Sort unique numbers by their frequency, descending
- Take the first k elements from the sorted list

**Alternative approach (more optimal):** HashMap + Min-Heap of size k gives O(n log k) instead of O(n log n) — better when k is much smaller than n. Worth knowing for interview follow-up questions like "can you avoid sorting everything?"

**Key learning:** Sorting is the simpler, very acceptable solution. The heap-based approach is a nice optimization to mention if asked to improve efficiency.

**Time spent:** ~55 min