package Java_new.Java_Collections.Dqueue_practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeuebyLIFO {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack"+stack);

        stack.pop();
        System.out.println("Stack after pop"+stack);
    }
}
