/**
 *
 * @author Matt
 */
public class Book {
    private String title;
    private int nPages;
    private int publicationYear;

    public Book(String title, int nPages, int publicationYear) {
        this.title = title;
        this.nPages = nPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getnPages() {
        return nPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + nPages + " pages, " + publicationYear;
    }
    
    
}
