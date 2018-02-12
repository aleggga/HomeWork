package com.kovalev;

public class Race {
    public static void getRace() {
        for (int i = 1; i < 21; i++) {
            if (!(i == 6 || i == 12 || i == 18)) {
                System.out.println("- \"Race " + i + "\"");
            }
        }
    }
}
