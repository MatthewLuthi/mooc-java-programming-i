
import java.util.ArrayList;

/**
 * Blueprint for recipe object instantiation.
 * Describes recipe name, cooking time and list of ingredients.
 * @author Matt
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this(name, cookingTime, new ArrayList<>());
    }
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public boolean cookingTimeAtMost(int max) {
        return cookingTime <= max;
    }

    public boolean nameContains(String search) {
        return name.contains(search);
    }
    
    public boolean containsIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }
    
    public void add(String ingredient) {
        ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime; 
    }
}
