package Java_new;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx2 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("yellow");
        q.add("red");
        q.add("blue");
        q.add("green");
        System.out.println("Queue elements"+q);
    }
}
