
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Item> items = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            if (!items.contains(new Item(identifier, name))) {
              items.add(new Item(identifier, name));  
            }
        }
        
        printItemList(items);
    }
    
    private static void printItemList(List<Item> items) {
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    private static boolean duplicateIdentifier(String identifier, List<Item> items) {
        return items.contains(new Item(identifier, ""));
    }
}
