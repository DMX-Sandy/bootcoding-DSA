package com.bootcoding.dsa.recurrsion.New;

public class PrintFirst5 {
    public static void main(String[] args) {
       print(1);
    }

    public static void print(int n){
      if(n==6){
       return;
      }
        System.out.println(n);
      print(n+1);
    }
}
