package com.gulraiz;

import java.util.Arrays;

public class TransposeOfMatrix {
    // Question Link:
    // https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
        };
        for(int[] i : transpose(arr)){
            System.out.println(Arrays.toString(i));
        }
    }
    
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
