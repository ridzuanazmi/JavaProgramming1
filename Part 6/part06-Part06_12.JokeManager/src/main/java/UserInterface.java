
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;

    // Constructor with JokeManager and Scanner parameters
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    // Start method to run the user interface
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break; // Exit the loop and stop the program
            }

            handleCommand(command);
        }
    }

    // Handle the user command
    private void handleCommand(String command) {
        switch (command) {
            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
                break;

            case "2":
                System.out.println(jokeManager.drawJoke());
                break;

            case "3":
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
                break;

            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
}
