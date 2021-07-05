/**
 * Bird blueprint for bird objects that define the
 * - name
 * - latin name
 * - number of observations
 * @author Matt
 */
public class Bird {
    private String name, latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }
    
    public void addObservation() {
        observations++;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observations + " observations";
    }
}
