package com.bootcoding.dsa.smart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapWithout3rdVar {
    public static void main(String[] args) {
        int a=5;
        int b=6;

//        List<Integer> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//
//        Collections.swap(list,0,1);
//
//        System.out.println(list);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a => "+a +" "+ "b => "+b);

    }
}
