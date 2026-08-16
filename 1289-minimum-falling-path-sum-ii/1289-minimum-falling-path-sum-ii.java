class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] matrix = grid;
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (dp[i - 1][j] < min1) {
                    min2 = min1;
                    min1 = dp[i - 1][j];
                    idx = j;
                } else if (dp[i - 1][j] < min2) {
                    min2 = dp[i - 1][j];
                }
            }
            for (int j = 0; j < n; j++) {
                if (j == idx) {
                    dp[i][j] = matrix[i][j] + min2;
                } else {
                    dp[i][j] = matrix[i][j] + min1;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (dp[n - 1][j] < min) {
                min = dp[n - 1][j];
            }
        }
        return min;
    }
}