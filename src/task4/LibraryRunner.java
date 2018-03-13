package task4;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class LibraryRunner {
    public static void main(String[] args) {
        Book book1 = new Book("Hamlet", "Shakespeare", 1603, 600, "AAA", 300, "Soft");
        Book book2 = new Book("Romeo & Juliett", "Shakespeare", 1597, 900, "BBB", 400, "Solid");
        Book book3 = new Book("Taras Bulba", "Gogol", 1835, 800, "CCC", 500, "Soft");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All the books written by William Shakespeare: " + library.findByAuthor("Shakespeare"));
        System.out.println("All the books published by AAA publishing house: " + library.findByPublishingHouse("AAA"));
        System.out.println("All the books first published after the year 1600: " + library.findByYearOfPublishing(1600));
    }
}
