package com.bootcoding.dsa.recurrsion.Kunal_Lec_1;

public class Count_zero {
    public static void main(String[] args) {
        System.out.println(helper(12001));
    }

    static int helper(int n){
        return count(n,0);
    }
    static int count(int n,int coun){
        if(n==0){
            return coun;
        }
       int rem = n%10;
       if(rem == 0){
          return count(n/10,coun+1);
       }
       return count(n/10,coun);
    }
}
