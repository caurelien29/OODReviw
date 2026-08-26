package Problem4;

public class Truck extends Vehicle implements Rentable {

    public Truck(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double mileageFee = 50.00;
        return (dailyRate * days) + mileageFee;
    }

    @Override
    public String getRentalTerms() {
        return "Truck rental includes 100 miles per day. A $50 service fee is added to every rental. Additional mileage is charged at $0.50 per mile.";
    }
}