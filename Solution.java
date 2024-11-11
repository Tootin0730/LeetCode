import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {

        int leng = nums.length;
        if(leng == 0){
            return 0;
        }

        int count = 0, next;
        Arrays.sort(nums);

        for (int i = 0; i < leng; i++){
            if(i != leng-1 && nums[i] == nums[i+1]){
                i += 1;    
            }
            next = nums[i] + 1;
            for(int element : nums){
                if(element == next){
                    count += 1;
                    System.out.println(next);
                }
            }
        }
        return count+1;
    }
}