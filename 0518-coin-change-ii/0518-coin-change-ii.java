class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount + 1];

        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }

        for(int idx = n-1; idx>=0; idx--){
            for(int rem = 0; rem <= amount; rem++){
                int skip = dp[idx+1][rem];
                int pick = 0;
                if(coins[idx] <= rem){
                    pick = dp[idx][rem - coins[idx]];
                }
                dp[idx][rem] = skip + pick;
            }
        }
        return dp[0][amount];
        
    }
}