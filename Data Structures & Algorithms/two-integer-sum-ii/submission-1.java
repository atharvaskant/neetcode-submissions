class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] pair = new int[2];

        int l = 0, r = numbers.length-1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                pair[0] = l+1;
                pair[1] = r+1;
                return pair;
            }
        }
        return pair;
    }
}
