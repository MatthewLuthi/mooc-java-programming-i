
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        String elementsOutput = "The collection " + name + " has " + elements.size(); 
        
        if (elements.size() == 1) {
            elementsOutput += " element:\n";
        } else {
            elementsOutput += " elements:\n";
        }
        
        
        for (int i = 0; i < elements.size(); i++) {
            if (i == elements.size() - 1) {
                elementsOutput += elements.get(i);
            } else {
                elementsOutput += (elements.get(i) + "\n");
            }
        }
        
        return elementsOutput;
    }
    
}
