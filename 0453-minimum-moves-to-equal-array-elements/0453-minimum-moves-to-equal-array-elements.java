class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int min = findMin(nums);
        return sum - (min * n);
        
    }

    public int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
        }
        return min;
    }
}