package com.bootcoding.dsa.string;

public class StringEx2 {
    public static void main(String[] args) {
        String s="Haldiram";
        System.out.println(s.length());
        String s1 ="! Haldiram sat   ";
        System.out.println(s1.length());
        int a=s.length()/2;
        System.out.println(s.charAt(a));

        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));

        String str="ram";
        if(s.contains(str)){
            System.out.println(str+" Exist");
        }

        //s.substring(start,end);
        System.out.println(s1.substring(7,s1.indexOf('t')));
        System.out.println(s1.substring(0,7));

        String s6="This is a String Method";
         String [] s5=s6.split(" ");
        System.out.println(s5.length);

        String skills="c,c++,java,python,SQL,GITHUB";
        String [] skillcount= skills.split(",");
        System.out.println("The candidate knows "+skillcount.length+" skills.");

        String s8="prathamesh";
        char [] s7=s8.toCharArray();
        for (int i=0;i<s7.length;i++){
            System.out.print(s7[i]+" ");
        }


    }
}
