class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer , Integer> map = new HashMap<>();
        for(int num: nums){
            if(num > 0){
                map.put(num , map.getOrDefault(num , 0) + 1);
            }
        }
        for(int i=1; i<=nums.length + 1;i++){
            if(!map.containsKey(i)){
                ans = i;
                return ans;
            }
        }
        return 1;
        
    }
}