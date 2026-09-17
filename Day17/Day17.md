## Day 17: Arrays/Sorting - Merge Intervals

**Problem:** LeetCode #56 - Merge Intervals

**Approach - Sort then Sweep:** O(n log n) time (dominated by sorting), O(n) space

* Sort intervals by start time
* Compare each interval with the last merged interval
* If they overlap (`current start <= last end`), merge them
* Use `Math.max()` to keep the larger end value
* Otherwise, add the current interval as a new merged interval

**Key learning / common pitfalls:**

* Use `<=` to correctly handle touching intervals like `[1,4]` and `[4,5]`
* Use `Math.max()` for the merged end
* Don't simply replace the end with the current interval's end because the current interval may be completely inside the previous interval

**Why this matters:** Important interview pattern for interval problems. The same technique is useful for scheduling and related problems like Insert Interval, Meeting Rooms, and Employee Free Time.

**Time spent:** ~55 min
