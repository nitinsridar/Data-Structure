package com.interview.programs.StacksAndQueues;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class StackUsingArray<E> {

    private int size = 0;
    private E[] elements;
    public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    public static final int INITIAL_ARRAY_SIZE = 16;

    public StackUsingArray(int capacity) throws IllegalArgumentException{

        if(capacity < INITIAL_ARRAY_SIZE) throw new IllegalArgumentException("Stack Capacity must be greater than 1");
        if (capacity > MAX_ARRAY_SIZE) throw new IllegalArgumentException("Stack capacity is greater then MAX Array Size");

        elements = (E[]) new Object[capacity];
    }

    public void push(E e){
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E pop(){
        E e = (E) elements[--size];
        elements[size]=null;
        return e;
    }

    public E peek() throws NoSuchElementException {
        if(size < 1) throw new NoSuchElementException("Stack Empty");

        E e = (E) elements[--size];
        size++;
        return e;
    }
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i=0;i<size; i++){
        sb.append(elements[i].toString());
        if(i<size-1)
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args)
    {
        StackUsingArray<Integer> stack = new StackUsingArray<>(30);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println("Peek: "+stack.peek());
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack );
    }
}