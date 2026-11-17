class Solution {
    public int findKthLargest(int[] nums, int k) {

        int length = nums.length;
        if(length < k) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add k-elements
        for(int num : nums) {
            minHeap.add(num);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return !minHeap.isEmpty() ? minHeap.peek() : -1;
    }
}
