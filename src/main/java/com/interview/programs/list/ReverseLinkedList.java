package com.interview.programs.list;

public class ReverseLinkedList {

    static Node head;

    private static class Node{

        Node next;
        int data;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void append(int data){

        if(head == null){
            Node new_node = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }


    public void prepend(int data){

        Node new_node = new Node(data);
        new_node = head.next;
        head = new_node;
    }

    public Node reverseLinkedList(Node node){

        Node prev = null;
        Node current = node;
        Node next = null;
        while(current.next != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printList(Node node){

        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }

    }

    public static void main(String[] args) {

        ReverseLinkedList rl = new ReverseLinkedList();

        rl.head = new Node(10);
        rl.head.next = new Node(20);
        rl.head.next.next = new Node(30);

        System.out.println("Calling Reverse");
        rl.printList(head);

    }

}
