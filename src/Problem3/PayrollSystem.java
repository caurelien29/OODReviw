package Problem3;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Payable> employees;

    // Creates an empty payroll system
    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    // Adds an employee to the payroll
    public void addEmployee(Payable employee) {
        employees.add(employee);
    }

    // Displays payroll details and the total cost
    public void processPayroll() {
        System.out.println("Payroll Details ");

        for (Payable employee : employees) {
            System.out.println(employee.getPayDetails());
        }

        System.out.printf("Total Payroll Cost: $%.2f%n", totalPayrollCost());
    }

    // Calculates the total payroll cost
    public double totalPayrollCost() {
        double total = 0;

        for (Payable employee : employees) {
            total += employee.calculatePay();
        }

        return total;
    }
}