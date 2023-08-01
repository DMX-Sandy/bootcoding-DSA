package com.bootcoding.dsa.Linkedlist.YT;
//Comment and uncomment the class for each operation.
public class main {
    public static void main(String[] args) {
        LLYT list=new LLYT();
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertlastIftailthere(80);
        list.insertlastiftailnotthere(88);
        list.insertatmiddle(99,3);
        list.display();
        System.out.println();

        list.Deletefirst();
        list.display();

        System.out.println();
        System.out.println(list.Deletefirstiftail());
        list.display();

        System.out.println();
        list.deletelastiftail();
        list.display();

        System.out.println();
        list.Deletemiddle(2);
        list.display();

    }
}
