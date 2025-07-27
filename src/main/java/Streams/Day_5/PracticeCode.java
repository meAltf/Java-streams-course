package Streams.Day_5;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    String dept;
    double salary;

    Employee(String name, int age, String dept, double salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " from " + dept;
    }
}


public class PracticeCode {

    public static void main(String[] args) {

        // Sorting by Length
        List<String> namesList = Arrays.asList("Alataf", "Zack", "Jothn", "Bob");
        namesList.sort(Comparator.comparingInt(String::length));
        System.out.println(namesList);

        // Group employees by department
        List<Employee> employeeList = Arrays.asList(
                new Employee("robert", 25, "IT", 280000),
                new Employee("broon", 26, "ETF", 28000),
                new Employee("henry", 24, "IT", 680000),
                new Employee("richard", 29, "TT", 270000),
                new Employee("malevi", 25, "ETF", 230000)
        );
        Map<String, List<Employee>> grouped = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(grouped);

        // Get total salary by department
        Map<String, Double> salaryByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println(salaryByDept);

        // Find employee with the highest salary
        Optional<Employee> topEmp = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(topEmp);

    }
}
