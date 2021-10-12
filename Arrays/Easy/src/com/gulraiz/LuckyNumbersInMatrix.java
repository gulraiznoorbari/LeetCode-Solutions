package com.gulraiz;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    // Question Link:
    // https://leetcode.com/problems/lucky-numbers-in-a-matrix/
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,18},
        };
        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        int[] minRow = new int[row];
        int[] maxCol = new int[col];
        int index = 0;
        for(int i=0; i<row; i++){
            int min = 100000;
            for(int j=0; j<col; j++){
                min = Math.min(min, matrix[i][j]);
            }
            minRow[index++] = min;
        }
        index = 0;
        for(int j=0; j<col; j++) {
            int max = 0;
            for (int i = 0; i < row; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxCol[index++] = max;
        }
        // Go through the matrix and check if each element is in both min and max at corresponding index:
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(minRow[i]==matrix[i][j] && maxCol[j]==matrix[i][j]){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
