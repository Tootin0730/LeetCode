import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) {
            return result;
        }
        
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == i) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[i]);
                }
                start = i + 1;
            }
        }
        return result;
    }
}