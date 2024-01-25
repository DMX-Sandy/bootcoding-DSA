package com.bootcoding.leetcode75.array_string;

import java.util.Arrays;

public class lc1662 {
    public static void main(String[] args) {
        String[] word1={"ab","c"};
        String [] word2={"a","bc"};
       String s1="";
       String s2="";
       for(int i=0;i<word1.length;i++){
           s1+=word1[i];
       }
       for(int i=0;i< word2.length;i++){
           s2+= word2[i];
       }

       if(s1.equals(s2)){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}
