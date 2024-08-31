
import java.util.Scanner;

public class NameOfTheOldest {
    /*
    Write a program that reads names and ages from the user until an empty line is entered. 
    The name and age are separed by a comma.

    After reading all user input, the program prints the name of the oldest person.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int greatestAge = 0;
        String oldestName = "";
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] text = words.split(",");
            if (Integer.valueOf(text[1]) > greatestAge) {
                greatestAge = Integer.valueOf(text[1]);
                oldestName = text[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
