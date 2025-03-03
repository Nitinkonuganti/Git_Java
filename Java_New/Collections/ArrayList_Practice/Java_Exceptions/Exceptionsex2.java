package Java_new.Java_Exceptions;

public class Exceptionsex2 {
    public static void main(String[] args) {
        try{
            int arr[]={1,3,5,7,8};
            System.out.println(arr[47]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
