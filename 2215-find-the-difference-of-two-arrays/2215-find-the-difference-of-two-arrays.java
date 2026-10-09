class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int num : nums1){
            s.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }
        for(int num : s){
            if(!s2.contains(num)){
                first.add(num);
            }
        }
        for(int num : s2){
            if(!s.contains(num)){
                second.add(num);
            }
        }
        res.add(first);
        res.add(second);
        return res;
        
    }
}