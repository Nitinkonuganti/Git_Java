package Java_new.Java_Streams;


import java.util.Arrays;
import java.util.List;

/// even and odd numbers in single line in java 8
public class StreamsEx4 {
    public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Even numbers: " + numbers.stream().filter(n -> n % 2 == 0).toList()
                + "odd :" + numbers.stream().filter(n -> n % 2 != 0).toList());
    }

}
