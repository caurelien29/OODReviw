package Problem3;

public abstract class Employee {
    protected String name;
    protected int id;

    // Creates an employee with a name and ID
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Displays the employee's basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}