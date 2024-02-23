package com.bootcoding.dsa.smart;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCDE");

        for(int i=0;i<sb.length()/2;i++){
        int front = i;
        int  last =sb.length()-1-i;

        char start = sb.charAt(front);
        char end = sb.charAt(last);

        sb.setCharAt(front,end);
        sb.setCharAt(last,start);

        }
        System.out.println(sb);
    }
}
