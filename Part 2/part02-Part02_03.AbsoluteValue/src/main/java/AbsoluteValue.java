
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads an integer from the user. If the number is less than 0, the program prints the given integer multiplied by -1. In all other cases, the program prints the number itself. A few examples of how the program's expected to function are shown below:

        Sample output
        Scanner: -3
        3
        Scanner: 2
        2
        */
        int num = Integer.valueOf(scanner.nextLine());
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
    }
}
