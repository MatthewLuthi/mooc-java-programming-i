
import java.util.Scanner;

/**
 * Database for bird-watchers containing birds (name, latin name, and number
 * of observations).
 * @author Matt
 */
public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scan, new BirdDatabase());
        userInterface.start();
    }

}
