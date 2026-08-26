package Problem4;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected double dailyRate;

    public Vehicle(String make, String model, int year, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }

    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.printf("Daily Rate: $%.2f%n", dailyRate);
    }
}
