package com.bootcoding.dsa.string.stringbuilder;

public class EX1 {
    public static void main(String[] args) {
        //String s = new String("Hello");
        //String s="Hello";
        StringBuilder s1= new StringBuilder("Hello");
//        System.out.println(s1);
//
//        s1.append("java");
//        System.out.println(s1);
//
//        s1.setCharAt(0,'c');
//        System.out.println(s1);

//        s1.insert(1,"java");
//        System.out.println(s1);
//
//        s1.replace(1,3,"Java");
//        System.out.println(s1);
        //HELLO
        s1.delete(1,2);
        System.out.println(s1);
    }
}
