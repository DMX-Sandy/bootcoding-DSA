package com.bootcoding.dsa.collection_Framework.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
       LinkedList<Integer> linkedlist = new LinkedList<>();

        List<Integer> ll2 = new LinkedList<>();

        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(50);

        ll2.add(70);
        ll2.add(50);

        linkedlist.addAll(ll2);

        System.out.println(linkedlist);
        System.out.println(linkedlist.size());

        linkedlist.add(2,60);
        System.out.println(linkedlist);

        linkedlist.remove();
        System.out.println(linkedlist);

        linkedlist.remove(Integer.valueOf(50));
        System.out.println(linkedlist);

        System.out.println(linkedlist.contains(50));
//        int [] n = {10,20,30,40};
//        for(int i =0;i<n.length;i++){
//         System.out.println(n[i]);
//        }


    }
}
