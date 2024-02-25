package com.bootcoding.dsa.SmartData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swappingwithoutusing3rdVAr {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        //a=20,b=10
//
//        a=a+b; //10+20=30 a=30
//        b=a-b; //30-20=10 b=10
//        a=a-b; //30-10=20 a=20
//
//        System.out.println("a = "+a+ " "+"b ="+b);

        List <Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
