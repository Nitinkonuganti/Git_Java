package Java_new;

import java.util.Arrays;
import java.util.Comparator;

public class SortingInAsendingOrderInArray {
    public static void main(String[] args) {
        Integer[] arr = {5, 2 , 2  ,8 ,8 ,6 ,4};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("Sorted Array: in ascending order");
        for (int i = 0; i < arr.length; i++) {}
    }
}
