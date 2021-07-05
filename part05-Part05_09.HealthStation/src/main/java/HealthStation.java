
public class HealthStation {

    private int weighings;
    
    public HealthStation() {
        weighings = 0;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    public int weighings() {
        return weighings;
    }

}
