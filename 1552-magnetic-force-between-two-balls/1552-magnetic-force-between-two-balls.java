class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        long low = 0;
        long high = position[n - 1] - position[0];
        long res = Integer.MAX_VALUE;
        
        while(low <= high){
            long mid = (low + (high - low) / 2);
            if(canPlace(mid, position, m)){
                res = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)res;
        
    }

    public boolean canPlace(long mid , int[] position, int m){
        long cnt = 1;
        long last = position[0];
        for(int i=0; i<position.length; i++){
            if(position[i] - last >= mid){
                cnt++;
                last = position[i];
            }
            if(cnt == m){
                return true;
            }
        }
        return false;
    }
}