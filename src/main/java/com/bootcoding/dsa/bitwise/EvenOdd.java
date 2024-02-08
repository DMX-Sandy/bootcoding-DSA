package com.bootcoding.dsa.bitwise;

public class EvenOdd {
    public static void main(String[] args) {
        int s= 67;
        System.out.println(isEvenOdd(s));
    }

    private static String isEvenOdd(int s) {
        if((s&1)==1){
            return "Odd";
        }
        else{
            return "Even";
        }
    }
}
