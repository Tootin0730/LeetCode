import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {        // Sort the citations in descending order
        Arrays.sort(citations);
        
        int n = citations.length;               // Traverse the sorted citations from largest to smallest
        for (int i = 0; i < n; i++) {           // Check if the current citation count is greater than or equal to h
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;                               // If no h-index was found, return 0
    }
}
