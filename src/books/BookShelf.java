package books;

public class BookShelf {
    private Book[] books;
    private int shelfNum;

    public BookShelf(int shelfNum, int shelfCapacity) {
        books = new Book[shelfCapacity];
        this.shelfNum = shelfNum;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getShelfNum() {
        return shelfNum;
    }

    public boolean addBook(Book a) {
        if (availableCapacity() >= 1) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = a;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addAll(Book[] booksList) {
        int booksCounter = 0;
        for (Book a : booksList) {
            if (a != null) {
                booksCounter++;
            }
        }

        if (availableCapacity() >= booksCounter) {
            for (Book i : booksList) {
                if (i != null) {
                    for (int j = 0; j < books.length; j++) {
                        if (books[j] == null) {
                            books[j] = i;
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }


    private int availableCapacity() {
        int emptySpace = 0;
        for (Book a : books) {
            if (a == null) {
                emptySpace++;
            }
        }
        return emptySpace;
    }

    Book returnBook(Book a) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].equals(a)) {
                    books[i] = null;
                    return a;
                }
            }
        }
        return null;
    }

    Book[] returnDuplicates() {
        Book[] bookDuplicates = new Book[books.length];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i] != null) {
                for (int k = i + 1; k < books.length; k++) {
                    if (books[i].equals(books[k])) {
                        bookDuplicates[j] = books[k];
                        j++;
                        books[k] = null;
                    }
                }

            }
        }
        return bookDuplicates;
    }

    void printBooksOnTheShelf() {
        for (Book a : books) {
            if (a != null) {
                System.out.println("Shelf #" + this.getShelfNum() + ": " + a.getName() + ", " + a.getAuthor().getName()
                + ", " + a.getAuthor().getSurname() + ". Pages: " + a.getNumOfPages());
            }

        }
    }



}
