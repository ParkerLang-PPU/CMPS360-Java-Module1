package Assignment2;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Total value of the product inventory
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Return the product name
    public String getName() {
        return name;
    }

    // Return the product price
    public double getPrice() {
        return price;
    }

    // Return the product quantity
    public int getQuantity() {
        return quantity;
    }
}

