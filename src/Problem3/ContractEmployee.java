package Problem3;

public class ContractEmployee extends Employee implements Payable {
    private double contractFee;

    public ContractEmployee(String name, int id, double contractFee) {
        super(name, id);
        this.contractFee = contractFee;
    }

    @Override
    public double calculatePay() {
        return contractFee;
    }

    @Override
    public String getPayDetails() {
        return name + " is a contract employee. Flat contract fee: $" + String.format("%.2f", calculatePay());
    }
}
