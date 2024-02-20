package com.bootcoding.leetcode75.array;

public class lc_1920 {
    public static void main(String[] args) {
        int [] nums={0,2,1,5,3,4};

        int [] newArray= new int [nums.length];
        for(int i=0;i< nums.length;i++){
            newArray[i]= nums[nums[i]];
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
