public class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;  // End of the range we can reach with current jumps
        int farthest = 0;  // Farthest we can reach from current index

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we have reached the end of the range for the current jump, we make another jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;  // Move to the next range

                // If the farthest point reaches or exceeds the last index, return jumps
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
