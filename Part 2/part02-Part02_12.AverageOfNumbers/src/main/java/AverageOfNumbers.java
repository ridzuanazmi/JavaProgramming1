
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that asks the user for input until the user inputs 0. 
        After this, the program prints the average of the numbers. 
        The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.

        The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers
        */
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                count++;
                sum = sum + num;
            }
        }
        System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
}
