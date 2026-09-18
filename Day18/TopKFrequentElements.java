// LeetCode #347 - Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;

class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create Min Heap
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(
                        (a, b) -> a.getValue() - b.getValue()
                );

        // Step 3: Keep only K most frequent elements
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Store answer
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }

    // Main method for running in VS Code / terminal
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        TopKFrequentElements obj = new TopKFrequentElements();

        int[] result = obj.topKFrequent(nums, k);

        System.out.print("Top " + k + " frequent elements: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}