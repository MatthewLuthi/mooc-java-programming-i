
import java.util.Objects;

/**
 *
 * @author Matt
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }

    @Override
    public boolean equals(Object compared) {
        // If the variables share the same address they are equal
        if (this == compared) {
            return true;
        }
        
        // If the compared object is not of type book, they are not equal
        if (!(compared instanceof Item)) {
            return false;
        }
        
        // Convert compared object to object of type item.
        Item other = (Item) compared;
        
        // If the variables of both objects are equal, the objects themselves are, too
        if (this.identifier.equals(other.identifier)) {
            return true;
        }
        
        return false;
    }
    
    
}
