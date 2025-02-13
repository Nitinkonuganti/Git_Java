package Java_new;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKEle {

    public static Queue<Integer> reverseQueue(Queue<Integer> queue, int k) {
        if (queue == null || queue.isEmpty() || k <= 0 || k > queue.size()) {
            System.out.println("Invalid Input");
            return queue;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        int remainder = queue.size() - k;
        for (int i = 0; i < remainder; i++) {
            queue.add(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println("Original Queue: " + queue);

        int k = 3;
        Queue<Integer> reversedQueue = reverseQueue(queue, k);

        System.out.println("Queue after reversing first " + k + " elements: " + reversedQueue);
    }
}
