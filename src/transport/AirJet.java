package transport;

public class AirJet extends Vehicle {

    private String jetType;

    @Override
    void go() {
        startEngine();
        System.out.println("Air Jet " + jetType + " preparing for takeoff");
    }

    @Override
    public String getNumber() {
        return super.getNumber() + " (" + jetType + ")";
    }

    void setJetType(String jetType) {
        this.jetType = jetType;
    }

    private void startEngine() {
        System.out.println("AitJet: Starting turbines.... Wooooooooohhhhhhhshhhshshs");
    }
}
