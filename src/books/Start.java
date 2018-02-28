package books;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        BookShelf shelf1 = new BookShelf(1, 10);
        BookShelf shelf2 = new BookShelf(2, 5);
        BookShelf shelf3 = new BookShelf(3, 15);

        Author pelevinV = new Author("Viktor", "Pelevin", 1981);
        Author dostoyevskiiF = new Author("Fedor", "Dostoyevskii", 1971);

        Book chapaev = pelevinV.createBook("Чапаев и пустота", 254);
        Book chapaev2 = pelevinV.createBook("Чапаев и пустота", 254);

        Book master1 = dostoyevskiiF.createBook("Мастер и Маргарита", 354);
        Book master2 = dostoyevskiiF.createBook("Мастер и Маргарита", 354);

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
    }

}
