package Problem1;

import java.util.ArrayList;

public class Cafe {
    private ArrayList<MenuItem> menuItems;

    public Cafe() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public double placeOrder(Order order) {
        return order.calculateTotal();
    }

    public void displayMenu() {
        System.out.println("Cafe Menu:");
        for (MenuItem item : menuItems) {
            item.displayItemInfo();
            System.out.println("--------------------");
        }
    }
}
