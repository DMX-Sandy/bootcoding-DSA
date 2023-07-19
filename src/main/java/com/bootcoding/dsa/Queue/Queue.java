package com.bootcoding.dsa.Queue;

public class Queue {
    int size=5;
    int items[]=new int[size];
    int front,rear;

    Queue(){
        front=-1;
        rear=-1;
    }

    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }

    void EnQueue(int element){
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1 && rear == -1) {
                front = rear = 0;
                items[rear] = element;
            } else {
                rear++;
                items[rear] = element;
                System.out.println("Inserted " + element);
            }
        }
    }

    int  DeQueue(){
        int element = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = peak(); // gives you first element
            if (front == rear) {
                front = rear = -1;
            }
            front++;

            System.out.println("Deleted -> " + element);
            return (element);
        }
        return -1;
    }

    int peak(){
        return items[front];
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        // deQueue is not possible on empty queue
        q.DeQueue();

        // enQueue 5 elements
        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(5);
        q.DeQueue();
        // 6th element can't be added to because the queue is full
        q.EnQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.DeQueue();

        // Now we have just 4 elements
        q.display();

    }


}
