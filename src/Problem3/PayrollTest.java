package Problem3;

/*
 * Employee is an abstract class because every employee has common state
 * and behavior, such as a name, an ID, and the displayInfo method.
 * Payable is an interface because it describes a capability that different
 * classes can provide without requiring them to share the same class hierarchy.
 * If Payable were an abstract class, Java's single-inheritance rule would make
 * it harder for a class to extend another class while also being payable.
 */
public class PayrollTest {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        SalariedEmployee employee1 = new SalariedEmployee("Alice", 101, 72000);

        HourlyEmployee employee2 = new HourlyEmployee("Bob", 102, 80, 25.00);

        ContractEmployee employee3 = new ContractEmployee("Charlie", 103, 5000);

        payroll.addEmployee(employee1);
        payroll.addEmployee(employee2);
        payroll.addEmployee(employee3);
        employee1.displayInfo();
        System.out.println();
        employee2.displayInfo();
        System.out.println();
        employee3.displayInfo();
        System.out.println();

        payroll.processPayroll();
    }
}