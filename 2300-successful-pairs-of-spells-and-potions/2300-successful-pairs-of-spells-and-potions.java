class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m = spells.length;
        int n = potions.length;
        int[] res = new int[m];
        Arrays.sort(potions);

        for(int i=0; i<m; i++){
            int val = spells[i];
            int low = 0;
            int high = n-1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                long r = (long)(val) * potions[mid];
                if(r >= success){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            res[i] = n - low;
        }
        return res;
        
    }
}