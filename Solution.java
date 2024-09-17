public class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;  // Tracks the farthest index we can reach

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;  // If the current index is beyond the farthest point we can reach, return false
            }
            farthest = Math.max(farthest, i + nums[i]);  // Update the farthest point we can reach
            if (farthest >= nums.length - 1) {
                return true;  // If the farthest point reaches or exceeds the last index, return true
            }
        }

        return false;  // Return false if we finish the loop without reaching the last index
    }
}

