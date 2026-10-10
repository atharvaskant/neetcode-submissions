class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        int[] result = new int[k];

        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for (int i=0;i<k;i++) {
            result[i] = entryList.get(i).getKey();
        }
        
        return result;
    }
}
