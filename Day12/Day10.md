## Day 12: Dynamic Programming - Maximum Subarray

**Problem:** LeetCode #53 - Maximum Subarray

**Approach - Kadane's Algorithm:** O(n) time, O(1) space
- At each element, decide: extend the current subarray, or start fresh from here
- Take whichever gives a bigger sum: (currentSum + nums[i]) vs (nums[i] alone)
- Track the best sum seen across the whole array

**Key learning:** This is the foundational Dynamic Programming pattern — making the locally best decision at each step based on prior results. Named algorithm (Kadane's) that interviewers expect you to recognize by name.

**Why this matters:** One of THE most frequently asked problems across every company — Amazon, Google, Microsoft, Adobe, Flipkart This is a must-master problem, not optional.

**Time spent:** ~60 min (took time to deeply understand the "extend vs restart" decision)
