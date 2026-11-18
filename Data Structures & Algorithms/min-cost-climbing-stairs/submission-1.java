class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);

        return dfs(cost, dp, cost.length);
        
    }


    int dfs(int[] cost, int[] dp, int i) {

        if(i==0 || i==1) {
            return 0;
        }


        if(dp[i] != -1) {
            return dp[i];
        }


        return dp[i] = Math.min(dfs(cost, dp, i-1) + cost[i-1], dfs(cost, dp, i-2) + cost[i-2]);
    }
}
