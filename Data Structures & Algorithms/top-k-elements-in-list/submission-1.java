class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num:nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int[] result = new int[k];

            PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                minHeap.add(entry);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
            for (int i=0;i<k;i++) {
                result[i] = minHeap.poll().getKey();
            }
            return result;
        }
}
