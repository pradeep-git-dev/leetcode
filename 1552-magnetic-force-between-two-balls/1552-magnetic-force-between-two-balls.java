class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        int low = 1;
        int high = max(position);
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canPlace(mid , position, m)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
        
    }

    public boolean canPlace(int val, int[] arr, int m){
        int c = 1;
        int lastPos = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - lastPos >= val){
                lastPos = arr[i];
                c++;
            }
        }
        if(c >= m) return true;
        return false;
    }

    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}