package com.bootcoding.dsa.Linkedlist.Bootcoding;

public class InsertAtLast {
    public static void main(String[] args) {
        Node head=new Node(3);
        insert(head,3000);
        insert(head,5000);



        print(head);
    }


    private static void insert(Node head, int value) {
        if(head==null){
            head=new Node(value);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(value);
    }

    private static void print(Node head){
        Node temp=head;

        while(temp!=null){
            if(temp.data%2==0)
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

}
