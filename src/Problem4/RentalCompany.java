package Problem4;

import java.util.ArrayList;

public class RentalCompany {

    private ArrayList<Vehicle> fleet;

    public RentalCompany() {
        fleet = new ArrayList<>();
    }

    public void addVehicleToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void displayFleet() {
        for (Vehicle vehicle : fleet) {
            vehicle.displayVehicleInfo();
            System.out.println();
        }
    }

    public void displayAllRentalTerms() {
        for (Vehicle vehicle : fleet) {
            Rentable rentableVehicle = (Rentable) vehicle;
            System.out.println(rentableVehicle.getRentalTerms());
            System.out.println();
        }
    }
}
