
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        The Double.valueOf command converts a string to a double. It takes the string containing the value to be converted as a parameter.
        String valueAsString = "42.42";
        double value = Double.valueOf(valueAsString);
        */
        // write your program here
        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);

    }
}
