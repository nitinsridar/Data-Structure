package com.interview.programs.list;

//import java.util.LinkedList;

public class LinkedList {


    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int element) {
            this.data = element;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;

    public void append(int data){

        if (head == null){
            head = new Node(data);
            return;
        }

       Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }


    public  void  deleteWithValue(int data){

        if(head == null)
            return;
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(10);

    }
}
