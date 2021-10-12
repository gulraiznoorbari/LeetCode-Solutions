package com.gulraiz;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    // Question Link:
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

//    Method-1:
    /*
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                int sum = 0;
                if(nums[j] < nums[i]){
                    sum ++;
                    ans[i] += sum;
                }
            }
        }
        return ans;
    }
     */

//    Method-2:
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = new int[101];
        // storing frequencies:
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]++;
        }
        // running sum:
        for (int i=1; i<101 ; i++) {
            temp[i] += temp[i - 1];
        }
        // storing ans:
        for (int i=0; i<nums.length ; i++) {
            if(nums[i] == 0){
                ans[i] = 0;
            } else {
                ans[i] = temp[nums[i] - 1];
            }
        }
        return ans;
    }
}
