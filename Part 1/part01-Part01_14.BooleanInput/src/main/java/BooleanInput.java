
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Boolean variables can either have the value true or false. When converting a string to a boolean, the string must be "true" if we want the boolean value to be true. 
        The case is insensitive here: both "true" and "TRue" turn into the boolean value of true. 
        All other strings turn into the boolean false.
        */
        // write your program here
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);

    }
}
