package HR;

public class Employee extends Person {

    private String profession;

    public Employee(String name) {
        super(name);

    }

    Employee(String name, String profession) {
        super(name);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
