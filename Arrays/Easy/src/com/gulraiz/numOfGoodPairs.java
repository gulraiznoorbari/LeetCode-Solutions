package com.gulraiz;

public class numOfGoodPairs {
    // Question Link:
    // https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.print(numIdenticalPairs(arr));
    }

//    Method-1:
    /*
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    ans++;
                }
            }
        }
        return ans;
    }
     */


//    Method-2:
    static int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans += temp[nums[i]];
            temp[nums[i]]++;
        }
        return ans;
    }
}
