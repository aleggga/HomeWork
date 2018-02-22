package transport;

public class Vehicle {

    private String number;
    private int passengersCapacity;
    private boolean standBy = true;


    void go() {
        System.out.println("vehicle is moving");
    }

    int getPassengersCapacity() {
        return passengersCapacity;
    }

    void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    protected boolean isStandBy() {
        return standBy;
    }

    void setStandBy(boolean standBy) {
        this.standBy = standBy;
    }
}
