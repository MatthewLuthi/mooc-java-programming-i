
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class UserInterface {
    private Scanner scanner;
    private GradeHandler gradeHandler;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        gradeHandler = new GradeHandler();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
         
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            if (point >= 0 && point <= 100) {
                gradeHandler.add(new Grade(point));
            }
        }
        
        gradeHandler.print();
    }
}
