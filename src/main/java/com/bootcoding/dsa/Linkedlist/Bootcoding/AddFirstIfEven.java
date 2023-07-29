package com.bootcoding.dsa.Linkedlist.Bootcoding;

public class AddFirstIfEven {
    public static void main(String[] args) {
        Node head=CreateNode();
        head=Ifeven(head);
        print(head);

    }
    public static Node CreateNode(){
     Node First=new Node(20);
     Node Second=new Node(30);
     Node Third=new Node(40);
     Node head=First;
     First.next=Second;
     Second.next=Third;
     Third.next=null;
     return head;

    }
  public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node Ifeven(Node head){


        Node n=new Node(88);
        if(n.data%2==0) {
            n.next = head;
            head = n;
        }
        return head;
    }

    private static void print(Node head){
      Node temp=head;
      while(temp!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
    }
}
