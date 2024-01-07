package com.bootcoding.dsa.Searching;

public class lc2114 {
    public static void main(String[] args) {
        String [] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count=-1;
        for(int i=0;i< sentences.length;i++){
             String [] s1=sentences[i].split(" ");
             if(s1.length>count){
                 count=s1.length;
             }

         }
        System.out.println(count);
    }
}
