package com.bootcoding.dsa.array.OneDArray;

import java.util.ArrayList;

public class lc {
    public static void main(String[] args) {
        int num=121;
        ArrayList<Integer> nums=new ArrayList<>();
        int k;
        int count = 0;
        while (num > 0) {
            k = num % 10;
           nums.add(k);
            num = num / 10;
        }
        for(int val:nums){
            if(num%val==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
