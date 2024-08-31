
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads two integers from the user and prints the square root of the sum of these integers. 
        The program does not need to work with negative values.
        You can calculate the square root of an integer with the command Math.sqrt like this:
        */
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(num1 + num2));
    }
}
