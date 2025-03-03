package Java_new;

import java.util.Vector;

public class Vectorex1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(5);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Vectors: "+numbers);
        System.out.println("Size"+numbers.size());
        System.out.println("Capacity"+numbers.capacity());

        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("After adding More "+numbers);
        System.out.println("New capacity"+numbers.capacity());

        numbers.remove(3);
                System.out.println("After removing"+numbers);

        System.out.println("First element"+numbers.firstElement());
        System.out.println("Last element"+numbers.lastElement());
    }
}
