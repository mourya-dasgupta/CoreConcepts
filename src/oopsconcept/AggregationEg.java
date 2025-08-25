package oopsconcept;

/**
 * Aggregation represents a "has-a" relationship between Objects.
 * One Object contains another Object as part of its Structure, but the contained object/s can exist independently.
 */
public class AggregationEg {
    public static void main(String[] args) {
        Book book1 = new Book("The Happiness Advantage", 236, "Shawn Achor");
        Book book2 = new Book("Art Of Possibility", 478, "Benjamin Zander");
        Book book3 = new Book("The Alchemist", 137, "Paulo Coelho");
        Book[] inspirationalBooks = {book1, book2, book3};

        Library library = new Library("Calcutta Library", 1846, inspirationalBooks);
        library.displayInfo();
    }
}

class Library {
    String name;
    int yearPublished;
    Book[] books;
    Library(String name, int yearPublished, Book[] books) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.books = books;
    }
    void displayInfo() {
        System.out.println("The " + name + " was published in " + yearPublished);
        System.out.println("Books Available : ");
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }
}

class Book {
    String title;
    int pages;
    String aurthor;

    public Book(String title, int pages, String aurthor) {
        this.title = title;
        this.pages = pages;
        this.aurthor = aurthor;
    }
    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", aurthor='" + aurthor + '\'' +
                '}';
    }
}