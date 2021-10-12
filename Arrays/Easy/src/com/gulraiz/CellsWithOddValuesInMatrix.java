package com.gulraiz;

public class CellsWithOddValuesInMatrix {
    // Question Link:
    // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    public static void main(String[] args) {
        int[][] arr = {
                {0,1},
                {1,1},
        };
        System.out.println(oddCells(2,3,arr));
    }

    /*
    static int addCells(int m, int n, int[][] indices){
        int[][] ans = new int[m][n];
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<n; j++){
                ans[indices[i][0]][j]++;
            }
            for(int j=0; j<m; j++){
                ans[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(ans[i][j] % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
     */

    static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] arr : indices){
            row[arr[0]]++;
            col[arr[1]]++;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i]+col[j])%2==1){
                    count++;
                }
            }
        }
        return count;
    }

}
