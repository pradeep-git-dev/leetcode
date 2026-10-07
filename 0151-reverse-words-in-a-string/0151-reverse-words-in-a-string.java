class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int l = 0;
        int r = words.length - 1;
        while(l <= r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }

        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(!word.isEmpty()){
                if(sb.length() > 0){
                    sb.append(" ");
                }
                sb.append(word);
            }
        }

        return sb.toString();
        
    }
}