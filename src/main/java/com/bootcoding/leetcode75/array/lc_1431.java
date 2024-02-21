package com.bootcoding.leetcode75.array;

import java.util.ArrayList;
import java.util.List;

public class lc_1431 {
    public static void main(String[] args) {
        int [] candies ={2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = candies[0];

        for(int i=1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        for(int i=0; i< candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }

}
