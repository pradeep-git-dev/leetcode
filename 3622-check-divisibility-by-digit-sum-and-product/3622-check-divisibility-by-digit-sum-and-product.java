class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int k = n;
        while(k !=0){
            int r = k % 10;
            sum += r;
            prod *= r;
            k /= 10;
        }
        return n % (sum + prod) == 0;
        
    }
}