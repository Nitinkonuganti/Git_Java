package Java_new;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuebyFIFO {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(12);
        queue.offer(25);
        queue.offer(34);

        System.out.println("Queue: " + queue);

        queue.poll();

        System.out.println("Queue after poll " + queue);
    }
}
