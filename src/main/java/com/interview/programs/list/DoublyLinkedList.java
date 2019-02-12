package com.interview.programs.list;


//https://algorithms.tutorialhorizon.com/doubly-linked-list-complete-implementation/
public class DoublyLinkedList {

    class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data = data;
            next = null;
            previous = null;
        }
    }

    int size =0;
    Node rear = null;
    Node front = null;

    public Node addAtFront(int data){
        System.out.println("Adding Node " + data + " at the start");
        Node n = new Node(data);
        if(size==0){
            rear = n;
            front = n;
        }else{
            n.next = rear;
            rear.previous = n;
            rear = n;
        }
        size++;
        return n;
    }

    public Node addAtEnd(int data){
        System.out.println("Adding Node " + data + " at the End");
        Node n = new Node(data);
        if(size==0){
            rear = n;
            front = n;
        }else{
            front.next = n;
            n.previous = front;
            front =n;
        }
        size++;
        return n;
    }

    public Node addAfter(int data, Node prevNode){
        if(prevNode==null){
            System.out.println("Node after which new node to be added cannot be null");
            return null;
        }else if(prevNode==front){//check if it a last node
            return addAtEnd(data);
        }else{
            System.out.println("Adding node after "+ prevNode.data);
            //create a new node
            Node n = new Node(data);

            //store the next node of prevNode
            Node nextNode = prevNode.next;

            //make new node next points to prevNode
            n.next = nextNode;

            //make prevNode next points to new Node
            prevNode.next = n;

            //make nextNode previous points to new node
            nextNode.previous = n;

            //make  new Node previous points to prevNode
            n.previous = prevNode;
            size++;
            return n;
        }
    }

    public void deleteFromFront(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting node " + rear.data + " from start");
            rear = rear.next;
            size--;
        }
    }

    public void deleteFromRear(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else if(size==1){
            deleteFromFront();
        }else{
            //store the 2nd last node
            int x = front.data;
            Node prevTail = front.previous;

            //detach the last node
            front = prevTail;
            front.next=null;
            System.out.println("\ndeleting node " + x + " from end");
            size--;
        }
    }

    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        Node n = rear;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.data;
    }

    //get Size
    public int getSize(){
        return size;
    }

    public void print(){
        Node temp = rear;
        System.out.print("Doubly Linked List: ");
        while(temp!=null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        Node x = d.addAtFront(2);
        d.addAtFront(1);
        d.print();
        d.addAtEnd(3);
        d.print();
        d.addAfter(4,x);
        d.print();
        d.deleteFromFront();
        d.print();
        System.out.println("Element at index 2: "+d.elementAt(2));
        d.addAtFront(1);
        d.print();
        d.deleteFromRear();
        d.print();
        System.out.println("Size of the Linked List: " + d.getSize());
    }
}



