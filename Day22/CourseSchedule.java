// LeetCode #207 - Course Schedule
// https://leetcode.com/problems/course-schedule/

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        
        int[] state = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, state, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(List<List<Integer>> graph, int[] state, int course) {
        if (state[course] == 1) {
            return false;
        }
        
        if (state[course] == 2) {
            return true;
        }
        
        state[course] = 1;
        
        for (int prereq : graph.get(course)) {
            if (!dfs(graph, state, prereq)) {
                return false;
            }
        }
        
        state[course] = 2;
        return true;
    }
}