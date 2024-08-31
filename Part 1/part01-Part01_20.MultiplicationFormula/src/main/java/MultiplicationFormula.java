
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Similar to the previous exercise, create a program that multiplies the values stored in two integer variables.
        For instance, if the entered numbers are 2 and 8, the program should print the following:
        
        Sample output
        Give the first number:
        Scanner: 2
        Give the second number:
        Scanner: 8
        2 * 8 = 16
        */
        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }
}
