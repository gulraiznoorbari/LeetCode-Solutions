package com.gulraiz;

public class FindInMountainArray {
    // Question Link:
    // https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(arr, target));
    }

    static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return OrderAgnosticBS(arr, target, peak, arr.length - 1);
        }
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in descending part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asscending part of array
                start = mid + 1;
            }
        }
        return start; // or return end as both are equal
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether array is sorted in ascending or descending order:
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                // For Ascending Order:
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                // For Descending Order:
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
