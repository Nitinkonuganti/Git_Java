package Loops;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		int [] num = new int[3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		for(int i = 0; i<num.length; i++) {
			num[i]=sc.nextInt();			
		}
		System.out.println("The Numbers are");
		for(int i=0; i< num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
