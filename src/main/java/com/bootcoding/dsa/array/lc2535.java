package com.bootcoding.dsa.array;

public class lc2535 {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        int sum = 0;
        int sumD = 0;
        int k;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i]!=0) {
                k=nums[i]%10;
                sumD+=k;
                nums[i]=nums[i]/10;

            }
        }
      int abs=sum-sumD;
        System.out.println(abs);
    }
}





