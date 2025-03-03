package Java_new.Java_Collections.LinkedList_Practice;

import java.util.LinkedList;

public class LinkedListtask1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        System.out.println("Cities"+cities);

        cities.addFirst("Washington");
        cities.addLast("Las Vegas");
        System.out.println("Cities after adding at beginning and end"+cities);

        System.out.println("First city: "+cities.getFirst());
        System.out.println("Last city: "+cities.getLast());

        cities.remove("London");
        System.out.println("Cities after removing"+cities);

        cities.removeFirst();
        cities.removeLast();
        System.out.println("Cities after removing first and last"+cities);

        System.out.println("Number of cities: "+cities.size());
    }
}
