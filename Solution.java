public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers
        int p1 = m - 1;  // Pointer for nums1
        int p2 = n - 1;  // Pointer for nums2
        int p = m + n - 1;  // Pointer for the final position in nums1

        // Merge from the back of both arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are any remaining elements in nums2, copy them into nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
}