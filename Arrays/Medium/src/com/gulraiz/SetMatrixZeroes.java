package com.gulraiz;

import java.util.Arrays;

public class SetMatrixZeroes {
    // Question Link:
    // https://leetcode.com/problems/set-matrix-zeroes
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5},
        };
        System.out.print(Arrays.deepToString(setZero(matrix)));
    }

    // Method-1:
    // Brute Force Solution without Constant Space.
    /*
    static void setZero(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                ans[i][j] = matrix[i][j];
            }
        }
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[0].length; j++) {
                if (ans[i][j] == 0) {
                    setRowZero(matrix, i);
                    setColZero(matrix, j);
                }
            }
        }
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void setRowZero(int[][] matrix, int row) {
        for (int i=row, j=0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }

    static void setColZero(int[][] matrix, int col) {
        for (int i=0, j=col; i < matrix.length; i++) {
            matrix[i][j] = 0;
        }
    }
     */

    // Method-2:
    // Optimized Solution with Constant Space.
    static int[][] setZero(int[][] matrix) {
        if (matrix.length == 0)
            return matrix;
        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        // First Column marks which row we want to make zero.
        for (int j=0; j < col; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        // First Row marks which column we want to make zero.
        for (int i=0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        // Setting the values in matrix equal to zero, by the help of rows and cols.
        for (int i=1; i<row; i++) {
            for (int j=1; j<col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // Setting the value in entire row and column equal to zero.
        for (int i=1; i<row; i++) {
            for (int j=1; j<col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Marks all the entries of first Row = 0.
        if (firstRowZero) {
            for (int j=0; j<col; j++){
                matrix[0][j] = 0;
            }
        }
        // Marks all the entries of first Column = 0.
        if (firstColZero) {
            for (int i=0; i<row; i++){
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }
}
