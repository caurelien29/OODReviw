package Problem4;

import java.util.ArrayList;

public class RentalCompany {

    private ArrayList<Vehicle> fleet;

    // Creates an empty vehicle fleet
    public RentalCompany() {
        fleet = new ArrayList<>();
    }

    // Adds a vehicle to the company fleet
    public void addVehicleToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    // Displays information for all vehicles
    public void displayFleet() {
        for (Vehicle vehicle : fleet) {
            vehicle.displayVehicleInfo();
            System.out.println();
        }
    }

    // Displays the rental terms for all vehicles
    public void displayAllRentalTerms() {
        for (Vehicle vehicle : fleet) {
            Rentable rentableVehicle = (Rentable) vehicle;
            System.out.println(rentableVehicle.getRentalTerms());
            System.out.println();
        }
    }
}