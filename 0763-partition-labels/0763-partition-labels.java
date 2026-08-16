class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        List<Integer> res = new ArrayList<>();
        int left = -1;
        int right = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            right = Math.max(right, map.get(ch));
            if(right == i){
                res.add(right - left);
                left = right;
            }
        }
        return res;
    }
}