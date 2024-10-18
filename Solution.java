class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int current_sum = 0;
        int minLength = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            current_sum += nums[right];
            
            while (current_sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                current_sum -= nums[left];
                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
