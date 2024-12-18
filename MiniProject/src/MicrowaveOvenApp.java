
import java.util.*;

public class MicrowaveOvenApp {
    static Map<String, Integer> recipes = new HashMap<>();
    static boolean isMicrowaveOn = false;
    static int cookTime = 0; // in seconds
    static String recipeInUse = "";

    // Adding some predefined recipes
    static {
        recipes.put("Popcorn", 120); // 2 minutes
        recipes.put("Pizza", 300);   // 5 minutes
        recipes.put("Coffee", 90);   // 1.5 minutes
        recipes.put("Frozen Meal", 180); // 3 minutes
    }

    // Method to check if the microwave is on
    public static boolean isMicrowaveOn() {
        return isMicrowaveOn;
    }

    // Method to start the microwave with a recipe
    public static void startMicrowave(String recipe) {
        if (recipes.containsKey(recipe)) {
            recipeInUse = recipe;
            cookTime = recipes.get(recipe);
            isMicrowaveOn = true;
            System.out.println("Starting microwave for " + recipe + " with cook time of " + cookTime / 60 + " minutes.");
        } else {
            System.out.println("Recipe not found.");
        }
    }

    // Method to stop the microwave
    public static void stopMicrowave() {
        if (isMicrowaveOn) {
            isMicrowaveOn = false;
            System.out.println("Microwave stopped. Enjoy your " + recipeInUse + "!");
        } else {
            System.out.println("Microwave is already off.");
        }
    }

    // Method to view all available recipes
    public static void viewRecipes() {
        System.out.println("Available Recipes:");
        recipes.forEach((key, value) -> System.out.println(key + " - " + value / 60 + " minutes"));
    }

    // Method to allow user to create a custom recipe
    public static void addRecipe(String recipeName, int timeInSeconds) {
        recipes.put(recipeName, timeInSeconds);
        System.out.println("Recipe " + recipeName + " added with cook time of " + timeInSeconds / 60 + " minutes.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nMICROWAVE OVEN APPLICATION");
            System.out.println("---------------------------");
            System.out.println("1. View Recipes");
            System.out.println("2. Start Microwave");
            System.out.println("3. Stop Microwave");
            System.out.println("4. Add Custom Recipe");
            System.out.println("0. Exit");
            System.out.println("Please select an option");
            option = in.nextInt();
            in.nextLine(); // to consume the newline character

            switch (option) {
                case 1:
                    viewRecipes();
                    break;
                case 2:
                    System.out.println("Please select a recipe to start:");
                    String recipe = in.nextLine();
                    startMicrowave(recipe);
                    break;
                case 3:
                    stopMicrowave();
                    break;
                case 4:
                    System.out.println("Enter the name of the custom recipe:");
                    String customRecipeName = in.nextLine();
                    System.out.println("Enter the cooking time in seconds:");
                    int customCookTime = in.nextInt();
                    addRecipe(customRecipeName, customCookTime);
                    break;
                case 0:
                    System.out.println("Thank you for using the Microwave Oven!");
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        } while (option != 0);
    }
}
