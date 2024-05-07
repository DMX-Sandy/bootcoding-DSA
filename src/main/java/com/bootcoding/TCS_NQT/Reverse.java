package com.bootcoding.TCS_NQT;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(179));
    }
    public static int reverse(int n ){
           int rev = 0;
           while(n!=0){
               int digit = n%10;
                rev = rev * 10 +digit;
                n = n/10;

           }
           return rev;
    }
}
