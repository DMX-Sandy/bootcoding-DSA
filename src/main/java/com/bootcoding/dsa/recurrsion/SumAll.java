package com.bootcoding.dsa.recurrsion;

public class SumAll {
    public static int Sumall(int n){
        if(n==1){
            return 1;
        }
        return n + Sumall(n-1);

    }

    public static void main(String[] args) {
        int res=Sumall(10);
        System.out.println(res);
    }
}
