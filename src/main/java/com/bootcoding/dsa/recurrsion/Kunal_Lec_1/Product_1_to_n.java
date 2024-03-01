package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class Product_1_to_n {
    public static void main(String[] args) {
        Multiply(1,5,1);

    }
    public static void Multiply(int n,int m,int mul){
        if(n>m){
            return ;
        }
        mul*=n;
        Multiply(n+1,m,mul);

        System.out.println(mul);
    }
}
