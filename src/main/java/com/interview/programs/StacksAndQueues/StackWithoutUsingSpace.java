package com.interview.programs.StacksAndQueues;

public class StackWithoutUsingSpace {

    // Java program to implement Stack using linked
// list so that reverse can be done with O(1)
// extra space.
    class StackNode {
        int data;
        StackNode next;
        public StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        StackNode top;

        // Push and pop operations
        public void push(int data)
        {
            if (this.top == null) {
                top = new StackNode(data);
                return;
            }
            StackNode s = new StackNode(data);
            s.next = this.top;
            this.top = s;
        }
        public StackNode pop()
        {
            StackNode s = this.top;
            this.top = this.top.next;
            return s;
        }

        // prints contents of stack
        public void display()
        {
            StackNode s = this.top;
            while (s != null) {
                System.out.print(s.data + " ");
                s = s.next;
            }
            System.out.println();
        }

        // Reverses the stack using simple
        // linked list reversal logic.
        public void reverse()
        {
            StackNode prev, cur, next;

            cur = prev = this.top;
            cur = cur.next;
            prev.next = null;

            while (cur != null) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }

            this.top = prev;
        }


        public static void main(String[] args)
        {
            StackWithoutUsingSpace s = new StackWithoutUsingSpace();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            System.out.println("Original Stack");
            s.display();

            // reverse
            s.reverse();

            System.out.println("Reversed Stack");
            s.display();
        }
    }

