package books;

public class Book {
    private String name;
    private int numOfPages;
    private String authorName;

    public Book(String name, int numOfPages, String authorName) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;
        if (this.getAuthorName().equals(book.getAuthorName()) && this.getNumOfPages() == book.getNumOfPages() && this.getName().equals(book.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
