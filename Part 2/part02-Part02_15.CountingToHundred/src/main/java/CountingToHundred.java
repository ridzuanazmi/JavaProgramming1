
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program, which reads an integer from the user. 
        Then the program prints numbers from that number to 100. 
        You can assume that the user always gives a number less than 100. 
        Below are some examples of the expected functionality.
         */
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
