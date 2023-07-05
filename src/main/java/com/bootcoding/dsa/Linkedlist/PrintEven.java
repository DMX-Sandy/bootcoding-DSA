package com.bootcoding.dsa.Linkedlist;

public class PrintEven {
    public static void main(String[] args) {
        Node head=new Node(2);
        insert(head,33);
        insert(head,53);
        print(head);
    }
    public static void insert(Node head,int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    public static void print(Node head){
        Node temp=head;

        while(temp!=null) {
            if(temp.data%2==0) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

