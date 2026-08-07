class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int ans = 0;
        int max = 0;
        for(int num : candies){
            sum += num;
            max = Math.max(max , num);
        }
        if(sum < k) return 0;
        int low = 1; 
        int high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canAllocate(mid, candies , k )){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
        
    }

    public boolean canAllocate(int limit, int[] candies, long k){
        long c = 0;
        for(int num : candies){
            c += num / limit;
        }
        if(c >= k) return true;
        return false;
    }
}