class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        int c = 0;
        while(i<m && j<n){
            if(s.charAt(i) == t.charAt(j)){
                c++;
                i++;
            }
            j++;
        }
        return c == m;
        
    }
}