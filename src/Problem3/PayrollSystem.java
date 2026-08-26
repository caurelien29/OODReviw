package Problem3;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Payable> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Payable employee) {
        employees.add(employee);
    }

    public void processPayroll() {
        System.out.println("Payroll Details ");

        for (Payable employee : employees) {
            System.out.println(employee.getPayDetails());
        }

        System.out.printf("Total Payroll Cost: $%.2f%n", totalPayrollCost());
    }

    public double totalPayrollCost() {
        double total = 0;

        for (Payable employee : employees) {
            total += employee.calculatePay();
        }

        return total;
    }
}
