import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        // Loop through the words array
        while (i < words.length) {
            int lineLength = 0;
            int start = i;
            
            // Pack words into the current line
            while (i < words.length && lineLength + words[i].length() + (i - start) <= maxWidth) {
                lineLength += words[i].length();
                i++;
            }
            
            // Calculate the number of spaces to distribute
            int spaces = maxWidth - lineLength;
            int numberOfWords = i - start;
            
            // Build the line
            StringBuilder sb = new StringBuilder();
            
            if (i == words.length || numberOfWords == 1) {
                // If it's the last line or the line has only one word
                for (int j = start; j < i; j++) {
                    sb.append(words[j]);
                    if (j < i - 1) {
                        sb.append(" ");
                    }
                }
                // Fill the rest with spaces for left justification
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                // Otherwise, distribute spaces evenly
                int spaceBetweenWords = spaces / (numberOfWords - 1);
                int extraSpaces = spaces % (numberOfWords - 1);
                
                for (int j = start; j < i; j++) {
                    sb.append(words[j]);
                    if (j < i - 1) { // not the last word
                        for (int k = 0; k < spaceBetweenWords; k++) {
                            sb.append(" ");
                        }
                        if (extraSpaces > 0) {
                            sb.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }
            
            result.add(sb.toString());
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Provide your input here
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;

        // Run the solution and print the result
        List<String> justifiedText = solution.fullJustify(words, maxWidth);
        
        for (String line : justifiedText) {
            System.out.println("\"" + line + "\"");
        }
    }
}

