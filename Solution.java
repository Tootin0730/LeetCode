import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        ArrayList<Integer> coordRow = new ArrayList<Integer>();
        ArrayList<Integer> coordColumn = new ArrayList<Integer>();

        for(int i = top; i <= bottom; i++){
            for(var j = left; j <= right; j++){
                if(matrix[i][j] == 0){
                    coordRow.add(i);
                    coordColumn.add(j);
                }
            }
        }
        
        int colSize = coordColumn.size(), colIndex = 0;
        for(int a = 0; a < colSize; a++){
            for(int i = top; i <= bottom; i++){
                colIndex = coordColumn.get(a);
                matrix[i][colIndex] = 0;
            }
        }

        int rowSize = coordRow.size(), rowIndex = 0;
        for(int b = 0; b < rowSize; b++){
            for(int i = left; i <= right; i++){
                rowIndex = coordRow.get(b);
                matrix[rowIndex][i] = 0;
            }
        }
    }
}