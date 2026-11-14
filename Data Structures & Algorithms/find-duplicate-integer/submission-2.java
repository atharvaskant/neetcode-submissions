class Solution {
    public int findDuplicate(int[] nums) {

        int[] lookup = new int[nums.length];

        for(int i=0;i<nums.length;i++) {

            if(lookup[nums[i]] == 1) {
                return nums[i];
            }

            lookup[nums[i]] = 1;
        }
        return -1;
    }
}
