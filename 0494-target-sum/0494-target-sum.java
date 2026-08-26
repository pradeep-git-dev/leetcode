class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int offset = total;
        if(Math.abs(target) > total) return 0;
        //dp[idx][currsum]
        int[][] dp = new int[n + 1][2*total+1];
        dp[n][target + offset] = 1;
        
        for(int idx = n-1; idx >=0; idx--){
            for(int sum = -total; sum<= total; sum++){
                int add = 0, sub = 0;
                if(sum + nums[idx] <= total){
                    add = dp[idx+1][sum + offset+ nums[idx]];
                }
                if(sum - nums[idx] >= -total){
                    sub = dp[idx+1][sum + offset - nums[idx]];
                }
                dp[idx][sum + offset] =  add + sub;
            }
        }
        return dp[0][total];
    }
}