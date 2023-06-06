import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        boolean col0 = true;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else {
                        col0 = false;
                    }
                }
            }
        }

        for(int k = row - 1;k>=0;k--){
            for(int l = col - 1;l > 0;l--){
                if(matrix[k][0] == 0 || matrix[0][l] == 0){
                    matrix[k][l] = 0;
                }
            }
            if(col0 == false){
                matrix[k][0] = 0;
            }
        }

    }

}
