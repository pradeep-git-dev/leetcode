class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        if(allZeroes(nums)) return 0; // all zero then ans is zero
        int ans = n;
        int xor = 0;

        for(int i=0; i<n; i++){
            xor ^= nums[i];
        }
        if(xor > 0) return ans; // if xor > 0, whole array len is ans 
        return ans - 1; // if xor is 0 then remove one ele to make longest length
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