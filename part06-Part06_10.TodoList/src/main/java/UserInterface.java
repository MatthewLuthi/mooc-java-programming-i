
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    private void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        
        if (command.equals("remove")) {
            remove();
        }
        
        if (command.equals("list")) {
            print();
        }
    }
    
    private void print() {
        list.print();
    }
    
    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();       
        list.add(task);
    }
    
    private void remove() {
        System.out.print("Which one is removed? ");
        int taskNum = Integer.valueOf(scanner.nextLine());
        list.remove(taskNum);
    }
}
