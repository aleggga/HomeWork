package com.kovalev;

import transport.Vehicle;

public class VehicleTools extends Vehicle {
    void go() {
        System.out.println(isStandBy()? "The requested vehicle is ready for booking"
                : "The requested vehicle is not available atm");
    }
}
