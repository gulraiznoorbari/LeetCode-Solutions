package com.gulraiz;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(Arrays.toString(productArray(nums)));
    }

//    Method-1:
    /*
    static int[] productArray(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i=0; i<nums.length; i++) {
            ans[i] = 1;
        }
        for (int i=0; i<nums.length; i++) {
            ans[i] *= left;
            left *= nums[i];
            ans[nums.length - 1 - i] *= right;
            right *= nums[nums.length - 1 - i];
        }
        return ans;
    }
     */

//    Method-2:
//    Use tmp to store temporary multiply result by two directions. Then fill it into result.
    static int[] productArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }

}
