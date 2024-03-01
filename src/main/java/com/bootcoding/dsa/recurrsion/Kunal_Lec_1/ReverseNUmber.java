package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class ReverseNUmber {
    public static void main(String[] args) {
        System.out.println(reverse(1234,0));
    }

    static int reverse(int n,int reverse){

        while(n>0){
            int last = n%10;//1%10=1
            reverse=reverse*10+last;//12*10+1=121
            n=n/10;//1/10=0
        }
        return reverse;
    }
}
