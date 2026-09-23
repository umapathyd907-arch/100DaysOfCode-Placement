import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    // LeetCode #215
    // https://leetcode.com/problems/kth-largest-element-in-an-array/

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int answer = findKthLargest(nums, k);

        System.out.println("Kth Largest Element = " + answer);
    }
}