package com.interview.programs.StacksAndQueues;

public class StackUsingLinkedList<T> {

    private static class Node<T>{
        private T data;
        private Node<T> next = null;

        Node(T element){
            data = element;
        }
    }

    private Node<T> top = null;

    public void push(T data){

        Node<T> newNode = new Node(data);

        if(top == null){
            top = newNode;
        }else {
            newNode.next = top;
            top=newNode;
        }

    }

    public T pop(){
        if(top == null){
            System.out.println("Stack Empty");

        }
        T output = top.data;
        top = top.next;

        return output;
    }


    public T peek(){
        if(top == null){
            System.out.println("Stack Empty");
        }

        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
