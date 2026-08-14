class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        int MOD = 1_000_000_007;
        long[] dp = new long[n+1];
        int[] lastSeen = new int[27];
        Arrays.fill(lastSeen , -1);
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            dp[i] = (2 * dp[i-1] ) % MOD;  // distinct subsequences formula
            char ch = s.charAt(i-1);
            if(lastSeen[ch - 'a'] != -1){
                dp[i] = (dp[i] - dp[lastSeen[ch - 'a'] - 1] + MOD) % MOD;
            }
            lastSeen[ch - 'a'] = i;
        }
        return (int)(dp[n] +MOD- 1) % MOD;    // exclude ""
        
    }
}