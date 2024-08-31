
import java.util.Scanner;

public class AgeOfTheOldest {

    /*
    Write a program that reads names and ages from the user until an empty line is entered. 
    The name and age are separated by a comma.

    After reading all user input, the program prints the age of the oldest person.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestAge = 0;
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] text = words.split(",");
            if (Integer.valueOf(text[1]) > greatestAge) {
                greatestAge = Integer.valueOf(text[1]);
            }
        }
        System.out.println("Age of the oldest: " + greatestAge);

    }
}
