
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        In the text-based user interfaces that we've used in our programs, the user's input is always read as a string, since the user writes their input as text. 
        Reading strings from the user has become familiar by this point - we do it using the nextLine-command of the Scanner helper method.
        
        int value = Integer.valueOf(scanner.nextLine()); -> scanner read as String in user's input
        */
        // write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);

    }
}
