package Problem4;

public class Motorcycle extends Vehicle implements Rentable {

    public Motorcycle(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double insuranceFee = 25.00;
        return (dailyRate * days) + insuranceFee;
    }

    @Override
    public String getRentalTerms() {
        return "Motorcycle rental requires a valid motorcycle license and includes mandatory insurance. Helmets are required for all riders.";
    }
}