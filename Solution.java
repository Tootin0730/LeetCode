import java.util.ArrayList;
import java.util.List;

class Solution {
    public void rotate(int[][] matrix) {

      List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right){
            for (int i = bottom; i >= 0; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        
        int index = 0;
        for(int vertic = 0; vertic <= bottom; vertic++){       
            for(int horizon = 0; horizon <= right; horizon++){
                matrix[vertic][horizon] = result.get(index);
                index++;
            }
        }
    }
}