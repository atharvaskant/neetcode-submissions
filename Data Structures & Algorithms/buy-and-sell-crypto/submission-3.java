class Solution {
    public int maxProfit(int[] prices) {

        int i=0, j=1;

        int maxProfit = 0;

        while(j < prices.length) {
            int profit = prices[j] - prices[i];
            if (profit < 0) {
                profit = 0;
                i = j;
            } else {
                j++;
            }
            maxProfit = Math.max(profit, maxProfit);

        }
        return maxProfit;
    }
}
