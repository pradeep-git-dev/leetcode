class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }
        int[][] dist = new int[n][k + 1];
        for(int[] edge :dist){
            Arrays.fill(edge , Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0] , b[0]));
        dist[0][1] = 0;
        pq.add(new int[]{0, 0, 1});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int u = curr[1];
            int c = curr[2];
            if(d > dist[u][c]) continue;
            if( u == n-1) return d;
            for(int[] edge : adj.get(u)){
                int v = edge[0];
                int w = edge[1];
                int nc = labels.charAt(u) == labels.charAt(v) ? c + 1 : 1;
                if(nc > k) continue;
                if(d + w < dist[v][nc]){
                    dist[v][nc] = d + w;
                    pq.offer(new int[]{dist[v][nc] , v , nc});
                }
            }

        }
        return -1;
        
    }
}