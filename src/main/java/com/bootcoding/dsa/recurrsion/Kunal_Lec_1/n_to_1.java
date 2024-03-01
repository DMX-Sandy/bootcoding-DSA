package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class n_to_1 {
    public static void main(String[] args) {
        System.out.println(print(5));
    }
     public static int print(int n){
        if(n<=1){
            return 1;
        }
         System.out.print(n+" ");
        return print(n-1);
     }
}
