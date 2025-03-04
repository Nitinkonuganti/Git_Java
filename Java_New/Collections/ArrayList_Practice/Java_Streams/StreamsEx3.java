package Java_new.Java_Streams;

import java.util.List;

public class StreamsEx3 {
    public static void main(String[] args) {
        List<String> names = List.of("Nitin", "Nikhil", "Peter", "Paul");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
