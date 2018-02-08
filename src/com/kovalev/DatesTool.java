package com.kovalev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatesTool {
    public static void main(String[] args) {
        List<Integer> dates = new ArrayList<Integer>(Arrays.asList(1910, 1700, 1998, 2000, 2001, 200, 381, 45, 1000, 1001));

        System.out.println(dateToEpoch(1910));
        System.out.println(dateToEpoch(1700));
        System.out.println(dateToEpoch(1998));
        System.out.println(dateToEpoch(2000));
        System.out.println(dateToEpoch(2001));
        System.out.println(dateToEpoch(200));
        System.out.println(dateToEpoch(381));
        System.out.println(dateToEpoch(45));
        System.out.println(dateToEpoch(1000));
        System.out.println(dateToEpoch(1001));
    }


    public static int dateToEpoch(int date) {
        int minDate = 1;
        int maxDate = 2018;
        int epoch = date / 100;

        if (date < minDate || date > maxDate) {
            System.out.println("Wrong date, please provide date in a range of " + minDate + "-" + maxDate);
            return 0;
        }

        if (date < 101) {
            epoch = 1;
        }
        else if (date % 100 > 0) {
            epoch++;
        }
        return epoch;
    }
}