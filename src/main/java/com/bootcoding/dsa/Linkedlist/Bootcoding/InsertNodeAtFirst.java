package com.bootcoding.dsa.Linkedlist.Bootcoding;

public class InsertNodeAtFirst {
    public static void main(String[] args) {
       Node head= CreateNode();
       head=insert(head);
       print(head);
    }
    public static Node CreateNode() {
        Node firstNode=new Node(2);
        Node SecondNode=new Node(20);
        Node ThirdNode=new Node(30);
        Node head=firstNode;
        firstNode.next=SecondNode;
        SecondNode.next=ThirdNode;
        ThirdNode.next=null;
        return head;

    }

    private static Node insert(Node head){
        Node n=new Node(90);
        n.next=head;
        head=n;
        return head;
    }
    public static void print(Node head){
    Node temp=head;
    while(temp.next !=null){
        System.out.println(temp.data);
        temp=temp.next;
    }

    }
}
