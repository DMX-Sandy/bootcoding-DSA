package com.bootcoding.dsa.Searching;

import java.util.Locale;

public class StringEx1 {
    public static void main(String[] args) {
       /* String name="Lenovo";
        String name1=new String("lenovo");
        System.out.println(name);
        System.out.println(name1);


        //equals
        String s1="LENOVO";
        String s2="lenovo";
        boolean res=s1.equals(s2);
        boolean ress=s1.equalsIgnoreCase(s2);
        System.out.println(res);
        System.out.println(ress);

        //cases
        String s3=s1.toLowerCase();
        String s4=s2.toUpperCase();
        System.out.println(s3);
        System.out.println(s4);



        //*/
        String s="Lenovo is a laptop";
        System.out.println(s.length());

        String s1="Lenovo";
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.charAt(3));

       if( s.contains("laptopp")){
           System.out.println("exits");
       }else{
           System.out.println("not exist");
       }
    }
}
