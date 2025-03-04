package Java_new.Java_Streams;

import java.util.stream.Stream;

public class SortedMethod {
    public static void main(String[] args) {
        Stream.of(1,8,7,10,6,9,5,2,4,3)
                .sorted()
                .forEach(num-> System.out.println(num));
    }

//public static void main(String[] args) {
//        Stream.of("Nitin", "king", "beter", "Atul","Deer")
//                .sorted()
//                .forEach(str-> System.out.println(str));
//    }
}

