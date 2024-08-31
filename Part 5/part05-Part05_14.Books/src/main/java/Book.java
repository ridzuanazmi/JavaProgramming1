
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
    
    public boolean equals(Object compared) {

        // Check if the obj is the same instance as this
        if (this == compared) {
            return true;
        }

        // Check if the obj is an instance of Song
        if (compared == null || getClass() != compared.getClass()) {
            return false;
        }

        // Cast the object to Song
        Book book = (Book) compared;

        return (this.name.equals(book.name) && this.publicationYear == book.publicationYear);
    }

}
