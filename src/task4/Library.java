package task4;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public Library findByAuthor(String author){
        Library results = new Library();
        for(Book book : library) {
            if(book.getAuthor().equalsIgnoreCase(author)) {
                results.addBook(book);
            }
        }
        return results;
    }

    public Library findByPublishingHouse(String publishingHouse){
        Library results = new Library();
        for(Book book : library) {
            if(book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                results.addBook(book);
            }
        }
        return results;
    }

    public Library findByYearOfPublishing(int yearOfPublishing){
        Library results = new Library();
        for(Book book : library) {
            if(book.getYearOfPublishing() > yearOfPublishing) {
                results.addBook(book);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
