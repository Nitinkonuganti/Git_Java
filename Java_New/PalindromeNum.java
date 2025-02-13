package Java_new;
import java.util.Scanner;
public class PalindromeNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int rev=0;
        int temp=num;
        while(num!=0){
            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not a palindrome");
        }
    }
}
