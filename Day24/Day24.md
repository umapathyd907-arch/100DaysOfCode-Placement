## Day 24: Arrays/Prefix Sum - Subarray Sum Equals K

**Problem:** LeetCode #560 - Subarray Sum Equals K

**Approach - Prefix Sum + HashMap:** O(n) time, O(n) space
- Track running prefix sum and a HashMap of {prefixSum: occurrence count}
- At each step, check if (currentPrefixSum - k) exists in the map — its count tells how many valid subarrays end here
- Initialize map with {0: 1} to correctly handle subarrays starting at index 0

**Key learning:** Prefix Sum + HashMap is a reusable combo for subarray sum problems. The {0:1} initialization is a critical edge case — easy to forget, causes wrong answers.

**Why this matters:** Converts O(n²) brute force to O(n). Reused in variants: Continuous Subarray Sum, Subarray Sums Divisible by K, Binary Subarrays with Sum.

**Time spent:** ~60 min