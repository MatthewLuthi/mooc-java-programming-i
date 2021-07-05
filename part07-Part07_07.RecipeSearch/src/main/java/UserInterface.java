
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * User interface that is used in main.
 * @author Matt
 */
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface() {
        scanner = new Scanner(System.in);
        recipes = new ArrayList<>();
    }

    /**
     * Start method defines the logic needed to 
     * read the file provided by user and then perform user tasks.
     */
    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        read(file);
        printCommands();

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                list();
            }

            if (command.equals("find name")) {
                search();
            }

            if (command.equals("find cooking time")) {
                searchMaxCookingTimes();
            }

            if (command.equals("find ingredient")) {
                searchByIngredient();
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }

    private void printCommands() {
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
    }

    /**
     * read method tries to read the recipe file line by line
     * and saves the line properties into a new recipe object.
     * If the user enters an unknown file then recursively call the read method
     * again until a file matches one of the local recipe files stored in the project.
     * @param file is the file that needs to be stored for recipe generation. 
     */
    private void read(String file) {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));

            // txt file is set up by recipes in the following order
            // name -> cooking time -> list of ingredients -> newline
            while (fileReader.hasNextLine()) {
                // Read one line
                //String row = scanner.nextLine();
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(name, cookingTime); 

                // Create another while loop within the current loop
                // to determine the list of ingredients defined in the txt file.
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    
                    // If the current line is empty (newline consumed) then exit the loop
                    // to go back to the outermost while loop. Outer while loop determines if
                    // another recipe name is present.
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    // Generate ingredient list
                    recipe.add(ingredient);
                }

                recipes.add(recipe);
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            System.out.print("File to read: ");
            String newFileAttempt = scanner.nextLine();
            if (scanner.hasNextLine()) {
                read(newFileAttempt);
            }
        }
    }

    private void list() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    /**
     * User provides a search term and it is matched against each recipe 
     * in the recipe list.
     */
    private void search() {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.nameContains(search)) {
                System.out.println(recipe);

            }
        }
    }

    /**
     * Let the user enter an ingredient search term and check if 
     * it is contained in the recipe list.
     */
    private void searchByIngredient() {
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.containsIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    /**
     * Let the user enter a max cooking time to filter
     * out recipes exceeding the max cooking time.
     */
    private void searchMaxCookingTimes() {
        System.out.print("Max cooking time: ");
        int max = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.cookingTimeAtMost(max)) {
                System.out.println(recipe);
            }
        }
    }
}
