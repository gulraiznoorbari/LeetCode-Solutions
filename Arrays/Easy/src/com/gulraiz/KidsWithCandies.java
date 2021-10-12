package com.gulraiz;

import java.util.ArrayList;

public class KidsWithCandies {
    // Quetsion Link:
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }


//    Method-1:
    /*
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            boolean test = false;
            for(int j=0; j<candies.length; j++) {
                if(candies[i] + extraCandies < candies[j]) {
                    test = true;
                    break;
                }
            }
            if (test) {
                ans.add(false);
            } else {
                ans.add(true);
            }
        }
        return ans;
    }
     */

//    Method-2:

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

}
