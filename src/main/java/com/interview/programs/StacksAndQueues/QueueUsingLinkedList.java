package com.interview.programs.StacksAndQueues;

public class QueueUsingLinkedList<T> {


    public static class Node<T>{
        T data;
        Node next;

        Node(T data){
            this.data=data;
        }
    }

    private Node<T> front;
    private Node<T> rear;

    //Add a data to the end of the List.
    //Create a new node with the value to be inserted.
    //If the queue is empty, then set both front and rear to point to newNode.
    //If the queue is not empty, then set next to the rear of the new node and the rear to point to the new node.
    public T add(T data){

        Node<T> newNode = new Node<>(data);

        if (rear!=null){
            rear.next = newNode;
        }
        rear=newNode;
        if (front == null){
            front=rear;
        }

        return (rear.data);
    }

//    //Add item to the end of the list.
//    public void insert(Item item)
//    {
//        Node oldRear = rear;
//        rear = new Node();
//        rear.item = item;
//        rear.next = null;
//        if (isEmpty())
//        {
//            front = rear;
//        }
//        else
//        {
//            oldRear.next = rear;
//        }
//        size++;
//    }
    public T remove(){

        T data = front.data;
        front = front.next;
        if (front==null){
            rear=null;
        }
        return data;
    }

    public static void main(String[] args) {

        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

        System.out.println(queue.add(10));
        System.out.println(queue.add(20));
        System.out.println(queue.add(30));
        System.out.println(queue.add(50));
        System.out.println(queue.add(40));
        System.out.println(queue.add(70));
        System.out.println(queue.add(80));
        System.out.println(queue.add(90));
        System.out.println(queue.add(00));

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
