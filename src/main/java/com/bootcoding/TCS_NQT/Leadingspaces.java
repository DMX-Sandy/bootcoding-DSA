package com.bootcoding.TCS_NQT;

public class Leadingspaces {
    public static void main(String[] args) {
        String s= "  g g   k t ";
        System.out.println(Spaces(s));
    }
    public static String Spaces(String s){
        String str = s.replaceAll("\\s","").trim();
        return str;
    }
}
