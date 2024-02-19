package com.bootcoding.dsa.recurrsion.New.lec_1;

public class sum_1_to_n {
    public static void main(String[] args) {
       sum(1,0);
    }
    public static void sum(int n,int m){
        if(n==5){
            return;
        }
        m += n;
        sum(n+1,m);
        System.out.println(m);
    }
}
