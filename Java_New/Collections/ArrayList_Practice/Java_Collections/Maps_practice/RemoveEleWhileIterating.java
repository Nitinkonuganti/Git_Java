package Java_new.Java_Collections.Maps_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEleWhileIterating {
    public static void main(String[] args) {
     List<Integer>numbers = new ArrayList<>(Arrays.asList(100, 20, 34, 470, 5));

     Iterator<Integer> iterator = numbers.iterator();

     while (iterator.hasNext()) {
         int number = iterator.next();
         if (number % 2 == 0) {
             iterator.remove();
         }
     }
     System.out.println("After removing even"+numbers);
    }
}
