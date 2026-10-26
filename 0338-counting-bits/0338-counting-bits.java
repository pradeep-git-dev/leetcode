class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];

        for(int i=0; i<=n; i++){
            res[i] = count(i);
        }
        return res;  
    }

    public int count(int num){
        int c = 0;
        while(num > 0){
            c++;
            num = num & (num- 1);
        }
        return c;
    }
}