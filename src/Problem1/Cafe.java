package Problem1;

import java.util.ArrayList;

public class Cafe {
    private ArrayList<MenuItem> menuItems;

    // Initializes the cafe menu
    public Cafe() {
        menuItems = new ArrayList<>();
    }

    // Adds an item to the menu
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // Calculates the total for an order
    public double placeOrder(Order order) {
        return order.calculateTotal();
    }

    // Displays all items on the menu
    public void displayMenu() {
        System.out.println("Cafe Menu:");
        for (MenuItem item : menuItems) {
            item.displayItemInfo();
            System.out.println("--------------------");
        }
    }
}