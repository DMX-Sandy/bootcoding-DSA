package com.bootcoding.dsa.collection_Framework.list.set;

import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Raja");
        s.add("om");
        s.add("Laxman");
        s.add("om");

        System.out.println(s);

        Set<String> s1 = new HashSet<>();
        s.add("jaika");
        s.add("Raja");

        s.addAll(s1);
        System.out.println(s);

        s1.clear();
        System.out.println(s1);

        System.out.println(s.contains("bootocidng"));
        System.out.println(s.containsAll(s1));

        System.out.println(s.isEmpty());
    }
}
