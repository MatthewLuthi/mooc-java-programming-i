
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String word = scanner.nextLine();
        
        if (stringMatchesTrue(word)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
    
    public static boolean stringMatchesTrue(String word) {
        return word.equals("true");
    }
}
