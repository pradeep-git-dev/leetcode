class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l =0; int r = s.length()-1;
        while(l<=r){
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);
            if(isNotVowel(c1)){
                l++;
            }
            if(isNotVowel(c2)){
                r--;
            }
            if(!isNotVowel(c1) && !isNotVowel(c2)){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }

    public boolean isNotVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U' ){
            return false;
        }
        return true;
    }
}