package com.bootcoding.dsa.Arrrays.operations.general;

public class maximum {
    public static void main(String[] args) {
        int [] nums={40,90,30,20,70,80};
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max= nums[i];
            }
        }
        System.out.println("Maximum element is "+ max);
    }
}
