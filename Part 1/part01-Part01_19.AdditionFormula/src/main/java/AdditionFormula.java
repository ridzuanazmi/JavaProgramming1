
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Create a program that can be used to add two integers together. 
        In the beginning, the user is asked to give two integers that are to be summed. 
        The program then prints the formula that describes the addition of the numbers.
        */
        // write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
