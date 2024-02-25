package com.bootcoding.dsa.SmartData;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABCDE");

        for(int i=0;i<s.length()/2;i++){
            int front =i;
            int last = s.length()-1-i;

            char frontchar =s.charAt(front);//A B C D
            char endchar = s.charAt(last); //E D C B

            s.setCharAt(front,endchar);//e D C B
            s.setCharAt(last,frontchar);//A B C D


        }

        System.out.println(s);
    }
}
