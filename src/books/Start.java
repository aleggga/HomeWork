package books;

public class Start {
    public static void main(String[] args) {
        BookShelf shelf1 = new BookShelf(1, 10);
        BookShelf shelf2 = new BookShelf(2, 5);
        BookShelf shelf3 = new BookShelf(3, 15);

        Author pelevinV = new Author("Виктор", "Пелевин", 1981);
        Author dostoyevskiiF = new Author("Федор", "Достоевский", 1971);

        Book chapaev = createBook("Чапаев и пустота", 254, pelevinV);
        Book chapaev2 = createBook("Чапаев и пустота", 254, pelevinV);

        Book master1 = createBook("Мастер и Маргарита", 354, dostoyevskiiF);
        Book master2 = createBook("Мастер и Маргарита", 354, dostoyevskiiF);

        Book[] books = new Book[]{chapaev2, master1, master2, chapaev, master1};

        shelf1.addBook(chapaev);
        shelf2.addAll(books);

        BookShelf[] bookShelvesToSort = new BookShelf[]{shelf1, shelf2};

        for (BookShelf a : bookShelvesToSort) {
            shelf3.addAll(a.returnDuplicates());
        }

        shelf1.printBooksOnTheShelf();
        shelf2.printBooksOnTheShelf();
        shelf3.printBooksOnTheShelf();

        Book.printBooksCreated();
    }

    private static Book createBook(String name, int pages, Author author) {
        return new Book(name, pages, author);
    }

}
