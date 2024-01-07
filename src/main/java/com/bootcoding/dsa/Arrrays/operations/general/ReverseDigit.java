package com.bootcoding.dsa.Arrrays.operations.general;

public class ReverseDigit {
    public static int reverse(int n){
        int reverse=0;

        while(n>0 || n<0){
            int lastdigit= n%10;
            reverse = reverse*10+lastdigit;
            n=n/10;
        }

            return reverse;

    }

    public static void main(String[] args) {
        int n = 8398;
        int x= reverse(n);
       if(n==x){
           System.out.println("Number is palindrome");
       }
        else
           System.out.println("Not a palindrome number");
    }
}
