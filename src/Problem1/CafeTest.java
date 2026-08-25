package Problem1;

public class CafeTest {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();

        MenuItem coffee = new MenuItem("Coffee", 3.50, "Beverage");
        MenuItem sandwich = new MenuItem("Sandwich", 8.99, "Food");
        MenuItem cake = new MenuItem("Cake", 5.25, "Dessert");

        cafe.addMenuItem(coffee);
        cafe.addMenuItem(sandwich);
        cafe.addMenuItem(cake);

        cafe.displayMenu();

        System.out.println();

        Order order = new Order();

        order.addItem(coffee);
        order.addItem(sandwich);
        order.addItem(cake);

        double total = cafe.placeOrder(order);

        order.displayOrderDetails();

        System.out.println();
        System.out.println("Final Total: $" + String.format("%.2f", total));
    }
}