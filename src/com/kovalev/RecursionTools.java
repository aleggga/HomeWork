package com.kovalev;

public class RecursionTools {

    private static final long K = 3;
    static long f = 0;


    public static long sumOfElements(long n) {
        if (n == 1) {
            f += K * n;
        } else {
            f += K * n;
            sumOfElements(n - 1);
        }
        return f;
    }
}
