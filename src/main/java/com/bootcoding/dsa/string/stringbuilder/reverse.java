package com.bootcoding.dsa.string.stringbuilder;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back = sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar= sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }
//        sb.reverse();
        System.out.println(sb);
    }
}
