class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        for(right = 0; right < n; right++){
            if(nums[right] == 0) k--;
            if(k < 0 && nums[left++] == 0){
                k++;
            }
        }

        return right - left;
        
    }
}