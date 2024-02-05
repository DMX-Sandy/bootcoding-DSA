package com.bootcoding.dsa.string.Practice;

public class EX1 {
    public static void main(String[] args) {
        String s="BootcOding";
        String s1=new String ("Bootcoding");

        boolean v=s.equals(s1);
        System.out.println(v);

        String w=s.concat(s1);
        System.out.println(w);
    }
}
