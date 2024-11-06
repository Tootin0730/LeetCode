import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }

        int [] arr = new int[result.size()];

        for (int i = 0; i < result.size(); i++){
            arr[i] = result.get(i);
        }

        return arr;
    }
}