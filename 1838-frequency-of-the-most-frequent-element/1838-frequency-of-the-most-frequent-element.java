class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long sum = 0;
        int len = 0;
        int n = nums.length;

        for(int right = 0; right<n; right++){
            sum += nums[right];
            while((long)nums[right] * (right - left + 1) - sum > k){
                sum -= nums[left];
                left++;
            }
            len = Math.max(len , right - left + 1);

        }
        return len;

        
    }
}