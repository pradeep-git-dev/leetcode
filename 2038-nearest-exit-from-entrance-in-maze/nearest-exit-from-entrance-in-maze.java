class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        Queue<int[]> pq = new LinkedList<>();
        pq.add(new int[] { 0, entrance[0], entrance[1] });
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cnt = curr[0];
            int r = curr[1];
            int c = curr[2];
            maze[r][c] = '+';

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if ((nr >= 0) && (nr < m) && (nc >= 0) && (nc < n) && (maze[nr][nc] == '.')) {
                    if ((nr == 0 || nr == m - 1) || (nc == 0 || nc == n - 1)) {
                        return cnt + 1;
                    }
                    maze[nr][nc] = '+';
                    pq.add(new int[] { cnt + 1, nr, nc });
                }
            }

        }
        return -1;

    }
}