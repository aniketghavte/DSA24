package InventoryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {

        return this.products;
    }
    public void showProductsDetails(){
        System.out.println("Product Name   "+"   ID"+"   Quantity"+"   price"+"   cost");
        for (int i=0 ; i<products.size();i++){

            System.out.println(products.get(i).getName()+"   "+products.get(i).getId()+"   "+products.get(i).getQuantity()+"   "+products.get(i).getPrice()+"   "+products.get(i).getCost());
        }
    }

    public Product getProduct(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public void purchaseProduct(String productId, int quantity) {
        Product product = getProduct(productId);
        if (product != null) {
            product.purchase(quantity);
        }
    }

    public void shipProduct(String productId, int quantity) {
        Product product = getProduct(productId);
        if (product != null) {
            product.ship(quantity);
        }
    }

    public void calculateProfit() {
        int totalProfit = 0;
        for (Product product : products) {
            totalProfit += product.calculateProfit();
        }
        System.out.println("Total profit: " + totalProfit);
    }
}
 class Product {

    private String id;
    private String name;
    private int quantity;
    private int price;
    private int cost;

    public Product(String id, String name, int quantity, int price, int cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.cost = cost;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCost() {
        return this.cost;
    }

    public void purchase(int quantity) {
        this.quantity -= quantity;
        System.out.println("You Purchase the product:"+ name);
    }

    public void ship(int quantity) {
        this.quantity -= quantity;
        System.out.println("Product "+ name + "Shipped" );
    }

    public int calculateProfit() {
        return (this.price - this.cost) * this.quantity;
    }

}


public class newinventory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create a new inventory object
        Inventory inventory = new Inventory();
        Product p1 = new Product("laptop", "lenovo-slim", 5,50000,45000);
        Product p2 = new Product("SSD", "Samsung-980", 7,7000,4500);
        Product p3 = new Product("Keyboard", "HP-69", 2,1200,1000);
        Product p4 = new Product("Monitor", "Apple-M2", 6,70000,45000);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);
        System.out.println(inventory.getProduct("laptop"));
        inventory.showProductsDetails();


                    System.out.print("Enter product ID: ");
                    String id = in.next();
                    Product product = inventory.getProduct(id);
                    if (product == null) {
                        System.out.println("Invalid product ID!");
                    } else {
                        System.out.print("Enter quantity: ");
                        int quantity = in.nextInt();
                        inventory.purchaseProduct(id, quantity);
                    }

        inventory.showProductsDetails();


//         *********Shipping
                    System.out.print("Enter product ID: ");
                    String id2 = in.next();
                    product = inventory.getProduct(id2);
                    if (product == null) {
                        System.out.println("Invalid product ID!");
                    } else {
                        System.out.print("Enter quantity: ");
                        int quantity = in.nextInt();
                        inventory.shipProduct(id2, quantity);
                    }





//        while (true) {
//            // Print the main menu
//            System.out.println("Inventory Management System");
//            System.out.println("1. List of all products");
//            System.out.println("2. Display individual product information");
//            System.out.println("3. Purchase");
//            System.out.println("4. Shipping");
//            System.out.println("5. Balance stock");
//            System.out.println("6. Loss and Profit calculation");
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//
//            // Read the user's choice
//            int choice = in.nextInt();
//
//            // Perform the selected operation
//            switch (choice) {
//                case 1:
//                    // List all products
//                    inventory.listProducts();
//                    break;
//                case 2:
//                    // Display individual product information
//                    System.out.print("Enter product ID: ");
//                    String id = in.next();
//                    Product product = inventory.getProduct(id);
//                    if (product == null) {
//                        System.out.println("Invalid product ID!");
//                    } else {
//                        product.displayInformation();
//                    }
//                    break;
//                case 3:
//                    // Purchase
//                    System.out.print("Enter product ID: ");
//                    id = in.next();
//                    product = inventory.getProduct(id);
//                    if (product == null) {
//                        System.out.println("Invalid product ID!");
//                    } else {
//                        System.out.print("Enter quantity: ");
//                        int quantity = in.nextInt();
//                        inventory.purchase(product, quantity);
//                    }
//                    break;
//                case 4:
//                    // Shipping
//                    System.out.print("Enter product ID: ");
//                    id = in.next();
//                    product = inventory.getProduct(id);
//                    if (product == null) {
//                        System.out.println("Invalid product ID!");
//                    } else {
//                        System.out.print("Enter quantity: ");
//                        int quantity = in.nextInt();
//                        inventory.ship(product, quantity);
//                    }
//                    break;
//                case 5:
//                    // Balance stock
//                    inventory.displayStockInformation();
//                    break;
//                case 6:
//                    // Loss and Profit calculation
//                    inventory.calculateLossAndProfit
    }
}