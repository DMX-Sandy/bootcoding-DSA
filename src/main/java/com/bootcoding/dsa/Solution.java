package com.bootcoding.dsa;

class Solution {
    public String truncateSentence(String s, int k) {
        String [] s1=s.split(" ");
        String  s2="";
        for(int i=0;i<k;i++){
            s2+=" "+s1[i];
        }
        
        return s2.substring(1);
    }
}