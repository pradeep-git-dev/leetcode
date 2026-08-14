class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        if(n<k) return 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int left = 0;
        int max = 0;
        int vow = 0;
        
        for(int right = 0; right <k; right++){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                vow++;
            }
            max = Math.max(vow , max);
        }

        for(int right = k; right <n; right++){
            char ch = s.charAt(right);
            char c = s.charAt(left);
            if(set.contains(c)){
                vow--;
            }
            left++;
            if(set.contains(ch)){
                vow++;
            }
            max = Math.max(vow , max);
        }
        return max;
        
    }
}