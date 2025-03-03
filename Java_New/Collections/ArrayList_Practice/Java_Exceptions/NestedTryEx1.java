package Java_new.Java_Exceptions;

public class NestedTryEx1 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException");
                    System.out.println("Inner try block 2");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } catch (Exception e5) {
                System.out.println("Exception");
                System.out.println("Handled main try block");
            }
        } catch (Exception e) {
            System.out.println("Outermost Exception block");
        }
    }
}
