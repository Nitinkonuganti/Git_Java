package Java_new;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]= 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occours");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occours");
        }
        catch (Exception e){
            System.out.println("parent Exception occours");
        }
        System.out.println("rest of code");
    }
}
