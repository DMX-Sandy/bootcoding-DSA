package com.bootcoding.TCS_NQT;

public class Amstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println( check(n));
    }
    public static String check(int num ){
        int number  = num;
        int rem =0;
        int sum =0;

        while(number>0){
            rem = number % 10;
            number = number /10;
            sum += Math.pow(rem,3);

        }
        if(sum == num){
            return "it a amstring number";
        }
        else
            return "not an palindrome number";
    }
}
