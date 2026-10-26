class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        while(a!=0 || b!=0 || c!=0){
            if(c%2 ==0){
                res += a%2 + b%2;
            }else if(a%2 == 0 && b%2 == 0){
                res += 1;
            }
            a /= 2;
            b /=2;
            c /= 2;
        }
        return res;
    }
}