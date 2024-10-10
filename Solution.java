import java.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Remove all non-alphanumeric characters and convert to lowercase
        StringBuilder filteredString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        
        // Step 2: Check if the filtered string is a palindrome
        String cleanedString = filteredString.toString();
        String reversedString = filteredString.reverse().toString();
        
        return cleanedString.equals(reversedString);
    }
}
