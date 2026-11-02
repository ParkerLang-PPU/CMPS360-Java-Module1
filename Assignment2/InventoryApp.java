package Assignment2;


import javax.swing.JOptionPane;

public class InventoryApp {
    public static void main(String[] args) {
        
        // Create two product objects
        Product product1 = new Product("Keyboard", 49.99, 8);
        Product product2 = new Product("Monitor", 179.99, 4);

        double value1 = product1.calculateInventoryValue();
        double value2 = product2.calculateInventoryValue();

        double total = value1 + value2;

        // Display product information in the console
        System.out.println("Product: " + product1.getName());
        System.out.println("Inventory Value: $" + value1);

        System.out.println("Product: " + product2.getName());
        System.out.println("Inventory Value: $" + value2);

        System.out.println("Total Inventory Value: $" + total);

        // Display inventory summary in a graphical message
        JOptionPane.showMessageDialog(
            null,
            "Product: " + product1.getName() +
            "\nInventory Value: $" + String.format("%.2f", value1) +
            "\n\nProduct: " + product2.getName() +
            "\nInventory Value: $" + String.format("%.2f", value2) +
            "\n\nTotal Inventory Value: $" +
            String.format("%.2f", total)
        );
    }
}

