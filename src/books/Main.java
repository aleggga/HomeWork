package books;

public class Main {

    public static void main(String[] args) {
        DigitalBook db1 = new DigitalBook();
        DigitalBook db2 = new DigitalBook();

        OldDigitalBook odb1 = new OldDigitalBook();
        OldDigitalBook odb2 = new OldDigitalBook();

        PaperBook pb1 = new PaperBook();
        PaperBook pb2 = new PaperBook();


        Bookk[] books = new Bookk[6];
        books[0] = db1;
        books[1] = db2;
        books[2] = odb1;
        books[3] = odb2;
        books[4] = pb1;
        books[5] = pb2;

        for (Bookk a : books) {
            if (a instanceof Searchable && a instanceof Digital) {
                ((Digital) a).display();
                ((Searchable) a).found("a");
            }
            else if (a instanceof Digital) {
                ((Digital) a).display();
            }
            else if (!(a instanceof Digital && a instanceof Searchable)) {
                a.getContent();
            }
        }

    }
}
