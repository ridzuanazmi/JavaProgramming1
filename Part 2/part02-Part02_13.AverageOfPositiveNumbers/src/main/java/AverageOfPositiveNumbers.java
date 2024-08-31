
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that asks the user for input until the user inputs 0. 
        After this, the program prints the average of the positive numbers (numbers that are greater than zero).

        If no positive number is inputted, the program prints "Cannot calculate the average"
         */
        int count = 0;
        int sum = 0;
        int num;

        while ((num = Integer.valueOf(scanner.nextLine())) != 0) {
            if (num > 0) {
                count++;
                sum += num;
            }
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }
    }
}
