package com.gulraiz;

public class Sqrt_x {
    // Question Link:
    // https://leetcode.com/problems/sqrtx/
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static int mySqrt(int num) {
        int start = 0;
        int end = num;
        while (start < end) {
            int mid = (start + (end - start) / 2) + 1;
            if (mid <= num/mid) {
                start = mid;
            } else if (mid > num/mid) {
                end = mid - 1;
            }
        }
        return start;
    }
}
