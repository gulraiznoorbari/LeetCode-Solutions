package com.gulraiz;

public class KthMissingPositiveNumber {
    // Question Link:
    // https://leetcode.com/problems/kth-missing-positive-number/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 2;
        System.out.println(findKthPositive(nums, target));
    }

    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - mid -1;
            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
