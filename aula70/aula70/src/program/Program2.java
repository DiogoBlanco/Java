package program;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter employee name: ");
        employee.name = sc.nextLine();
        System.out.println("Enter employee gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter employee salary tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();
        System.out
                .printf("Employee: %s, $ %.2f%n", employee.name,
                        employee.netSalary(employee.grossSalary, employee.tax));
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.increaseSalary(percentage));
    }
}
