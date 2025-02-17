package Java_new;

import java.util.Stack;

public class Stackex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack : "+stack);
        System.out.println("Top element: "+stack.peek());
        System.out.println("Pop element: "+stack.pop());
        System.out.println("Is stack empty: "+stack.isEmpty());
        System.out.println("Position of 10: "+stack.search(10));
    }
}
