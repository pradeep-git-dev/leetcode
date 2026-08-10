class Solution {
    public int findMaxLength(int[] nums) {
        int len = 0;
        Map<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                sum += 1;
            }else{
                sum -= 1;
            }

            if(map.containsKey(sum)){
                len = Math.max(len , i - map.get(sum));
            }else{
                map.put(sum , i);
            }
        }
        return len;

        
    }
}