
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        OUTER:
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim().toLowerCase();  // Using lowercase to normalize commands

            switch (command) {
                case "add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    database.addBird(name, latinName);
                    break;

                case "observation":
                    System.out.print("Bird? ");
                    String birdName = scanner.nextLine();
                    if (!database.addObservation(birdName)) {
                        System.out.println("Not a bird!");
                    }
                    break;

                case "all":
                    database.printAllBirds();
                    break;

                case "one":
                    System.out.print("Bird? ");
                    String oneBird = scanner.nextLine();
                    if (!database.printOneBird(oneBird)) {
                        System.out.println("Not a bird!");
                    }
                    break;

                case "quit":
                    break OUTER;  // Exit the while loop and terminate the program

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
