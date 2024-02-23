package com.bootcoding.dsa.SmartData;

public class AverageofArray {
    public static void main(String[] args) {
        int [] a= {1,2,3,4,5,6};
        float  sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        float avg = sum /a.length;
        System.out.println(avg);
    }
}
