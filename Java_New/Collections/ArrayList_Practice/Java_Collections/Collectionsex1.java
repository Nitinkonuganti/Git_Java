package Java_new;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionsex1 {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("cherry");
        System.out.println(" Collection"+fruits);

        System.out.println("Contains banana "+fruits.contains("banana"));

        fruits.remove("Apple");
        System.out.println(" after removing apple"+fruits);

        System.out.println(" size "+fruits.size());

        fruits.clear();
        System.out.println(" Collection empty: "+fruits.isEmpty());
    }
}
