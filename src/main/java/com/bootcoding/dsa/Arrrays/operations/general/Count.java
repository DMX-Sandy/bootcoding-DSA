package com.bootcoding.dsa.Arrrays.operations.general;

public class Count {
    public static void main(String[] args) {
        int [] nums= {-1,2,-3,4,-5,6,-7,8,9,-10,20};
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                count++;
            }
        }
        System.out.println("THe count is "+ count);
    }
}
