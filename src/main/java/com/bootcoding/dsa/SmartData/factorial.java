package com.bootcoding.dsa.SmartData;

public class factorial {
    public static void main(String[] args) {
        int n =5;
        int mul=1;
        while(n>0){
            mul=mul*n;
            n--;
        }
        System.out.println(mul);
    }
}
