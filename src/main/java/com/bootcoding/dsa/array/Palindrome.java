package com.bootcoding.dsa.array;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(palinrome(a)==a){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    public static int palinrome(int a){
        int reverse=0;
        while(a>0){
            int last=a%10;
            reverse=reverse*10+last;
            a=a/10;
        }
        return reverse;
    }
}
