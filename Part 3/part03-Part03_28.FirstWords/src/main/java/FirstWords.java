
import java.util.Scanner;

public class FirstWords {
    /*
    Write a program that reads user input until an empty line is entered. 
    For each non-empty line the program splits the string by spaces   and prints the first part of the string.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] text = words.split(" ");
            System.out.println(text[0]);
        }

    }
}
