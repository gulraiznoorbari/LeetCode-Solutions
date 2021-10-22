package com.gulraiz;

public class FirstBadVersion {
    // Question Link:
    // https://leetcode.com/problems/first-bad-version/
    public static void main(String[] args) {
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid) == false) {
                start = mid + 1;
            } else if (isBadVersion(mid) == true) {
                end = mid;
            }
        }
        return start;
    }
}
