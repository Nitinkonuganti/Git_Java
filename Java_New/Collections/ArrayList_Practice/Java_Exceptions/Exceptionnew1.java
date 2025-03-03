package Java_new.Java_Exceptions;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class Exceptionnew1 {
    int balance;
    public int deposit(int amount){
        balance=balance+amount;
        return balance;
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("amount should be minimum");
        }
    }
    public static void main(String[] args) {
        Exceptionnew1 customExceptionExample=new Exceptionnew1();
        System.out.println(customExceptionExample.deposit(5000));
        try{
            customExceptionExample.withdraw(7000);}
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}