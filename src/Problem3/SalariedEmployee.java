package Problem3;

public class SalariedEmployee extends Employee implements Payable {
    private double annualSalary;

    // Creates a salaried employee with an annual salary
    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    // Calculates the employee's monthly pay
    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    // Returns the salaried employee's pay information
    @Override
    public String getPayDetails() {
        return name + " is a salaried employee. Monthly pay: $" + String.format("%.2f", calculatePay());
    }
}