package Java_new.Java_Collections.Queue_practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Nitin");
        queue.add("Reddy");
        queue.add("student");
        System.out.println("Initial queue"+queue);

        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Display the current head
        System.out.println("Current Head: " + queue.peek());

        // Display the updated queue
        System.out.println("Updated Queue: " + queue);
    }
   }


