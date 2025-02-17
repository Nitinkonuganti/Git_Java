package Java_new;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountholdername;

    public BankAccount(String accountholdername, double initialDeposit, int accountNumber) {
        this.accountholdername = accountholdername;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountholdername);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example: Creating a bank account for Nitinreddy
        BankAccount account = new BankAccount("Nitinreddy", 5000.00, 1456695);

        account.displayAccountInfo();
        account.checkBalance();
        System.out.println("Enter amount to deposit:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        account.checkBalance();

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        account.checkBalance();


        ///inheritance: creating a new child class from its parent class
        /// encapsulation: wrapping data variables into a single unit class
        /// abstraction: hidding unnessacary details and showing essential details
        /// Polymorphism: Having many forms
        ///overloading: same method name but diff parameters
        /// overriding: same method name and same parameters

    }
}
