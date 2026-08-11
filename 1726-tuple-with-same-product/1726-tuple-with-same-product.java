class Solution {
    public int tupleSameProduct(int[] nums) {
        int total = 0;
        int n = nums.length;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(i != j){
                    int pro = nums[i] * nums[j];
                    map.put(pro , map.getOrDefault(pro , 0) + 1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int c = entry.getValue();
            if(c >= 2){
                total += ((c * (c-1))/2)*8;
            }

        }
        return total;
        
    }
}