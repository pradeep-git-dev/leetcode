class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int c = 0;
        Map<List<Integer> , Integer> map = new HashMap<>();

        for(int[] edge : grid){
            List<Integer> li = new ArrayList<>();
            for(int num : edge){
                li.add(num);
            }
            map.put(li, map.getOrDefault(li, 0) + 1);
        }

        for(int j=0; j<n; j++){
            List<Integer> li = new ArrayList<>();
            for(int i=0; i<n; i++){
                li.add(grid[i][j]);

            }
            if(map.containsKey(li)){
                c+= map.getOrDefault(li , 0);
            }
        }
        return c;
        
    }
}