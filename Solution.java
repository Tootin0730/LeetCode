import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Dictionary to store the frequency of characters in t
        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        // Number of unique characters in t that must be present in the window
        int required = tCount.size();

        // Sliding window pointers and variables
        int left = 0, right = 0;
        int formed = 0;  // Number of characters in the current window that match the required frequency
        Map<Character, Integer> windowCounts = new HashMap<>();
        int[] result = {-1, 0, 0};  // (window length, left, right)

        while (right < s.length()) {
            // Add the character at the right pointer to the window
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // Check if the current character matches the required frequency
            if (tCount.containsKey(c) && windowCounts.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left until it ceases to be "desirable"
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update the result if this window is smaller
                if (result[0] == -1 || right - left + 1 < result[0]) {
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }

                // Remove the leftmost character from the window
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (tCount.containsKey(c) && windowCounts.get(c).intValue() < tCount.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            // Expand the window to the right
            right++;
        }

        // Return the smallest window or an empty string if no window was found
        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));  // Output: "BANC"
        System.out.println(solution.minWindow("a", "a"));  // Output: "a"
        System.out.println(solution.minWindow("a", "aa"));  // Output: ""
    }
}
