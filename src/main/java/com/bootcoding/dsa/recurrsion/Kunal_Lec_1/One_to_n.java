package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class One_to_n {
    public static void main(String[] args) {
        print(1,5);
    }
    public static void print(int n,int m ){
        if(n>m){
            return;
        }
            System.out.print(n+" ");
         print(n+1,m);
    }
}
