package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class Sum_n_to_1 {
    public static void main(String[] args) {
        System.out.println( Sum(5));;
    }
    public static int Sum(int n){
        if(n<=1){
            return 1;
        }
        return n+Sum(n-1);
    }
}


