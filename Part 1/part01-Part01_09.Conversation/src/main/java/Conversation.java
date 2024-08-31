
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
        Write a program that works as follows:

        Sample output
        Greetings! How are you doing?
        Scanner: Good thank you!
        Oh, how interesting. Tell me more!
        Scanner: Well, there's really nothing to tell.
        Thanks for sharing!
        */
        System.out.println("Greetings! How are you doing?");
        String feeling = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String description = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
