
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        
        Timer timer = new Timer();
        
        for (int i = 0; i < 2; i++) {
            System.out.println(timer);
            timer.advance();
        }
        
        
//        while (true) {
//            System.out.println(timer);
//            timer.advance();
//            
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
    }
}
