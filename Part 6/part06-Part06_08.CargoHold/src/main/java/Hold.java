
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
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        // Calculate the current total weight of the suitcases in the hold
        int currentWeight = this.totalWeight();

        // Check if adding the new suitcase would exceed the maximum weight
        if (currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : this.suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    
    public void printItems() {
        // Iterate through all suitcases in the hold
        for (Suitcase suitcase : this.suitcases) {
            // Print all items in each suitcase
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeight = this.totalWeight();
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
}
