class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
 
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0;j--){
                int val = dungeon[i][j];
                if( i== m-1 && j == n-1){
                    dp[i][j] = Math.max(1 , 1 - val);
                }
                else if(i == m -1 ){
                    dp[i][j] = Math.max( 1 , dp[i][j + 1] - val);
                }
                else if(j == n-1){
                    dp[i][j] = Math.max(1 , dp[i + 1][j] - val);
                }else{
                    int min = Math.min(dp[i+1][j] , dp[i][j+1]);
                    dp[i][j] = Math.max(1 , min - val);
                }
                
            }
        }

        return dp[0][0];
        
    }
}