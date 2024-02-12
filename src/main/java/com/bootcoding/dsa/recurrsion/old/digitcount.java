package com.bootcoding.dsa.recurrsion.old;

public class digitcount {

    public static int digit(int n){

        if(n==0){
            return 0;
        }

      return 1+ digit(n/10);

    }

    public static void main(String[] args) {
        int res=digit(123);
        System.out.println(res);
    }
}
