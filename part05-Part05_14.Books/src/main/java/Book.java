
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        // If the variables share the same address they are equal
        if (this == compared) {
            return true;
        }
        
        // If the compared object is not of type Book, they are not equal
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Convert the object to a Book object
        final Book other = (Book) compared;
        
        // If the variables of both objects are equal, the objects themselves are, too
        if (this.name.equals(other.name) &&
                this.publicationYear == other.publicationYear) {
            return true;
        }
        
        return false;
    }
}
