package Java_new.Java_Exceptions;

import java.io.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionExample {

    public static void readFile() throws IOException {
        throw new IOException("File not found.");
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18.");
        }
    }

    public static void demonstrateExceptions() {
        try {
            System.out.println("Trying to read file...");
            readFile();
            System.out.println("Validating age...");
            validateAge(15);
            int result = 10 / 0;

        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());

        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } finally {
            System.out.println("This block always executes!");
        }
    }

    public static void main(String[] args) {
        try {
            demonstrateExceptions();
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }
    }
}
