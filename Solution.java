import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        // Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Loop through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If the current value is less than the previous one, subtract it; otherwise, add it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update previous value for the next iteration
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("III -> " + solution.romanToInt("III"));        // Output: 3
        System.out.println("LVIII -> " + solution.romanToInt("LVIII"));    // Output: 58
        System.out.println("MCMXCIV -> " + solution.romanToInt("MCMXCIV"));// Output: 1994
    }
}
