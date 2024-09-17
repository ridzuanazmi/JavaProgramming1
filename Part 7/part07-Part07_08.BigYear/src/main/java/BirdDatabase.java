
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
public class BirdDatabase {
    
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    // Method to add a bird to the database
    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    // Method to add an observation for a bird
    public boolean addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.addObservation();
                return true; // Observation added successfully
            }
        }
        return false; // Bird not found
    }

    // Method to print all birds
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    // Method to print one bird
    public boolean printOneBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return true;
            }
        }
        return false; // Bird not found
    }
    
}
