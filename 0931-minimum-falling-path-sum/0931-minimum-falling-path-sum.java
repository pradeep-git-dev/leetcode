class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int above = dp[i-1][j];
                if(j>0){
                    above = Math.min(above , dp[i-1][j-1]);
                }
                if(j<n-1){
                    above = Math.min(above , dp[i-1][j+1]);
                }
                dp[i][j] = above + matrix[i][j];
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j<n; j++){
            if(dp[n-1][j] < min){
            min = dp[n-1][j];
            }
        }
        return min;
    }
}