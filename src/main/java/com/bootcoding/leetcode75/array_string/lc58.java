package com.bootcoding.leetcode75.array_string;

public class lc58 {
    public static void main(String[] args) {
      String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        String [] s1= s.split(" ");
        return s1[s1.length-1].length();
    }
}
