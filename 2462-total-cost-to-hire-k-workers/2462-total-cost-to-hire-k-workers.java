class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long cost = 0;
        PriorityQueue<Integer> lq = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>();
        int left = 0;
        int right = costs.length - 1;

        for(int i=0; i<candidates; i++){
            lq.add(costs[left++]);
        }
        for(int i=0; i<candidates && left <=right; i++){
            rq.add(costs[right--]);
        }

        for(int i=0; i<k; i++){
            if(!rq.isEmpty() && (lq.isEmpty() || lq.peek() > rq.peek())){
                cost += rq.poll();
            
                if(left <= right){
                    rq.add(costs[right--]);
                }
            }else{
                cost += lq.poll();
                if(left <= right){
                    lq.add(costs[left++]);
                }
            }
        }
        return cost;
        
    }
}