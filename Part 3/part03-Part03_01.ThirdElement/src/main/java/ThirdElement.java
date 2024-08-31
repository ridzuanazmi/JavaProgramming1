
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    /*
    Your assignment is to modify the program so that instead of the first value, the third value on the list is printed. 
    Remember that programmers start counting from zero! 
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
    }
}
