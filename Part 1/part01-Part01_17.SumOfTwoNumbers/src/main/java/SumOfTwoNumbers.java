
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.

        When you ask for multiple numbers, create a separate variable for each:
        */
        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (num1 + num2));
    }
}
