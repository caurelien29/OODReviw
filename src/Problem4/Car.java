package Problem4;

public class Car extends Vehicle implements Rentable {

    public Car(String make, String model, int year, double dailyRate) {
        super(make, model, year, dailyRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    @Override
    public String getRentalTerms() {
        return "Car rental includes 200 miles per day. Additional miles are charged at $0.25 per mile. Late returns are charged an additional daily fee.";
    }
}