package books;

public class OldDigitalBook extends Bookk implements Digital {
    @Override
    public void display() {

    }

    @Override
    String getContent() {
        return title + " - " + year;
    }
}
