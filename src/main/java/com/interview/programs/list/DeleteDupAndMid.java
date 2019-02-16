package com.interview.programs.list;

import java.util.HashSet;
import java.util.Set;

public class DeleteDupAndMid {

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

        Node node = head;

        while(node!=null){
            System.out.print(node.data+ "--->");
            node = node.next;
        }
        System.out.println();
    }

    public void deleteDups() {
        if (head == null) {
        }
        Node current = head;
        Node previous = null;

        /* We need just one pointer here i.e previous to keep track of
         * previous node, because if we find duplicate, we have to remove
         * current node and point previous to next */
        Set<Integer> set = new HashSet<>();
        /* Check until current is not null, we will be incrementing current */
        while (current != null) {
            /* If value doesn't exist in set, add it
             * and move the pointer else just move the pointer */
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }


    public static void main(String[] args) {

        DeleteDupAndMid head = new DeleteDupAndMid();
        for(int i = 11; i>=1; --i){
            head.push(i);
        }

        head.push(1);
        head.push(2);
        head.push(7);

        head.printList();

        head.deleteDups();

        head.printMiddle();
        head.printList();



    }
}
