
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        /*
        Write a program that asks the user to write a string. 
        When the user has given a string (that is, written some text and pressed enter), 
        the program must print the user's string three times (you can use the System.out.println command multiple times).
        */
        String message = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }

    }
}
