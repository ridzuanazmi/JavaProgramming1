
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    // Method to load recipes from the given file
    public void loadRecipesFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            ArrayList<String> recipeLines = new ArrayList<>();

            // reading the text file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine(); // instantiate each line 

                // If the line is empty, it signals the end of a recipe
                if (line.isEmpty()) {
                    processRecipe(recipeLines);
                    continue; // Move to the next line
                }

                // Collect non-empty lines for the current recipe
                recipeLines.add(line);
            }

            // Add the last recipe if the file doesn't end with an empty line
            processRecipe(recipeLines);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to list all recipes
    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    // New method to find recipes by name (case-insensitive search)
    public void findRecipesByName(String searchTerm) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    // Method to list down all the recipes whose cooking times don't exceed the cooking time given by the user
    public void findRecipesByMaxCookingTime(int cookingTime) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    // Method to find recipes by ingredient
    public void findRecipesByIngredient(String ingredient) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                 System.out.println(recipe);
            }
        }
    }

    // Helper method to extract recipe 
    // Reduce duplication and improve readability
    private void processRecipe(ArrayList<String> recipeLines) {
        if (!recipeLines.isEmpty()) {
            addRecipe(recipeLines);
            recipeLines.clear();
        }
    }

    // Helper method to create a Recipe object from collected lines
    private void addRecipe(ArrayList<String> recipeLines) {
        if (recipeLines.size() < 2) {
            // Not enough information to create a recipe
            System.out.println("Error: Not enough information on recipe");
            return;
        }
        String name = recipeLines.get(0);
        int cookingTime;
        try {
            cookingTime = Integer.parseInt(recipeLines.get(1));
        } catch (NumberFormatException e) {
            // Invalid cooking time format
            System.out.println("Error cooking time is not an integer");
            return;
        }
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < recipeLines.size(); i++) {
            ingredients.add(recipeLines.get(i));
        }
        Recipe recipe = new Recipe(name, cookingTime, ingredients);
        this.recipes.add(recipe);
    }

}
