class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int score = 0;
        int max = 0;

        int i=0; int j=n-1;
        while(i<=j){
            if(tokens[i] <= power){
                score++;
                power-=tokens[i];
                i++;
                max = Math.max(max , score);
            }else if(score > 0){
                score--;
                power+=tokens[j];
                j--;
            }else{
                i++;
                j--;
            }
        }
        return max;
        
    }
}