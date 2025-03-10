//import Java_new.Java_Streams.Employee;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Employee {
//    String name;
//    Double salary;
//
//    public Employee(String name, Double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return name + " - $" + (salary != null ? salary : "N/A");
//    }
//}
//
//class EmployeesWithHighSalaries {
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Nitin", 5000.0));
//        employees.add(new Employee("Raj", 800.0));         // Below threshold
//        employees.add(new Employee("John", 3500.0));
//        employees.add(new Employee("Aryan", null));        // Null salary
//        employees.add(new Employee("Meera", 7000.0));
//
//        // Salary threshold
//        double salaryThreshold = 3000.0;
//
//        // Filtering employees with salary greater than the threshold using Lambda Expressions
//        List<Employee> highSalaryEmployees = employees.stream()
//                .filter(emp -> emp.getSalary() != null && emp.getSalary() > salaryThreshold)
//                .collect(Collectors.toList());
//
//        // Display filtered employees
//        System.out.println("Employees with High Salaries:");
//        highSalaryEmployees.forEach(System.out::println);
//    }
//}
