package Java_new;

import java.util.Scanner;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        char[] charArray = inputString.toCharArray();

        System.out.println("Duplicate characters in the string are: ");
        boolean foundDuplicate = false;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] != ' ') {
                int count = 0;

                for (int j = 0; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(charArray[i] + " appears " + count + " times.");
                    foundDuplicate = true;

                    for (int k = 0; k < charArray.length; k++) {
                        if (charArray[k] == charArray[i]) {
                            charArray[k] = ' ';
                        }
                    }
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }
}
