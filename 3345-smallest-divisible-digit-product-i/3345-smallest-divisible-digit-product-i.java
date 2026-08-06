class Solution {
    public int smallestNumber(int n, int t) {
         for(int i=n; i<1000; i++){
            int prod = 1;
            int temp = i;
            while(temp!=0){
                int r = temp % 10;
                temp = temp / 10;
                prod *= r; 
            }
            if(prod % t == 0){
               return i;
            }
        }
        return -1;
    }
}