package com.bootcoding.TCS_NQT;

public class Swap2ndlastelement {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5,6,7,8};
        arayswap(num,3);
    }
    public static void arayswap(int []num,int k ){
        for(int i =0;i<k;i++){
            if(i==(k-1)){
                int temp = num[i];
                num[i]= num[num.length-i-1];
                num[num.length-i-1]=temp;
            }
        }
        for(int i =0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
