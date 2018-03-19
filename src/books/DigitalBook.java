package books;

import java.util.Random;

public class DigitalBook extends Bookk implements Searchable, Digital {
    @Override
    public void display() {
        System.out.println(getContent());
    }

    @Override
    public int found(String text) {
        return (int) (Math.random() * 1) + 1000;
    }

    String getContent() {
        return title + " - " + year;
    }


}
