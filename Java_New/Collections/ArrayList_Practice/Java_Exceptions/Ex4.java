package Java_new.Java_Exceptions;

public class Ex4 {
    public static void main(String[] args) {
        try{
            try{
                int b = 39/2;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[] = new int[4];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("other statement ");
        }
        catch(Exception e){
            System.out.println("Handled exception(outer catch)");
        }
        System.out.println("end of main");
    }
}
