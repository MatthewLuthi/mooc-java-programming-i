
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            printCommands();
            
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    private int convertInputToCommandNumber(String command) {
        int nCommand = 0;
        try {
            nCommand = Integer.parseInt(command);
        } catch (NumberFormatException e) {
            return -1;
        }
        
        return nCommand;
    }
    
    private void processCommand(String command) {
        int nCommand = convertInputToCommandNumber(command);
        
        if (nCommand == 1) {
            add();
        } else if (nCommand == 2) {
            drawJoke();
        } else if (nCommand == 3) {
            printJokes();
        } 
    }
    
    private void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }
    
    private void drawJoke() {
        System.out.println("Drawing the jokes.");
        System.out.println(jokeManager.drawJoke());
    }
    
    private void printJokes() {
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }
    
    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }  
}
