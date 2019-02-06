package com.interview.programs.StacksAndQueues;

import java.util.NoSuchElementException;

public class QueueUsingArray<T> {
    private T[] data;
    private int front, size, back;

    public final static int DEFAULT_INITIAL_ARRAY_SIZE = 16;
    /**
     * MAX_ARRAY_SIZE is set to Integer.MAX_VALUE - 8 to prevent OutOfMemoryErrors.
     */
    public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public QueueUsingArray() {
        this(DEFAULT_INITIAL_ARRAY_SIZE);
    }

    public QueueUsingArray(int capacity) throws IllegalArgumentException {
        if (capacity < 1) {
            throw new IllegalArgumentException("Queue capacity must be 1 or greater");
        }

        if (capacity > MAX_ARRAY_SIZE) {
            throw new IllegalArgumentException("Stack capacity is greater then maximum array size");
        }

        // Data variable is private so it will never be returned to the client
        // and the only method that can push elements onto the array would have to be the same type so it is OK
        // to suppress the warning message.
        @SuppressWarnings("unchecked")
        T[] tempData = (T[]) new Object[capacity];
        data = tempData;
    }

    public void add(T e) throws IllegalArgumentException {
        if (size == data.length) {
            throw new IllegalArgumentException("Ran out of memory to queue");
        }

        data[back] = e;
        back = (back + 1) % data.length;
        size++;
//        return this;
    }

    public T element() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("Queue does not contain any items.");
        }

        return data[front];
    }

    public T remove() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("Queue does not contain any items.");
        }

        size--;
        T output = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        return output;
    }

    public boolean offer(T e) {
        if (size == data.length) {
            return false;
        }

        size++;
        data[back] = e;
        back = (back + 1) % data.length;
        return true;
    }

    public T peek() {
        return size == 0 ? null : data[front];
    }

    public T poll() {
        if (size == 0) {
            return null;
        }

        T output= data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        return output;
    }


    public static void main(String a[]){

        QueueUsingArray<Integer> queue = new QueueUsingArray(10);

        queue.add(6);
        queue.add(3);
        queue.add(99);
        queue.add(56);
        queue.add(43);
        queue.add(89);
        queue.add(77);
        queue.add(32);
        queue.add(232);

        System.out.println(queue);


        System.out.println("Peek: "+queue.peek());
        System.out.println("Peek: "+queue.peek());
        System.out.println("Element: "+queue.element());
        System.out.println("Offer: "+queue.offer(77));
        System.out.println("Remove: "+queue.remove());
        System.out.println("Peek: "+queue.peek());
        System.out.println("Remove: "+queue.remove());
        System.out.println("Peek: "+queue.peek());
        System.out.println("Remove: "+queue.remove());
        System.out.println("Peek: "+queue.peek());



    }
}