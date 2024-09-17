
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager manager = new RecipeManager();

        System.out.println("File to read:");
        String fileName = scanner.nextLine();

        manager.loadRecipesFromFile(fileName);

        printCommands();

        OUTER:
        while (true) {
            System.out.println();
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    manager.listRecipes();
                    break;
                case "stop":
                    break OUTER;
                case "find name":
                    System.out.println("Searched word:");
                    String searchTerm = scanner.nextLine();
                    manager.findRecipesByName(searchTerm);
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time:");
                    int maxCookingTime = Integer.valueOf(scanner.nextLine());
                    manager.findRecipesByMaxCookingTime(maxCookingTime);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();
                    manager.findRecipesByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

    private static void printCommands() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
