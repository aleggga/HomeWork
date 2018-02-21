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

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    private void startEngine() {
        System.out.println("Car: Starting engine .... Wjoooonnnn");
    }
}
