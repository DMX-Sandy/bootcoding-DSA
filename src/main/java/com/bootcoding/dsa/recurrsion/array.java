package com.bootcoding.dsa.recurrsion;

public class array {
    public static void arr(int []a,int i){

        if(i==a.length){
            return;
        }
        System.out.println(a[i]);
        arr(a,++i);


    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        arr(a,0);

    }
}
