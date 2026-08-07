class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] grid = new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[j][i] = matrix[i][j];
            }
        }
        return grid;
        
    }
}