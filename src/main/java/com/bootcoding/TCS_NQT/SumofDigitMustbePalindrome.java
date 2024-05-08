package com.bootcoding.TCS_NQT;

public class SumofDigitMustbePalindrome {
    public static void main(String[] args) {
        System.out.println(digitsum(131));
    }
    public static int digitsum(int n){
        int sum =0;
        while(n>0){
            int digit = n %10;
            sum += digit;
            n = n/10;
        }
        int reverse = 0;
        while(sum!=0){
            int digit = n %10;
            reverse = reverse*10+digit;
            sum= sum/10;

        }
        if(sum == reverse)
            return 1;
        else
            return 0;
    }

}
