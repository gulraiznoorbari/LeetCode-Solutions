package com.gulraiz;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        System.out.println((Arrays.deepToString(matrixReshape(arr, 1, 4))));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if ((rows*cols) != r*c) return mat;

        int[][] ans = new int[r][c];
        int row_nums = 0;
        int col_nums = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                ans[row_nums][col_nums] = mat[i][j];
                col_nums++;
                if(col_nums == c){
                    col_nums = 0;
                    row_nums++;
                }
            }
        }
        return ans;
    }

}
