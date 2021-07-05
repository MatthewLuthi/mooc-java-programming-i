
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class UserInterface {

    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() {

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                add();
            }

            if (command.equals("Observation")) {
                addObservation();
            }

            if (command.equals("All")) {
                printAllBirds();
            }

            if (command.equals("One")) {
                printOneBird();
            }

            if (command.equals("Quit")) {
                break;
            }
        }
    }

    private void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        database.add(name, latinName);
    }

    private void addObservation() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();

        if (!database.addObservation(birdName)) {
            System.out.println("Not a bird!");
        }
    }

    private void printAllBirds() {
        System.out.println(database.getAllBirds());
    }

    private void printOneBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        System.out.println(database.getOneBird(birdName));
    }
}
