public class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 according to the problem's definition
        if (needle.isEmpty()) {
            return 0;
        }
        
        // Use the built-in indexOf method to find the first occurrence of needle in haystack
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1)); // Output: 0
        
        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); // Output: -1
    }
}

