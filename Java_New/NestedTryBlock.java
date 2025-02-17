package Java_new;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {

            try {
                System.out.println("Going to divide by zero");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
                System.out.println("Other statement");
            }

            System.out.println("Normal flow after exception handling");
        } catch (Exception e) {
            System.out.println("Handled exception (outer catch)");
        }
    }
}
