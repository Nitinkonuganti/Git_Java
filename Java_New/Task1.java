package Loops;

public class Task1 {

    // Class and object creation
    class Car {
        String make;
        String model;
        int year;
        String color;

        public Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public void displayDetails() {
            System.out.println(make + " " + model);
        }
    }

    // Encapsulation
    class BankAccount {
        private String accountno;
        private double bal;

        public BankAccount(String accountno, double bal) {
            this.accountno = accountno;
            this.bal = bal;
        }

        public String getAccountno() {
            return accountno;
        }

        public void setAccountno(String accountno) {
            this.accountno = accountno;
        }

        public double getBal() {
            return bal;
        }

        public void setBal(double bal) {
            this.bal = bal;
        }

        public void deposit(double amount) {
            bal = bal + amount;
        }

        public void withdraw(double amount) {
            if (bal > 1000) {
                bal = bal - amount;
            }
        }

        public void displayBankDetails() {
            System.out.println(bal);
        }
    }

    // Inheritance
    class Animal {
        String name;
        int age;
    }

    class Dog extends Animal {
        public void speak() {
            System.out.println("Woof!");
        }
    }

    class Cat extends Animal {
        public void speak() {
            System.out.println("Meow!");
        }
    }

    // Abstraction
    abstract class Shape {
        public abstract double area();
    }

    class Circle extends Shape {
        public double area(double radius) {
            return 3.14 * radius * radius;
        }

        @Override
        public double area() {
            return 0;
        }
    }

    class Rectangle extends Shape {
        public int area(int length, int breadth) {
            return length * breadth;
        }

        @Override
        public double area() {
            return 0;
        }
    }

    // Constructor Overloading
    class Book {
        String title;
        String author;
        double price;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }

    // Method Overloading
    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }
    }

    // Interface
    interface Playable {
        public void play();
    }

    class Guitar implements Playable {
        public void play() {
            System.out.println("Playing guitar");
        }
    }

    class Piano implements Playable {
        public void play() {
            System.out.println("Playing piano");
        }
    }

    // Static
    class Student5 {
        String name;
        int age;
        static int totals = 0;

        Student5() {
            totals++;
        }
    }

    // Final
    class Vehicle {
        public final void move() {
            System.out.println("Vehicle is moving");
        }
    }

    class Car2 extends Vehicle {
        // We can't override a final method
    }

    public static void main(String xyz[]) {

        Task1 task1 = new Task1();

        Car c = task1.new Car("Hey", "Fortuner", 2010, "Black");
        c.displayDetails();

        BankAccount ba = task1.new BankAccount("123455", 4000);
        ba.deposit(4000);
        ba.withdraw(2000);
        ba.displayBankDetails();

        Cat c1 = task1.new Cat();
        c1.speak();

        Circle c2 = task1.new Circle();
        double area1 = c2.area(1.2);
        System.out.println(area1);

        Rectangle r = task1.new Rectangle();
        int area2 = r.area(10, 20);
        System.out.println(area2);

        Student5 s1 = task1.new Student5();
        Student5 s2 = task1.new Student5();
        Student5 s3 = task1.new Student5();
        System.out.println(Student5.totals);
    }
}
