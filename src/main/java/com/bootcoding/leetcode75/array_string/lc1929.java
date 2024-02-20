package com.bootcoding.leetcode75.array_string;

public class lc1929 {
    public static void main(String[] args) {
        int [] nums={1,2,1};
        int [] newArray=new int[nums.length+ nums.length];
        for (int i=0;i<newArray.length-1;i++){
           if(i>=nums.length){
               i=nums.length-i;
               newArray[i]=nums[i];
           }
           else{
               newArray[i]=nums[i];
           }
        }

        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
