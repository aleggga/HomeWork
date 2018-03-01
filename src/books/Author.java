package books;

public class Author {
    private String name;
    private String surname;
    private int dob;

    public Author(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDob() {
        return dob;
    }


}
