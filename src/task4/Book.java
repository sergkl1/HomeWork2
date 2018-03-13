package task4;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class Book {
    private final String name;
    private final String author;
    private final int yearOfPublishing;
    private final int numberOfPages;
    private final String publishingHouse;
    private final long price;
    private final String bindingType;

    public Book(String name, String author, int yearOfPublishing, int numberOfPages, String publishingHouse, long price, String bindingType) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublishingHouse() {

        return publishingHouse;
    }

    public String getAuthor() {

        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
