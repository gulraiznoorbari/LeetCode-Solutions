package com.gulraiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {
    // Question Link:
    // https://leetcode.com/problems/add-to-array-form-of-integer/
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        System.out.print(addToArrayForm(arr, 84));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int length = num.length;
        int i = length - 1;
        while(i >= 0 || k > 0){
            if(i >= 0){
                ans.add((num[i] + k)%10);
                k = (num[i] + k)/10;
            } else {
                ans.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }

}
