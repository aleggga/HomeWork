package com.kovalev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        // HOMEWORK 1
        System.out.println(Calculator.add(1,3));
        System.out.println(Calculator.add(1.1,3.2));
        System.out.println(Calculator.sub(4,3));
        System.out.println(Calculator.sub(4.1,3));
        System.out.println(Calculator.mul(1,3));
        System.out.println(Calculator.mul(5.43,3.23));
        System.out.println(Calculator.div(6,3));
        System.out.println(Calculator.div(10.57,3));
        System.out.println(Calculator.mod(6,3));
        System.out.println(Calculator.mod(10.54,3));
        System.out.println(Calculator.avg(6,3));
        System.out.println(Calculator.avg(10.54,3));
        System.out.println(Calculator.pow(6));
        System.out.println(Calculator.pow(10.54));
        System.out.println(Calculator.percent(100, 10));

        // HOMEWORK 2
        System.out.println(Calculator.castToLong(100.134));

        // DateToEpoch
        List<Integer> dates = new ArrayList<Integer>(Arrays.asList(1910, 1700, 1998, 2000, 2001, 200, 381, 45, 1000, 1001));
        for (int a : dates) {
            System.out.println(DatesTool.dateToEpoch(a));
        }

        // getSeasonByMonthNumSwitch
        for (int i = 0; i < 14; i++) {
            System.out.println(i + " = " + DatesTool.getSeasonByMonthNumSwitch(i));
        }


	    //Race.getRace();
        //count10To0();
        //EagleTails.getTailsOrEagles();
        //System.out.println(Calculator.getSumOfDigitsFromNumber(234));
        //System.out.println(Calculator.getFactorial(3));
        //Calculator.multiply();
    }

    public static void count10To0() {
        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while (i != 0);
    }
}
