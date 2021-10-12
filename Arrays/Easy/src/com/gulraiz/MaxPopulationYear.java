package com.gulraiz;

public class MaxPopulationYear {
    // Question Link:
    // https://leetcode.com/problems/maximum-population-year/
    public static void main(String[] args) {
        int[][] arr = {
                {1950,1961},
                {1960,1971},
                {1970,1981},
        };
        System.out.print(maximumPopulation(arr));
    }

//    Method-1:
    /*
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i=0; i<logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++){
                arr[j-1950]++;
            }
        }
        int maxYear = 1950;
        int maxValue = 0;
        for(int i=0; i<101; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
     */

//    Method-2:
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i=0; i<logs.length; i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        // Running Sum:
        for(int i=1; i<101; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        int maxYear = 1950;
        int maxValue = 0;
        for(int i=0; i<101; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

}
