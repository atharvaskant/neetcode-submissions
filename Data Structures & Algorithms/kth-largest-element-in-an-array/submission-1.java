class Solution {
    public int findKthLargest(int[] nums, int k) {

        int length = nums.length;
        if(length < k) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add k-elements
        for(int num : nums) {

            if(minHeap.size() >= k) {
                int top = minHeap.peek();
                if(top >= num) {
                    continue;
                }
                minHeap.poll();
            }

            minHeap.add(num); 
        }
        return minHeap.peek();
    }
}
