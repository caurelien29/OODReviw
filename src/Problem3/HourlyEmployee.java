package Problem3;

public class HourlyEmployee extends Employee implements Payable {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, int id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getPayDetails() {
        return name + " is an hourly employee. " + hoursWorked + " hours x $" + String.format("%.2f", hourlyRate) + " = $" + String.format("%.2f", calculatePay());
    }
}
