package com.bootcoding.dsa.collection_Framework.list.stack;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack <String> stck = new Stack<>();
        stck.push("hatti");
        stck.push("cat");
        stck.push("Ghoda");
        stck.push("gadha");

        System.out.println(stck);

        System.out.println(stck.peek());

        stck.pop();
        System.out.println(stck);

        System.out.println(stck.get(2));
        System.out.println( stck.isEmpty());
        System.out.println( stck.size());

    }
}
