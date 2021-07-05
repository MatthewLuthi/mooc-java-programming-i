
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int newTotalWeight = item.getWeight() + totalWeight();
        if (newTotalWeight > maxWeight) {
            return;
        }
        items.add(item);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public void printItems() {
        for (Item item : items){ 
            System.out.println(item);
        }
    }
    
    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items " + "(" + totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item " + "(" + totalWeight() + "kg)";
        }
        
        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }
}
