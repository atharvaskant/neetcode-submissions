class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);
        
        return helper(nums, dp, n-1);
    }

    int helper(int[] nums, int[] dp, int i) {

        if(i < 0) {
            return 0;
        }
        
        if(i == 0) {
            return nums[0];
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        return dp[i] = Math.max(helper(nums, dp, i-1), helper(nums, dp, i-2) + nums[i]);

    }
}
