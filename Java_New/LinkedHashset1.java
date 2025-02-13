package Java_new;

import java.util.LinkedHashSet;

public class LinkedHashset1 {
    public static void main(String[] args) {
        LinkedHashSet <String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Cherry");
        System.out.println("Fruits in linkedhashset"+fruits);

        System.out.println("Contains Banana ? " + fruits.contains("Banana"));
        fruits.remove("orange");
        System.out.println("After removing orange"+fruits);
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


    }
}
