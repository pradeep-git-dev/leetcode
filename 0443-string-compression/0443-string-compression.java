class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        while( i<chars.length){
            int c = 0;
            char ch = chars[i];
            while(i < chars.length && chars[i] == ch){
                c++;
                i++;
            }
            chars[idx++] = ch;
            if(c > 1){
                for(char digit : Integer.toString(c).toCharArray()){
                    chars[idx++] = digit;
                }
            }
            
        }
        return idx;
        
    }
}