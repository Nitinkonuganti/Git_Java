package Java_new;

public class Linkedlisttask2 {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtbeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }


    public void displayForward() {
        Node current = head;
        System.out.println("Forward:");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node current = head;
        if (current == null) return;

        while (current.next != null) {
            current = current.next;
        }

        System.out.println("Backward:");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlisttask2 list = new Linkedlisttask2();

        list.insertAtbeginning(10);
        list.insertAtbeginning(20);
        list.insertAtbeginning(30);

        list.displayForward();
        list.displayBackward();
    }
}
