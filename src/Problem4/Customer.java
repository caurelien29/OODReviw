package Problem4;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Vehicle> rentalHistory;

    // Creates a customer with an empty rental history
    public Customer(String name) {
        this.name = name;
        rentalHistory = new ArrayList<>();
    }

    // Adds a vehicle to the customer's rental history
    public void rentVehicle(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    // Calculates the total amount spent on rentals
    public double getTotalSpent(int days) {
        double total = 0.0;

        for (Vehicle vehicle : rentalHistory) {
            Rentable rentableVehicle = (Rentable) vehicle;
            total += rentableVehicle.calculateRentalCost(days);
        }

        return total;
    }
}