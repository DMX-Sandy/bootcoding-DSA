package com.bootcoding.dsa.collection_Framework.list.set;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
//        Set s = new HashSet();
//        s.add("A");
//        s.add(30);
//        s.add(30.00);
//        s.add('A');
//
//        System.out.println(s);

        Set<Integer> s1 = new LinkedHashSet<>();
        s1.add(20);
        s1.add(40);
        s1.add(10);
        s1.add(0);
        s1.add(0);
        System.out.println(s1);


        SortedSet<Integer> s2 = new TreeSet<>();
        SortedSet<Integer> s3 = new TreeSet<>();
        s2.add(100);
        s2.add(101);
        s2.add(103);
        s2.add(102);
        s2.add(108);
        s2.add(104);
        System.out.println(s2);

        //First()
        System.out.println( s2.first());

        //Last()
        System.out.println(s2.last());

        //headset(Object)
        System.out.println(s2.headSet(104));

        //tailset(object) object>=
        System.out.println(s2.tailSet(104));

        //subset(Object1, object2)
        System.out.println(s2.subSet(101,104));

        /*
        by default
        sorting by numbers ==> Asecding order
        sorting for String , Character ==> Alphabetical order
         */

    }
}
