package com.bootcoding.dsa.collection_Framework.list.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.offer(20);
        q.offer(30);
        q.offer(12);
        q.offer(14);
        q.offer(13);

        System.out.println(q);
    }
}
