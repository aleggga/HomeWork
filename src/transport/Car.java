package transport;

public class Car extends Vehicle {

    private String carType;
    private String brand;
    private boolean businessClass;

    @Override
    void go() {
        startEngine();
        System.out.println(brand + " (" +carType + ")" + " please fasten your belts as we are leaving");
    }

    @Override
    public String getNumber() {
        String carTypeExtended = (businessClass) ? carType + " -VIP-" : carType;
        return brand + "(" + carTypeExtended + ") with number: " + super.getNumber();
    }

    void setCarType(String carType) {
        this.carType = carType;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    void startEngine() {
        System.out.println("Car: Starting engine .... Wjoooonnnn");
    }
}
