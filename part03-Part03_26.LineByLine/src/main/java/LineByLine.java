
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            
            String[] words = line.split(" ");

            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}
