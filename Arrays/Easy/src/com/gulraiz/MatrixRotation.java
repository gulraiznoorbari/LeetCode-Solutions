package com.gulraiz;

public class MatrixRotation {
    // Question Link:
    // https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    public static void main(String[] args) {
        int[][] array = {
                {0,0,0},
                {0,1,0},
                {1,1,1},
        };
        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0},
        };
        System.out.print(findRotation(array, target));
    }

//    Method-1:
    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            mat = rotate(mat);
            if(isEqual(mat, target)){
                return true;
            }
        }
        return false;
    }
    static boolean isEqual(int[][] matrix, int[][] target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static int[][] rotate(int[][] mat){
        mat = transpose(mat);
        int temp = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length/2; j++){
                temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 -j];
                mat[i][mat.length-1-j] = temp;
            }
        }
        return mat;
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

//    Method-2:
    /*
    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            mat = rotate(mat);
            if(isEqual(mat, target)){
                return true;
            }
        }
        return false;
    }
    static boolean isEqual(int[][] matrix, int[][] target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static int[][] rotate(int[][] mat){
        // First Take Transpose of Matrix:
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Start Flipping from first and last columns:
        int start = 0;
        int end = mat.length - 1;
        while(start <= end){
            for(int i=0; i<mat.length; i++){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
        return mat;
    }
     */
}
