package com.bootcoding.dsa.recurrsion.old;

public class oddAssending {
    public static void odd(int n) {
        if (n == 0) {
            return;
        }
        odd(n - 1);
        if (n % 2 != 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n=10;
        odd(n);
        System.out.print(" ");
    }

}