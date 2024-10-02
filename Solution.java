public class Solution {

    public int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by spaces
        String[] words = s.split(" ");
        
        // Return the length of the last word in the array
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.lengthOfLastWord("Hello World"));  // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));  // Output: 6
    }
}
