
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
        */
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= lastNum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);

    }
}
