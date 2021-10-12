package com.gulraiz;

import java.util.Arrays;

public class TwoSum {
    // Question Link:
    // https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] array = {2,7,11,13};
        System.out.print(Arrays.toString(twoSum(array, 9)));
    }

//    Method-1:
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] == difference){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

//    Method-2:
    /*
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
     */

}
