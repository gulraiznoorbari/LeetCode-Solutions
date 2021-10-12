package com.gulraiz;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.print(spiralOrder(nums));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return ans;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int size = matrix.length * matrix[0].length;

        while(ans.size() < size){
            // for top most/first row:
            for(int i=left; i<=right && ans.size()<size; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            // for right most/last column:
            for(int i=top; i<=bottom && ans.size()<size; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            // for bottom most/last row:
            for(int i=right; i>=left && ans.size()<size; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            // for left most/first column:
            for(int i=bottom; i>=top && ans.size()<size; i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}
