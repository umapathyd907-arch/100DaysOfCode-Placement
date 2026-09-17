// LeetCode #56 - Merge Intervals
// https://leetcode.com/problems/merge-intervals/

import java.util.*;

class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] lastMerged = result.get(result.size() - 1);
            int[] current = intervals[i];

            if (current[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], current[1]);
            } else {
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        MergeIntervals obj = new MergeIntervals();

        int[][] result = obj.merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}