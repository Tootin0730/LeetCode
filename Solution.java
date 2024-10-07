public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        // Create a list of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        // Initialize variables for direction and row tracking
        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            
            // If we're at the top or bottom row, change direction
            if (currentRow == 0 || currentRow == numRows - 1) goingDown = !goingDown;
            
            // Move up or down depending on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Concatenate all rows to form the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(solution.convert(s1, numRows1)); // Output: PAHNAPLSIIGYIR
        
        // Example 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(solution.convert(s2, numRows2)); // Output: PINALSIGYAHRPI
        
        // Example 3
        String s3 = "A";
        int numRows3 = 1;
        System.out.println(solution.convert(s3, numRows3)); // Output: A
    }
}
