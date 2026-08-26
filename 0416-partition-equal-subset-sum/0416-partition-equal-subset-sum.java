class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int target = sum / 2;
        if(sum % 2 != 0) return false;
        boolean[][] dp = new boolean[n+1][target+ 1];
        //dp[idx][rem]
        // if rem == 0 ---> true; since target is reached
        for(int i=0; i<=n; i++){
            dp[i][0] = true;
        }

        for(int idx = n-1; idx>=0; idx--){
            for(int rem = 1; rem <= target; rem++){
                boolean skip = dp[idx+1][rem];
                boolean pick = false;
                if(nums[idx] <= rem){
                    pick = dp[idx + 1][rem - nums[idx]];
                }
                dp[idx][rem] = pick || skip;
            }
        }

        return dp[0][target];
        
    }
}