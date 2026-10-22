## Day 52: Arrays/Matrix - Find Missing and Repeated Values

**Problem:** LeetCode #2965 - Find Missing and Repeated Values
(Grid version of Set Mismatch #645 and the GFG "Missing and Repeating" problem)

**Approach - Frequency Array:** O(n^2) time, O(n^2) space
- Count every grid value in an array of size n*n + 1
- Value with count 2 is the repeated one; value with count 0 is the missing one

**Alternatives:** Sum and sum-of-squares math using long (O(1) space); negation trick on the flattened index (row = idx / n, col = idx % n), which modifies the input.

**Key learning:** A 2D grid can be treated as a flat list of values when order doesn't matter. Same missing/repeating pattern as Set Mismatch, only the input shape changes.

**Why this matters:** Common array/hashing question; tests whether you can spot the same pattern in a new shape and discuss the space trade-off.

**Time spent:** ~20 min