
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        // Calculate the current total weight of the items in the suitcase
        int currentWeight = this.totalWeight();

        // Add the item only if it doesn't exceed the maximum weight
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : this.items) {
            total += item.getWeight();
        }
        return total;
    }

    // Method to print all items in the suitcase
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    // Method to get the heaviest item
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null; // If there are no items, return null
        }

        Item heaviestItem = this.items.get(0); // Start with the first item as the heaviest

        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item; // Update the heaviest item
            }
        }
        return heaviestItem;
    }

    public String toString() {
        int totalWeight = this.totalWeight();

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight + " kg)";
        }
    }

}
