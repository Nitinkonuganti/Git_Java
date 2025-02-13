package Java_new;

import java.util.Scanner;

public class CountingCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int length = inputString.length();
        System.out.println("Total Number Of Characters in the string " + length);
    }
}
