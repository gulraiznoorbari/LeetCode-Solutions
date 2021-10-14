package com.gulraiz;

import java.util.Arrays;

public class RotateArray {
    // Question Link:
    // https://leetcode.com/problems/rotate-array/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    static int[] rotate(int[] nums, int k) {
        // Check if k is less than length of array:
        k = k % nums.length;
        // Reverse the whole array:
        reverseArray(nums, 0, nums.length - 1);
        // Reverse the first k numbers:
        reverseArray(nums, 0, k-1);
        // Reverse the remaining array after kth digit:
        reverseArray(nums, k, nums.length - 1);
        return nums;
    }
    static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
