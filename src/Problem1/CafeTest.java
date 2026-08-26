package Problem1;

public class CafeTest {
    public static void main(String[] args) {

        // Creates the cafe and menu items
        Cafe cafe = new Cafe();

        MenuItem coffee = new MenuItem("Coffee", 3.50, "Beverage");
        MenuItem sandwich = new MenuItem("Sandwich", 8.99, "Food");
        MenuItem cake = new MenuItem("Cake", 5.25, "Dessert");

        // Adds the items to the cafe menu
        cafe.addMenuItem(coffee);
        cafe.addMenuItem(sandwich);
        cafe.addMenuItem(cake);

        cafe.displayMenu();

        System.out.println();

        // Creates the customer's order
        Order order = new Order();

        order.addItem(coffee);
        order.addItem(sandwich);
        order.addItem(cake);

        // Gets the total price of the order
        double total = cafe.placeOrder(order);

        order.displayOrderDetails();

        System.out.println();
        System.out.println("Final Total: $" + String.format("%.2f", total));
    }
}