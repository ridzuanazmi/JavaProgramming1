
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class JokeManager {
    
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    // Method to draw a random joke
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random random = new Random();
        int index = random.nextInt(this.jokes.size());
        return this.jokes.get(index);
    }

    // Method to print all jokes in the manager
    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
    
}
