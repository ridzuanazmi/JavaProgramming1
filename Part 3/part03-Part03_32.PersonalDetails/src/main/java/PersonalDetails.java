
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    /*
    Write a program that reads names and birth years from the user until an empty line is entered. 
    The name and birth year are separated by a comma.

    After that the program prints the longest name and the average of the birth years. 
    If multiple names are equally longest, you can print any of them.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearSum = 0;
        int count = 0;
        int mostLetterCount = 0;
        String longestName = "";
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] text = words.split(","); // Splits the name and birth year
            String name = text[0];
            String[] nameLetter = text[0].split(""); // splits the name into individual letter
            // Count the letter in the name
            if (nameLetter.length > mostLetterCount) {
                mostLetterCount = nameLetter.length;
                longestName = name;
            }
            yearSum += Integer.valueOf(text[1]);
            count++;
            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * yearSum / count);

    }
}
