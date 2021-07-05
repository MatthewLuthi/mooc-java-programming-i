import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int nPages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, nPages, publicationYear));
        }
        
        System.out.println("What information will be printed? ");
        String printInfo = scanner.nextLine();
        
        if (printInfo.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
