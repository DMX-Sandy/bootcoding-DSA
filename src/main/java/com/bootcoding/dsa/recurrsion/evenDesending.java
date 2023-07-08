package com.bootcoding.dsa.recurrsion;

public class evenDesending {
    public static void evend(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            System.out.println(n);
        }
        evend(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        evend(n);
        System.out.print(" ");
    }
}
