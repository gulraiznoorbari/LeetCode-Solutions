package com.gulraiz;

public class RotatedSortedArray {
    // Question Link:
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicate(nums);
        // If there is no pivot found, it means array is not rotated, just do normal Binary Search.
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else {
        // If pivot is found you have 2 ascending sorted arrays.
            if (nums[pivot] == target) {
                return pivot;
            } else if (target >= nums[0]) {
                return  binarySearch(nums, target, 0, pivot - 1);
            } else {
                return binarySearch(nums, target, pivot + 1, nums.length - 1);
            }
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Case-1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case-2:
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // If elements at middle, start, end are equal then just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // NOTE: what if these elements at start and end are the pivot?
                // Check if start is pivot:
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // Check if end is pivot:
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, so pivot should be in right:
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
