package Java_new;

public class MultiplecatchException {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5] = 3/0;

        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occured");
        }
        System.out.println("rest of the code");
    }
}
