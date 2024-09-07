public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;  // Edge case for empty array
        
        int k = 1;  // k will track the index of the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // Compare with the previous element
                nums[k] = nums[i];  // Place the unique element in position k
                k++;  // Increment k to move to the next position
            }
        }
        return k;  // Return the number of unique elements
    }
}
