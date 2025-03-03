package Java_new.Java_Exceptions;

public class Exceptionex1 {
//    public static void main(String[] args) {
//        try{
//            int data = 100/0;
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of code");
//    }

//        public static void main(String[] args) {
//            try {
//
//                int data = 50 / 0; //may throw exception
//            }
//            catch(ArithmeticException e) {
//                System.out.println(e);
//            }
//            finally {
//                System.out.println("finally");
//            }
//            System.out.println("rest of the code");
//
//        }

    //    public static void main(String[] args) {
//        try{
//            int data = 1000/0;
//        }
//        catch (Exception e){
//            System.out.println("Cannot divide by zero");
//        }
//    }
//    public static void main(String[] args) {
//
//
//        int a = 1;
//        int b = 2;
//        int data;
//        try {
//            data = a / b;
//        } catch (Exception e) {
//            System.out.println(a / (b + 2));
//        }
//
//    }


    public static void main(String[] args) {
        try{
            int data1 = 100/0;
        }
        catch(Exception e){
            int data2 = 10/0;
        }
        System.out.println("rest of code");
    }
}

