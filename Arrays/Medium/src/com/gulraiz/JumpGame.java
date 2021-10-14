package com.gulraiz;

public class JumpGame {
    public static void main(String[] args) {
        // Question Link:
        // https://leetcode.com/problems/jump-game/
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }

    static boolean canJump(int[] nums) {
        // The basic idea is this: at each step, we keep track of the furthest reachable index.
        // The nature of the problem (eg. maximal jumps where you can hit a range of targets
        // instead of singular jumps where you can only hit one target) is that for an index to be reachable,
        // each of the previous indices have to be reachable.
        int maxMoves = nums[0];
        for (int i=0; i<= maxMoves; i++) {
            if (maxMoves >= nums.length-1) return true;
            if (maxMoves < i+nums[i]){
                maxMoves = i+nums[i];
            }
        }
        return false;
    }
}
