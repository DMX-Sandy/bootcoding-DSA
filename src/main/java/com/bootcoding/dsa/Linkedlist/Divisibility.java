package com.bootcoding.dsa.Linkedlist;

public class Divisibility {
    public static void main(String[] args) {
        Node head=createNode();
        print(head);
    }
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

   private static Node createNode(){
        Node first=new Node(20);
        Node second=new Node(30);
        Node third=new Node(40);
        Node fourth=new Node(53);
        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        return head;
   }
   private static void print(Node head){
        Node temp=head;
       while (temp!=null){
           if(temp.data%3==0 || temp.data%5==0){
               System.out.println(temp.data);
           }
           temp=temp.next;
       }

   }
}
