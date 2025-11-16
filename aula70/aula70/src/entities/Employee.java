package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(double grossSalary, double tax) {
        return this.grossSalary - this.tax;
    }

    public double increaseSalary(double percentage) {
        return grossSalary * (percentage / 100) + grossSalary - tax;
    }
}
