class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        if (Math.abs(target) > total) {
            return 0;
        }
        int[][] dp = new int[n + 1][2 * total + 1];
        dp[0][total] = 1;

        for (int i = 1; i <= n; i++) {
            int x = nums[i - 1];
            for (int aSum = -total; aSum <= total; aSum++) { //actual sum = aSum
               int col = aSum + total;
                int ways = 0;
                if (col + x <= 2 * total) {
                    ways += dp[i - 1][col + x];
                }
                if (col - x >= 0) {
                    ways += dp[i - 1][col - x];
                }
                dp[i][col] = ways;
            }
        }
        return dp[n][target + total];

    }
}