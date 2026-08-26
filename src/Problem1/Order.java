package Problem1;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    // Creates an empty order
    public Order() {
        items = new ArrayList<>();
    }

    // Adds a menu item to the order
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Calculates the total cost of the order
    public double calculateTotal() {
        double total = 0.0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    // Displays the items and total for the order
    public void displayOrderDetails() {
        System.out.println("Order Details:");

        for (MenuItem item : items) {
            item.displayItemInfo();
            System.out.println();
        }

        System.out.println("Total Amount Due: $"+ String.format("%.2f", calculateTotal()));
    }
}