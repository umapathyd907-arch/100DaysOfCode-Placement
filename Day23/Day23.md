**## Day 23: Arrays/Heap - Kth Largest Element in an Array**

****Problem:**** LeetCode #215 - Kth Largest Element in an Array

****Approach - Min Heap (Priority Queue):**** O(N log K) time, O(K) space

- Create a Min Heap using Java's `PriorityQueue`

- Add every element of the array into the heap

- If the heap size becomes greater than `K`, remove the smallest element using `poll()`

- This ensures the heap always contains the `K` largest elements

- After processing all elements, `peek()` gives the Kth largest element

****Key learning:**** A Min Heap can efficiently maintain the K largest elements without sorting the entire array. The smallest element among the K largest elements stays at the top of the heap.

****Why this matters:**** The Min Heap pattern is widely used in interviews for Kth largest/smallest problems, Top K problems, priority-based processing, and streaming data. It is also a useful foundation for understanding more advanced Heap and Priority Queue problems.

****Time spent:**** ~60 min
