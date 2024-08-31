
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        /*
        Write a program that asks the user to write a string. 
        When the user has provided a string (i.e., written some text and pressed the enter key), 
        the program should print the string that was provided by the user.
        */
        String message = scanner.nextLine();
        System.out.println(message);

    }
}
