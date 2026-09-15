## Day 15: Binary Search - Binary Search

**Problem:** LeetCode #704 - Binary Search

**Approach - Classic Binary Search:** O(log n) time, O(1) space
- Maintain a search range with left and right pointers
- Compare the middle element to the target
- Eliminate half the search space each iteration based on the comparison
- Return the index if found, -1 if the range collapses without a match

**Key learning / common pitfalls:**
- Use `left <= right` (not `<`) — otherwise the final single-element check gets skipped
- Calculate mid as `left + (right - left) / 2` to avoid integer overflow on large arrays
- Always move past mid (`mid + 1` / `mid - 1`) to avoid infinite loops

**Why this matters:** Foundational algorithm reused inside many harder problems (Search in Rotated Sorted Array, Find First/Last Position, Koko Eating Bananas). Interviewers expect a bug-free from-scratch implementation.

**Time spent:** ~45 min