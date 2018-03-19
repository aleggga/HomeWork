package books;

public abstract class Bookk {

    String title;
    int year;

    String getTitle() {
        return title + " - " + year;
    }
    int getYear() {
        return year;
    }
    abstract String getContent();

}
