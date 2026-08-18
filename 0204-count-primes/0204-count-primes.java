class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime , true);
        if(n>=0) prime[0] = false;
        if(n>=1) prime[1] = false;
        for(int p = 2; p * p <=n; p++){
            if(prime[p]){
                for(int i = p * p; i <= n; i+=p){
                    prime[i] = false;
                }
            }
        }
        int c = 0;
        for(int i=0; i<prime.length - 1; i++){
            if(prime[i]){
                c++;
            }
        }
        return c;
        
    }
}