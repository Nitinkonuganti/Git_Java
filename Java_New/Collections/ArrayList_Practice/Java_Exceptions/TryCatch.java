package Java_new.Java_Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int data = 0/0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
