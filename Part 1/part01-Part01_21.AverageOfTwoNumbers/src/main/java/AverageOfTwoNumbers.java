
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Division of integers is a slightly trickier operation. 
        The types of the variables that are part of the division determine the type of result achieved by executing the command.
        If the dividend or divisor (or both!) of the division is a floating point number, the result is a floating point number as well.
        Sample:
        int first = 3;
        int second = 2;
        double result = first / second; // prints 1
        Sample:
        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5
        */
        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        double average = (double) (num1 + num2) / 2;
        System.out.println("The average is " + average);

    }
}
