package com.bootcoding.dsa.collection_Framework.list.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();


        System.out.println(q.add(20));

        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
          q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());

        System.out.println(q.element());

    }
}
