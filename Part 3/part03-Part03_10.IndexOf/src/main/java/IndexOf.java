
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    /*
    Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for? ");
        int searchNum = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (searchNum == list.get(i)) {
                System.out.println(searchNum + " is at index " + i);
            }
        }

    }
}
