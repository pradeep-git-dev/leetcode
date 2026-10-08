class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i;
        int[] res=new int[nums.length];
        res[0]=1;
        for(i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int  suffix=1;
        for(i=nums.length-1;i>0;i--){
            res[i]=suffix*res[i];
            suffix=suffix*nums[i];
        }
        res[0]=suffix;
        return res;
    }
}