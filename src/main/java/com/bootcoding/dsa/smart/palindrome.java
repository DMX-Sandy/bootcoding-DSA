package com.bootcoding.dsa.smart;

public class palindrome {
    public static void main(String[] args) {
        int a =121;
        System.out.println(palindromee(a));
    }
    public static boolean palindromee(int a){
        int pal =a;
        int reverse=0;
        while(a>0){
            int last=a%10;
            reverse=reverse*10+last;
            a=a/10;
        }
        if(reverse == pal){
            return true;
        }else {
            return false;
        }

    }
}
