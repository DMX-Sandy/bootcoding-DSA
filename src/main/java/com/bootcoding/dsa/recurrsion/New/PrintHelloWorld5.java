package com.bootcoding.dsa.recurrsion.New;

import com.bootcoding.dsa.Arrrays.operations.general.print;

public class PrintHelloWorld5 {
    public static void main(String[] args) {
        printhello("Hello world",5);
    }
    public static void printhello(String s,int n){
            if(n>0){
                System.out.println(s);
                printhello(s,n-1);
            }
    }
}
