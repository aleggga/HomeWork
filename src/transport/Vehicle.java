package transport;

public class Vehicle {

    private String number;
    private int passengersCapacity;


    void go() {
        System.out.println("vehicle is moving");
    }


    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
