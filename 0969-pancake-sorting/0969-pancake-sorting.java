class Solution {
    public void reverse(int[] arr , int idx){
        int left = 0;
        int right = idx;
        while(left <= right){
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int max(int[] arr, int idx){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=idx; i++){
            max = Math.max(max , arr[i]);
        }
        return max;
    }

    public int pos(int[] arr , int val){
        int pos = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == val){
                pos = i;
            }
        }
        return pos;
    }
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        if(Arrays.equals(arr , sorted)) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int i = 1;
        while(!Arrays.equals(arr,sorted)){
            int max = max(arr,n-i);
            int pos = pos(arr,max);
            if(max != arr[n-i]){
                res.add(pos+1);
                reverse(arr, pos);
                res.add(n-i+1);
                reverse(arr , n-i);
            }
            i++;
        }
        return res;
        
    }
}