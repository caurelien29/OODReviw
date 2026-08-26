package Problem4;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Vehicle> rentalHistory;

    public Customer(String name) {
        this.name = name;
        rentalHistory = new ArrayList<>();
    }

    public void rentVehicle(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public double getTotalSpent(int days) {
        double total = 0.0;

        for (Vehicle vehicle : rentalHistory) {
            Rentable rentableVehicle = (Rentable) vehicle;
            total += rentableVehicle.calculateRentalCost(days);
        }

        return total;
    }
}
