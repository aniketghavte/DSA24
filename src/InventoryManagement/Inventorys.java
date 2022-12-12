//package InventoryManagement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Inventorys {
//    private List<Product> products;
//
//    public Inventorys() {
//        this.products = new ArrayList<Product>();
//    }
//
//    public List<Product> getProducts() {
//        return this.products;
//    }
//
//    public void addProduct(Product product) {
//        this.products.add(product);
//    }
//
//    public Product getProduct(String name) {
//        for (Product product : this.products) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public void purchase(String name, int quantity) {
//        Product product = this.getProduct(name);
//        if (product != null) {
//            product.setQuantity(product.getQuantity() + quantity);
//        }
//    }
//
//    public void ship(String name, int quantity) {
//        Product product = this.getProduct(name);
//        if (product != null) {
//            product.setQuantity(product.getQuantity() - quantity);
//        }
//    }
//
//    public void displayInventory() {
//        for (Product product : this.products) {
//            System.out.println(product.getName() + ": " + product.getQuantity());
//        }
//    }
//
//    public void displayProduct(String name) {
//        Product product = this.getProduct(name);
//        if (product != null) {
//            System.out.println("Name: " + product.getName());
//            System.out.println("Quantity: " + product.getQuantity());
//            System.out.println("Price: " + product.getPrice());
//        }
//    }
//
//}
