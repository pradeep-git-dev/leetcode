class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = Integer.MIN_VALUE;
        int n = piles.length;
        int low = 1;
        int high = findMax(piles);

        while(low <= high){
            int mid = low + (high - low ) / 2;
            if(canEat(piles , h, mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return low;
        
    }

    public int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int num : piles){
            max = Math.max(max , num);
        }
        return max;
    }

    public boolean canEat(int[] piles, int h, int mid){
        long total = 0;
        for(int p : piles){
            total += (long)(p + mid - 1)/ mid;
            if(total > h) return false;
        }
        return true;
    }
}