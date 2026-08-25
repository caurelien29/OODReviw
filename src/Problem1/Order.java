package Problem1;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");

        for (MenuItem item : items) {
            item.displayItemInfo();
            System.out.println();
        }

        System.out.println("Total Amount Due: $"+ String.format("%.2f", calculateTotal()));
    }
}