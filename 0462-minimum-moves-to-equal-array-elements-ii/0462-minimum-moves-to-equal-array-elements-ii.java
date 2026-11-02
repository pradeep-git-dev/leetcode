class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int med = nums[n/2];
        int cnt = 0;
        for(int num : nums){
            cnt += Math.abs(num - med);
        }
        return cnt;
    }
}