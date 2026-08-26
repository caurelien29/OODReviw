package Problem4;

public class RentalTest {

    public static void main(String[] args) {

        RentalCompany company = new RentalCompany();

        Car car = new Car("Toyota", "Camry", 2024, 55.00);
        Truck truck = new Truck("Ford", "F-150", 2023, 80.00);
        Motorcycle motorcycle = new Motorcycle("Honda", "Rebel 500", 2024, 50.00);

        company.addVehicleToFleet(car);
        company.addVehicleToFleet(truck);
        company.addVehicleToFleet(motorcycle);

        System.out.println("VEHICLE FLEET");
        company.displayFleet();

        System.out.println("RENTAL TERMS");
        company.displayAllRentalTerms();

        Customer customer = new Customer("Cooper Aurelien");

        customer.rentVehicle(car);
        customer.rentVehicle(truck);
        customer.rentVehicle(motorcycle);

        int rentalDays = 5;

        double totalSpent = customer.getTotalSpent(rentalDays);

        System.out.println("CUSTOMER RENTAL");
        System.out.println("Customer: Cooper Aurelien");
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Spent: $%.2f%n", totalSpent);
    }
}
