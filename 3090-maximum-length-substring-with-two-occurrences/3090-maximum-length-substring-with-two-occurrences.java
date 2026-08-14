class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0;
        Map<Character , Integer> map = new HashMap<>();
        int max = 0;

        for(int right = 0; right <n; right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch,0) + 1);   
            while(map.get(ch) > 2){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            max = Math.max(max , right - left + 1);
        }
        return max;
    }
}