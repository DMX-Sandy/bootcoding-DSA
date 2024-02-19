package com.bootcoding.dsa.recurrsion.New.lec_1;

public class product_of_n_to_1 {
    public static void main(String[] args) {
        product(6,1);
    }
    public static void product(int n,int m){
        if(n<=0){
            return;
        }
        product(n-1,n*m);
        System.out.println(n +"=> "+ m);
    }
}
