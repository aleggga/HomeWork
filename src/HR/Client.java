package HR;

public class Client extends Person {
    private String companyName;

    Client(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
