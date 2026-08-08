class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        int min = Integer.MAX_VALUE;
        for(int num : time){
            if(num < min){
                min = num;
            }
        }

        long low = 1;
        long high = (long)min * totalTrips;
        long ans = 0;

        while(low <= high){
            long mid = low + (high - low) / 2;
            if(canPass(mid , time, totalTrips)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
        
    }

    public boolean canPass(long val, int[] time, int total){
        long trips = 0;
        for(int num : time){
            trips += val / num;
        }
        return trips >=total;
    }
}