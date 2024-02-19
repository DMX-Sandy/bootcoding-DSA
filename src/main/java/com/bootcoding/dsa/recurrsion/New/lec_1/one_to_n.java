package com.bootcoding.dsa.recurrsion.New.lec_1;

public class one_to_n {
    public static void main(String[] args) {
     oneton(1,5);
    }
    public static void oneton(int n,int m){
        if(n>m){
            return;
        }
        System.out.println(n);
        oneton(n+1,m);
    }
}
