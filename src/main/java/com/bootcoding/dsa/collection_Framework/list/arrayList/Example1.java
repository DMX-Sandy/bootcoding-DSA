package com.bootcoding.dsa.collection_Framework.list.arrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
       //to add the data into list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        //to return the size of list
        System.out.println(  list.size());

        //to add the data at any position
        list.add(1,60);
        System.out.println(list);
        list.set(2,70);
        System.out.println(list);

        //to append the new list
        List<Integer> list1= new ArrayList<>();
        list1.add(20);
        list1.add(500);
        list.addAll(list1);
        System.out.println(list);

        //to get elemnt at any position
        System.out.println(list.get(4));

        //to check whether your element present in list or not
//        System.out.println(Integer.valueOf(40));

        //to remove any element in an list
        list.remove(3);
        System.out.println(list);

        //to remove the particular element in the list
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        //to check whether your particular value present in list or not
        System.out.println( list.contains(100));

        //to delement all the element present in list
//        list.clear();
//        System.out.println(list);

        //to iterator over a list

        //by simple for loop
        for(int i =0;i<list.size();i++){
            System.out.println("Element at " +i+" is "+list.get(i));
        }

        //by using for each loop
        for(Integer element :list){
            System.out.println("Element at using for each " +element);
        }

        //Iterator
        Iterator <Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
