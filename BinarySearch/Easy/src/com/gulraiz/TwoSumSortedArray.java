package com.gulraiz;

import java.util.Arrays;

public class TwoSumSortedArray {
    // Question Link:
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                answer[0] = start + 1;
                answer[1] = end + 1;
                return answer;
            }
        }
        return answer;
    }
}
