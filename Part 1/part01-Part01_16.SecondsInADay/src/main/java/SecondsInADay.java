
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        In the exercise template, implement a program that asks the user for the number of days. 
        After that, the program prints the number of seconds in the given number of days.
        */
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int daysToSeconds = days * 24 * 60 * 60;
        System.out.println(daysToSeconds);

    }
}
