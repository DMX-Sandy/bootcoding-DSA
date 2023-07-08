package com.bootcoding.dsa.Linkedlist.Bootcoding;

public class Prime {
    public static void main(String[] args) {
        Node head = CreateList();
        print(head);
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node CreateList() {
        Node firs = new Node(20);
        Node second = new Node(3);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node head = firs;
        firs.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        return head;

    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            if (isPrime(temp.data)) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Node deleteMiddle(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp.next;

    }
}

