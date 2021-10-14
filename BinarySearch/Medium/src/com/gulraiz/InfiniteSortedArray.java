package com.gulraiz;

public class InfiniteSortedArray {
    // Find position of an element in a sorted array of infinite numbers.
    // Question Link:
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {3,5,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.print(findRange(arr, target));
    }

    static int findRange(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previousEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
