package lab3.Zadanie3.number3;

import java.util.Arrays;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-20s: $%,.2f", fullname, salary);
    }

    public static class Report {
        public static void generateReport(Employee[] employees) {
            System.out.println("Отчет о сотрудниках:");
            System.out.println("=====================");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        // Создаем несколько объектов Employee
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван Петров", 50000.75);
        employees[1] = new Employee("Мария Сидорова", 60000.0);
        employees[2] = new Employee("Андрей Иванов", 75000.25);

        // Генерируем отчет о сотрудниках
        Report.generateReport(employees);
    }
}
