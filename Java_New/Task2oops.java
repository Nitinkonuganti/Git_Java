//package Java;
//abstract class Transaction {
//    public abstract void deposit(double amount);
//    public abstract void withdraw(double amount);
//}
//
//interface Transactions {
//    void deposit(double amount);
//    void withdraw(double amount);
//}
//
//class BankAccount implements Transactions {
//    private String accountNumber;
//    private String accountHolderName;
//    private double balance;
//    static int totalAccounts = 0;
//
//    // Constructor 1: Initialize with zero balance
//    public BankAccount(String accountNumber, String accountHolderName) {
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//        this.balance = 0;
//        totalAccounts++;
//    }
//
//    // Constructor 2: Initialize with an initial balance
//    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//        this.balance = initialBalance;
//        totalAccounts++;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    // Implementing deposit from Transactions interface
//    @Override
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposit: " + amount);
//        System.out.println("New balance: " + balance);
//    }
//
//    // Implementing withdraw from Transactions interface
//    @Override
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println("Withdrawal: " + amount);
//            System.out.println("New balance: " + balance);
//        } else {
//            System.out.println("Insufficient Funds");
//        }
//    }
//
////    public static void displayTotalAccounts() {
////        System.out.println("Total Accounts Created: " + totalAccounts);
////    }
////}
//
//// Derived class SavingsAccount (Inheritance)
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
//        super(accountNumber, accountHolderName, initialBalance);
//        this.interestRate = interestRate;
//    }
//
//    public double calculateInterest() {
//        return getBalance() * interestRate / 100;
//    }
//
//    // Overriding deposit method to calculate interest
//    @Override
//    public void deposit(double amount) {
//        super.deposit(amount);
//        System.out.println("Interest: " + calculateInterest());
//    }
//}
//
//// Main class to test the solution
//public class BankingSystem {
//    public static void main(String[] args) {
//        // Create BankAccount instance
//        BankAccount account1 = new BankAccount("101", "John Doe");
//        account1.deposit(5000);
//        account1.withdraw(1500);
//        account1.displayTotalAccounts();
//
//        // Create SavingsAccount instance
//        SavingsAccount savingsAccount = new SavingsAccount("102", "Jane Doe", 10000, 5);
//        savingsAccount.deposit(2000);
//        savingsAccount.withdraw(500);
//        savingsAccount.displayTotalAccounts();
//
//        // Display total accounts
//        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
////    }
////}
