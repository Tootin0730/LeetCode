public class Solution {

    public String intToRoman(int num) {
        // Define the mappings of integers to Roman numerals in descending order
        int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M",  "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Traverse through the values array
        for (int i = 0; i < values.length; i++) {
            // For each value, check how many times it can be subtracted from num
            while (num >= values[i]) {
                num -= values[i];           // Subtract the value from num
                roman.append(symbols[i]);   // Append the corresponding symbol to the result
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println("3749 -> " + solution.intToRoman(3749));  // Output: "MMMDCCXLIX"
        System.out.println("58 -> " + solution.intToRoman(58));      // Output: "LVIII"
        System.out.println("1994 -> " + solution.intToRoman(1994));  // Output: "MCMXCIV"
    }
}
