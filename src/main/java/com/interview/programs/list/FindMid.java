package com.interview.programs.list;


public class FindMid {

    Node head;

    private static class Node{

        int data;
        Node next;
        Node Prev;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }


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
            System.out.println(lnode.data+ "->");
            lnode = lnode.next;
        }
    }

    public static void main(String[] args) {

        FindMid fm = new FindMid();

        for(int i = 6; i>0; --i){

            fm.push(i);
            fm.printMiddle();
            fm.printList();
        }
    }
}
