package com.interview.programs.StacksAndQueues;

public class QueueUsingLinkedList<T> {


    public static class Node<T>{
        T data;
        Node next;

        Node(T data){
            this.data=data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    //Add a data to the end of the List.
    public T add(T data){

        Node<T> newNode = new Node<>(data);

        if (last!=null){
            last.next = newNode;
        }
        last=newNode;
        if (first == null){
            first=last;
        }

        return (last.data);
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

        T data = first.data;
        first = first.next;
        if (first==null){
            last=null;
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
