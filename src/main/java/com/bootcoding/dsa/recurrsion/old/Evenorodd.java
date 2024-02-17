package com.bootcoding.dsa.recurrsion.old;

public class Evenorodd {
    private static void evenoddMethod(int n){
        if(n==0){
            return;
        }
         if(n%2==0){
             System.out.print(n);
         }
        System.out.print(" ");
         evenoddMethod(n-1);
        System.out.print(" ");
         if(n%2!=0){
             System.out.print(n);
         }

    }

    public static void main(String[] args) {
        int n;
        evenoddMethod(10);
        System.out.println(" ");
    }
}
