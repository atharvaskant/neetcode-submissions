class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] pair = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers[0], 0);
        for (int i=1; i< numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                pair[0] = map.get(target - numbers[i]) + 1;
                pair[1] = i + 1;
            }
            map.putIfAbsent(numbers[i], i);
        }
        return pair;
    }
}
