
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        /*
        Part 1: Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. 
        When the user writes -1, the program prints "Thx! Bye!" and ends.
        Part 2: Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
        Part 3: Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
        Part 4: Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
        Part 5: Extend the program so that it prints the number of even and odd numbers (excluding the -1).
        */
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            count++;
            sum += num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
