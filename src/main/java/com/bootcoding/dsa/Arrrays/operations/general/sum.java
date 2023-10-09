package com.bootcoding.dsa.Arrrays.operations.general;

public class sum {
    public static void main(String[] args) {
        int [] nums={1,2,3,6,5,4};
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
