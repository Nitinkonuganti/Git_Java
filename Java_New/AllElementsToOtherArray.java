package Java_new;

import java.util.Scanner;

public class AllElementsToOtherArray {
    public static void main(String[] args) {
        int[] originalarray = {20,50,80,90,63};
        int[] otherarray = new int[originalarray.length];
        for (int i = 0; i < originalarray.length; i++) {
            otherarray[i] = originalarray[i];
        }
        System.out.println("otherarray");
        for (int i = 0; i < otherarray.length; i++) {
            System.out.println(otherarray[i]+ " ");
        }
    }
}
