class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if((sum & 1) == 1) return false;
        sum = sum / 2;
        
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for(int num : nums){
            for(int s = sum; s>=num; s--){
                dp[s] = dp[s-num] || dp[s];
            }
        }
        return dp[sum];

        
    }
}