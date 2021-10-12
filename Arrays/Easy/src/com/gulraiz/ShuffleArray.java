package com.gulraiz;

import java.util.Arrays;

public class ShuffleArray {
    // Question Link:
    // https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        int j = 0;
        for(int i = 0; i<ans.length; i+=2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        return ans;
    }
}
