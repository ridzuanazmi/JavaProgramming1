
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            System.out.print("Identifier? (empty will stop): ");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.print("Name? (empty will stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive item = new Archive(identifier, name);
            if (items.contains(item)) {

            } else {
                items.add(new Archive(identifier, name));
            }
        }

        for (Archive item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }

    }
}
