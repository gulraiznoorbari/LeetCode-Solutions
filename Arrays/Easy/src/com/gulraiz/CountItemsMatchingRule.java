package com.gulraiz;

import java.util.List;

public class CountItemsMatchingRule {
    // Question Link:
    // https://leetcode.com/problems/count-items-matching-a-rule/
    public static void main(String[] args) {

    }

//    Method-1:
    /*
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = 0;
        if(ruleKey.equals("color")){
            i = 1;
        }
        if(ruleKey.equals("name")){
            i = 2;
        }
        for(List<String> item: items){
            if(item.get(i).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
     */

//    Method-2:
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                ans++;
            }
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                ans++;
            }
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }

}
