package books;

public class Book {
    private String name;
    private int numOfPages;
    private Author author;

    public Book(String name, int numOfPages, Author author) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    Author getAuthor() {
        return this.author;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;
        if (this.author.getName().equals(book.author.getName()) && this.getNumOfPages() == book.getNumOfPages() && this.getName().equals(book.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
