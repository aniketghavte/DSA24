package InventoryManagement;

import java.util.Scanner;

public class Inventory_management {

    // variables to store current stock, sold items, and purchased items
    static int currentStock = 0;
    static int soldItems = 0;
    static int purchasedItems = 0;
    static double purchasePrice = 0.0;
    static double sellingPrice = 0.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Inventory Management System");

        // input initial stock
        System.out.print("Enter initial stock: ");
        currentStock = input.nextInt();

        // input purchase price
        System.out.print("Enter purchase price: ");
        purchasePrice = input.nextDouble();

        // input selling price
        System.out.print("Enter selling price: ");
        sellingPrice = input.nextDouble();

        // input number of items sold
        System.out.print("Enter number of items sold: ");
        soldItems = input.nextInt();

        // input number of items purchased
        System.out.print("Enter number of items purchased: ");
        purchasedItems = input.nextInt();

        // call the calculateLossAndProfit() method to calculate the loss and profit
        calculateLossAndProfit();

        // call the checkBalanceStock() method to check the balance stock
        checkBalanceStock();
    }

    // method to calculate the loss and profit
    public static void calculateLossAndProfit() {
        double totalPurchasePrice = purchasePrice * (currentStock + purchasedItems);
        double totalSellingPrice = sellingPrice * (currentStock + purchasedItems - soldItems);

        double profit = totalSellingPrice - totalPurchasePrice;

        System.out.println("Total profit: $" + profit);
    }

    // method to check the balance stock
    public static void checkBalanceStock() {
        int balanceStock = currentStock + purchasedItems - soldItems;

        System.out.println("Balance stock: " + balanceStock);
    }

}

