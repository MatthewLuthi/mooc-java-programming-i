
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] personalDetails = line.split(",");
                
                String name = personalDetails[0];
                int age = Integer.valueOf(personalDetails[1]);
                
                printPersonalDetails(name, age);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void printPersonalDetails(String name, int age) {
        System.out.print(name + ", age: ");
        
        if (age == 1) {
            System.out.print(age + " year");
        } else {
            System.out.print(age + " years");
        }
        
        System.out.println("");
    }
}
