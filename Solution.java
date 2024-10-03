public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Find the shortest string in the array
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Compare prefix with the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Gradually reduce the length of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));  // Output: "fl"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));     // Output: ""
    }
}
