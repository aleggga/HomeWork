package com.kovalev;

public class EagleTails {

    public static void getTailsOrEagles() {
        double x;
        do {
            x = Math.random();
            if (x > 0.5) {
                System.out.println("x = " + x + "/ eagle");
            } else {
                System.out.println("x = " + x + "/ tails");
            }

        } while (x != 0.0);
    }
}
