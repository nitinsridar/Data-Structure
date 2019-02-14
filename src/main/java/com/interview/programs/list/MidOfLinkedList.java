package com.interview.programs.list;

public class MidOfLinkedList {

    private static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }


    Node head;


    //Using Slow Pointer and Fast Pointer
    public void printMiddle() {

        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {

                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("Mid Element is " + slow_ptr.data);
        }
    }

    public void push(int data){

        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    private void printList() {

        Node lnode = head;
        while(lnode.next != null){
            System.out.print(lnode.data+ "--->");
            lnode = lnode.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {

        MidOfLinkedList mid = new MidOfLinkedList();

        for(int i = 11; i>=1; --i){
            mid.push(i);
        }

        mid.printList();
        mid.printMiddle();

    }
}
