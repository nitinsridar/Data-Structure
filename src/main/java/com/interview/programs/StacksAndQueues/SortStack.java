package com.interview.programs.StacksAndQueues;

import java.util.*;

/*Create a temporary stack say tmpStack.
While input stack is NOT empty do this:
Pop an element from input stack call it temp
while temporary stack is NOT empty and top of temporary stack is greater than temp,
pop from temporary stack and push it to the input stack
push temp in temporary stack
The sorted numbers are in tmpStack
*/

public class SortStack {
    // This function return the sorted stack
    public static Stack<Integer> sortstack(Stack<Integer> input) {

        // This is the temporary stack
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty()) {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> tmpStack=sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}
