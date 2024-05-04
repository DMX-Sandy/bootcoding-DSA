package com.bootcoding.leetcode75.array_string;

import java.util.Arrays;

public class Lc_881 {
    public static void main(String[] args) {
            int [] people = {1,2};
            int limit = 3;
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }

}
