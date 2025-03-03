//package Java_new.FileIO;
//
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//class Employee{
//    Integer id;
//    String name;
//    String dept;
//    Integer salary;
//    Integer age;
//
//    public Employee(Integer id, String name, String dept, Integer salary, Integer age) {
//        this.id = id;
//        this.name = name;
//        this.dept = dept;
//        this.salary = salary;
//        this.age = age;
//    }
//    public String toString() {
//        return id + " " + name + " " + dept + " " + salary + " " + age+"\n";
//    }
//}
//
//public class EmployeeManagement {
//    public static void main(String[] args) {
//        try (FileWriter filewriter = new FileWriter("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt")) {
//            filewriter.write(new Employee(1, "niharika", 23, "CSE", 10000).toString());
//            filewriter.write(new Employee(3, "abc", 22, "ACSE", 2000).toString());
//            filewriter.write(new Employee(2, "xyz", 26, "EEE", 3000).toString());
//            filewriter.write(new Employee(4, "wxyz", 24, "ECE", 1000).toString());
//        } catch (Exception e) {
//            System.out.print(e.getMessage());
//        }
//
//        searchEmployee(1);
//        updateEmployee(3);
//        deleteEmployee(2);
//        }
//
//
//        public static void searchEmployee(int id1) {
//        try((BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\FL_LPT-361\\Documents\\EmployeeDetails.txt"))) {
//            String line;
//            while ((line= bufferreader).readline())
//
//        }
//    }
//
//    }
//
