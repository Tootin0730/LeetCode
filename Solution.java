public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // If the array has 2 or fewer elements, no need to process.

        int j = 2; // Start updating from the 3rd element
        for (int i = 2; i < n; i++) {
            // If the current element is not equal to the element two places before it, then it is safe to include it.
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j; // 'j' is the new length of the modified array
    }
}
