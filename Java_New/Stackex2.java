package Java_new;

import java.util.Stack;

public class Stackex2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushes"+stack);
        System.out.println("Top element"+stack.peek());
        System.out.println("Pop element"+stack.pop());
        System.out.println("Pop element"+stack.pop());
        System.out.println("Stack after pops"+stack);
        System.out.println("Is stack empty: "+stack.empty());

        int position = stack.search(20);
        if(position != -1){
            System.out.println("Element 20 is at position "+position);
        }else{
            System.out.println("Element 20 not found");
        }

        System.out.println("size of stack: "+stack.size());
    }
}
