package Java_new.Java_Collections.Dqueue_practice;

public class CustomPriorityQueue {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        else {
            if (newNode.data < head.data) {
                newNode.next = head;
                head = newNode;
                return;
            }
            else {
                Node temp = head;
                while (temp.next != null && temp.next.data < newNode.data) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("Underflow occurs");
            return;
        }
        System.out.println("Removed: " + head.data);
        head = head.next;
    }

    public void element() {
        if (head != null)
            System.out.println("Top Element: " + head.data);
        else
            System.out.println("Queue is empty");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            result.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        result.append("NULL");
        return result.toString();
    }

    public static void main(String[] args) {
        CustomPriorityQueue queue = new CustomPriorityQueue();
        queue.add(1);
        queue.add(28);
        queue.add(3);
        queue.add(47);
        queue.add(51);

        System.out.println("Queue: " + queue);
        queue.element();
        queue.remove();
        queue.element();
        System.out.println("Queue after removal: " + queue);
    }
}
