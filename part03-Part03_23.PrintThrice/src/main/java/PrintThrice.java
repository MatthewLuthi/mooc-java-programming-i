
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();  
        printThreeTimes(word);
    }
    
    public static void printThreeTimes(String word) {
        System.out.println(word + word + word);
    }
}
