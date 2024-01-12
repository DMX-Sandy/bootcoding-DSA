package com.bootcoding.dsa.collection_Framework.list.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Integer [] a ={2,4,6,8,0};
        Integer [] b = {1,3,5,7,9};

        Set<Integer> s = new HashSet<>();
        s.addAll(Arrays.asList(a));

        Set<Integer> s1 = new HashSet<>();
        s.addAll(Arrays.asList(b));

        s.addAll(s1);
        System.out.println(s);

        System.out.println(s.contains(8));

        s.remove(7);
        System.out.println(s);

//        for(Integer str:s){
//            System.out.println(str);
//        }

        s.forEach((Integer str) -> {
            System.out.print(str+" ");
        });
    }
}
