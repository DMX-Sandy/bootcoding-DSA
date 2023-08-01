package com.bootcoding.dsa.Linkedlist.YT;

public class LLYT {
    private Node head;
    private Node tail;
    private int size=0;
    public LLYT() {
        this.size = size;
    }
     public  class Node{
        int value;
        Node next;

         public Node(int value) {
             this.value = value;
         }

         public Node(int value, Node next) {
             this.value = value;
             this.next = next;
         }

     }
    //Insert Element at The first node
     public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }

   //To print the linkedlist element
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;

        }
        System.out.print("End");
    }
    //Insert element at last if tail is given
    public void insertlastIftailthere(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node=new Node(value);

        tail.next=node;
        node=tail;
        size++;

    }
    //Insert the element at the last if tail is not there
    public void insertlastiftailnotthere(int value){
        if(head==null){
            head=new Node(value);
            return;
        }
        Node node=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    //Insert the element at any index in the middle of the linked list .
    /*In case of you want to insert a node at any index then you have to find the lengthof the linkedlist
    and then put the indexnumber where you want to place the new node .*/
    public void insertatmiddle(int value,int index) {

        if (index == 0) {
            insertfirst(value);
            return;
        }
        if (index == size) {
            insertlastiftailnotthere(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    //Delete the element at first
    public void Deletefirst(){
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    //Delete first Element if tail was there
    public int Deletefirstiftail(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return value;
    }

    //Delete the last element of the Linked List if tail is given there
    public int deletelastiftail(){
        if(size<=1){
          return Deletefirstiftail();
        }

            Node Secondlast=get(size-2);
            int value=tail.value;
            tail=Secondlast;
            tail.next=null;
            return value;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;

    }

    //Delete the element present at any index.
    public int Deletemiddle(int index){
        if(index==0){
            return Deletefirstiftail();
        }
        if(index==(size-1)){
            return deletelastiftail();
        }
        Node middle=get(index-1);
        int value=middle.value;
        middle.next=middle.next.next;
        return value;
    }

}
