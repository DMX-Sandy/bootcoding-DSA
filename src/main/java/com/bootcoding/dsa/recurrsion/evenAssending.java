package com.bootcoding.dsa.recurrsion;

public class evenAssending {
    public static void even(int n){
        if(n==1){
            return ;
        }
        even(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n=10;
        even(n);
        System.out.print(" ");
    }
}
