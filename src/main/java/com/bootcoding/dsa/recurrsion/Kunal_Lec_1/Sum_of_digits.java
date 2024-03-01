package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(SumDigit(123));
    }
     static int SumDigit(int n){
        if(n<=0){
            return 0;
        }
            return SumDigit(n/10)+(n%10);
     }
}
