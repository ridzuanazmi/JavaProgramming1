
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads two integers from the user. 
        If the first number is greater than the second, the program prints "(first) is greater than (second)." 
        If the first number is less than the second, the program prints "(first) is smaller than (second)." 
        Otherwise, the program prints "(first) is equal to (second)." 
        The (first) and (second) should always be replaced with the actual numbers that were provided by the user.
        */
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println(num1 + "  is equal to " + num2 + ".");
        } else {
            System.out.println(num1 + " is smaller than " + num2 + ".");
        }
    }
}
