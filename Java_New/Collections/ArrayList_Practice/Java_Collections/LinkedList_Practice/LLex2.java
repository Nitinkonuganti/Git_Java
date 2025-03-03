package Java_new.Java_Collections.LinkedList_Practice;

import java.util.LinkedList;

public class LLex2 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");


        System.out.println("first element "+fruits.getFirst());
        System.out.println("last element "+fruits.getLast());

        fruits.removeFirst();
        System.out.println(fruits);
    }
}
