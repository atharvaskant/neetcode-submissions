class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length()+1][text2.length()+1];

        for(int[] arr:dp) {
            Arrays.fill(arr, 0);
        }

        for(int i=0;i<text1.length();i++) {
            for(int j=0;j<text2.length();j++){
                if(text1.charAt(i) == text2.charAt(j)) {
                    dp[i+1][j+1] = 1 + dp[i][j];
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
        
    }

    // int helper(String s1, String s2, int i, int j, int[][] dp) {
    //     if(i >= s1.length() || j >= s2.length()) {
    //         return dp[i][j] = 0;
    //     }

    //     if(dp[i][j] != -1){
    //         return dp[i][j];
    //     }

    //     if(s1.charAt(i) == s2.charAt(j)) {
    //         return dp[i][j] = 1 + helper(s1, s2, i+1, j+1, dp);
    //     } else {
    //         return dp[i][j] = Math.max(
    //             helper(s1,s2,i+1,j,dp),
    //             helper(s1,s2,i,j+1,dp)
    //             );        
                
    //     }

    // }
}
