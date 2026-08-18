class Solution {
    public int islandPerimeter(int[][] grid) {
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] dr = {-1, 0, +1, 0};
        int[] dc = {0, +1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    q.offer(new int[]{i,j});
                    vis[i][j] = true;
                    break;
                }
            }
        }
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int i=0; i<4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(!(nr>=0 && nr<m && nc>=0 && nc<n) || grid[nr][nc] == 0){
                    cnt++;
                }else if(!vis[nr][nc]){
                    q.offer(new int[]{nr , nc});
                    vis[nr][nc] = true;
                }
            }

        }
        return cnt;
        
    }
}