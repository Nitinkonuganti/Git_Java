package Loops;

public class BankAcc {
	private String accountHoldername;
	private int accountnumber;
	private double balance;
	
	public BankAcc(String accountHoldername, int accountNumber, double initialDeposite) {
		this.accountHoldername = accountHoldername;
		this.accountnumber = accountNumber;
		this.balance = initialDeposite;
	}
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposite" + amount);
		}else {
			System.out.println("Invalid  dep amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount <=balance) {
			balance-=amount;
			System.out.println("insufficent amount");
		}else {
			System.out.println("Invalid Withdrawal amount");
		}
	}
	
	public void checkbalance() {
		System.out.println("current balance" + balance);
	}
	
	public void displayAccountInfo(){
		System.out.println("accountHolder" + accountHoldername);
		System.out.println("Account Number" + accountnumber);	
	}

	
	
	public static void main(String[] args) {
		BankAcc account = new BankAcc("John Doe", 123456789, 500.00);
		account.displayAccountInfo();
		
	}

}
