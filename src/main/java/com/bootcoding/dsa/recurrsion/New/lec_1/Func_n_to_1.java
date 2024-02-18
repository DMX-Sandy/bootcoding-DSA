package com.bootcoding.dsa.recurrsion.New.lec_1;

public class Func_n_to_1 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
         print(n-1);
    }
}
