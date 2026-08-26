package Problem1;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    // Creates a menu item with its basic information
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Returns the item name
    public String getName() {
        return name;
    }

    // Changes the item name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the item price
    public double getPrice() {
        return price;
    }

    // Changes the item price
    public void setPrice(double price) {
        this.price = price;
    }

    // Returns the item category
    public String getCategory() {
        return category;
    }

    // Changes the item category
    public void setCategory(String category) {
        this.category = category;
    }

    // Displays the item's information
    public void displayItemInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
    }
}