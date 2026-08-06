class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;
        int m = routes.length;
        int n = routes[0].length;
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<Integer>(m);
        for(int i=0; i<m; i++){
            Arrays.sort(routes[i]);
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            for(int j= i+1; j<m; j++){
                int x = 0; int y =0;
                while(x < routes[i].length && y < routes[j].length){
                    if(routes[i][x] == routes[j][y]){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                        break;
                    }
                    else if(routes[i][x] < routes[j][y]){
                        x++;
                    }else{
                        y++;
                    }
                }
            }
        }

        for(int i=0; i<m; i++){
            int[] arr = routes[i];
            for(int x = 0; x< arr.length; x++){
                if(arr[x] == source){
                    q.add(i);
                    set.add(i);
                    break;
                }
            }
        }
        int buses = 1;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int curr = q.poll();
                int[] arr = routes[curr];
                for(int x =0; x < arr.length; x++){
                    if(arr[x] == target){
                        return buses;
                    }
                }
            

                for(int nei : adj.get(curr)){
                    if(!set.contains(nei)){
                        set.add(nei);
                        q.add(nei);
                    }
                }
            }
            buses++;
        }
        return -1;
        
    }
}