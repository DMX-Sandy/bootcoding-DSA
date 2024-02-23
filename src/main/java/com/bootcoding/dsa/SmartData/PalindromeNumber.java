package com.bootcoding.dsa.SmartData;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(palin(121));

    }
    public static boolean palin(int n){
        int pal= n;//121
        int reverse=0;//1
        while(n>0){
            int last = n%10;//1%10=1
            reverse=reverse*10+last;//12*10+1=121
            n=n/10;//1/10=0
        }
        if(reverse == pal){
            return true;
        }else{
            return false;
        }
    }
}
