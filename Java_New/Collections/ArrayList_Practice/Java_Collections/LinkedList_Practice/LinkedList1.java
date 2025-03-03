package Java_new.Java_Collections.LinkedList_Practice;

import org.w3c.dom.Node;

public class LinkedList1 {
    Node head;

    static class  Node{
        int data;
        Node next;
        Node(int d){data = d; next = null;}
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

}
