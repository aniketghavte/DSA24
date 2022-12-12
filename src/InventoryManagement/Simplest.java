package InventoryManagement;
import java.util.ArrayList;

class InventoryManager {
    // create an ArrayList to store the inventory items
    private ArrayList<String> inventory = new ArrayList<>();

    // method to add a new item to the inventory
    public void addItem(String item) {
        inventory.add(item);
    }

    // method to remove an item from the inventory
    public void removeItem(String item) {
        inventory.remove(item);
    }

    // method to print the current inventory
    public void printInventory() {
        System.out.println("Current inventory: ");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}


public class Simplest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

// add some items to the inventory
        manager.addItem("apple");
        manager.addItem("orange");
        manager.addItem("banana");

// print the current inventory
        manager.printInventory();

// remove an item from the inventory
        manager.removeItem("orange");

// print the updated inventory
        manager.printInventory();

    }
}
