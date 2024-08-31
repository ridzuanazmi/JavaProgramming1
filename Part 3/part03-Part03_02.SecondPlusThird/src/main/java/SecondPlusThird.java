
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    /*
    Modify the program so that instead of the first value, the program prints the sum of the second and third numbers
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }

        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
