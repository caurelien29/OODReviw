package Problem3;

public class ContractEmployee extends Employee implements Payable {
    private double contractFee;

    // Creates a contract employee with a fixed fee
    public ContractEmployee(String name, int id, double contractFee) {
        super(name, id);
        this.contractFee = contractFee;
    }

    // Returns the contract fee as the employee's pay
    @Override
    public double calculatePay() {
        return contractFee;
    }

    // Returns the contract employee's pay information
    @Override
    public String getPayDetails() {
        return name + " is a contract employee. Flat contract fee: $" + String.format("%.2f", calculatePay());
    }
}