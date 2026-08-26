package Problem3;

public class SalariedEmployee extends Employee implements Payable {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

    @Override
    public String getPayDetails() {
        return name + " is a salaried employee. Monthly pay: $" + String.format("%.2f", calculatePay());
    }
}
