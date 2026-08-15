class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        if(allZeroes(nums)) return 0;
        int ans = n;
        int xor = 0;

        for(int i=0; i<n; i++){
            xor ^= nums[i];
        }
        if(xor > 0) return ans;
        return ans - 1;
    }

    public boolean allZeroes(int[] nums){
        for(int num: nums){
            if(num !=0){
                return false;
            }
        }
        return true;
    }
}