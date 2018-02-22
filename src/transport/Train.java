package transport;


public class Train extends Vehicle {

    private int numberOfVagons;

    @Override
    void go() {
        startEngine();
        System.out.println("Train leaving the station");
    }

    @Override
    String getNumber() {
        return super.getNumber() + " (" + numberOfVagons + " vagons)";
    }

    void setNumberOfVagons(int numberOfVagons) {
        this.numberOfVagons = numberOfVagons;
    }

    private void startEngine() {
        System.out.println("Train: tr-tr-tr-tr....");
    }
}
