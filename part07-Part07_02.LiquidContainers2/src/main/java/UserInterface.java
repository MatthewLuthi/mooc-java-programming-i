
import java.util.Scanner;

/**
 *UserInterface contains the functionality needed to make the main program execute the wanted logic correctly.
 * @author Matt
 */
public class UserInterface {
    private Scanner scanner;
    private Container first, second; // Container objects that will be used to manipulate the amount of liquid being held.
    
    /**
     * Upon new declaration of a user interface, initialize the scanner and both containers.
     * @param scanner used to read the user input
     */
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        first = new Container();
        second = new Container();
    }
    
    /**
     * The start method will be utilized in the main program to execute the program flow.
     * It has the condition to stop if the user enters the string "quit".
     */
    public void start() {
        while (true) {
            printContainers();
            
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            process(input);
        }
    }
    
    /**
     * Depending on user input which is split into (user command and liquid amount),
     * the method will call the correct methods needed
     * to alter the liquid held within the containers.
     * @param input the user string to be processed
     */
    private void process(String input) {
        String[] parts = input.split(" ");
        
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);
        
        if (command.equals("add")) {
            add(amount);
        }
        
        if (command.equals("move")) {
            move(amount);
        }
        
        if (command.equals("remove")) {
            remove(amount);
        }
    }
    
    /**
     * Add the user amount to the first container
     * @param amount is the integer the user entered
     */
    private void add(int amount) {
        first.add(amount);
    }
    
    /**
     * Move the amount from the first container to the second container
     * @param amount is the integer the user entered
     */
    private void move(int amount) {
        first.move(amount, second);
    }
    
    /**
     * Remove the user amount from the second container
     * @param amount entered by the user
     */
    private void remove(int amount) {
        second.remove(amount);
    }
    
    private void printContainers() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
    
    
    
    
}
