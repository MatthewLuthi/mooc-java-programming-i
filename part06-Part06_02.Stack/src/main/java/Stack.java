
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Matt
 */
public class Stack {

    private ArrayList<String> strings;
    
    public Stack() {
        strings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return strings.isEmpty();
    }
    
    public void add(String value){ 
        strings.add(value);
    }
    
    public ArrayList<String> values() {
        return strings;
    }
    
    public String take() {
        String topMostValue = strings.get(strings.size() - 1);
        strings.remove(topMostValue);
        return topMostValue;
    }
}
