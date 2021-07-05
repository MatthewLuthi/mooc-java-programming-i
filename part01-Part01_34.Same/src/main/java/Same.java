
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String text1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String text2 = scan.nextLine();
        
        if (text1.equals(text2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
