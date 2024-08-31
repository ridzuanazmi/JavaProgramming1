
import java.util.Scanner;

public class AVClub {
    /*
    Write a program that reads user input until an empty line. 
    For each non-empty string, the program splits the string by spaces and then prints the pieces that contain av, each on a new line.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] text = words.split(" ");
            for (String text1 : text) {
                if (text1.contains("av")) {
                    System.out.println(text1);
                }
            }
        }

    }
}
