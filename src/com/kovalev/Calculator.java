package com.kovalev;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(1,3));
        System.out.println(add(1.1,3.2));
        System.out.println(sub(4,3));
        System.out.println(sub(4.1,3));
        System.out.println(mul(1,3));
        System.out.println(mul(5.43,3.23));
        System.out.println(div(6,3));
        System.out.println(div(10.57,3));
        System.out.println(mod(6,3));
        System.out.println(mod(10.54,3));
        System.out.println(avg(6,3));
        System.out.println(avg(10.54,3));
        System.out.println(pow(6));
        System.out.println(pow(10.54));
        System.out.println(percent(100, 10));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    public static double div(double num1, int num2) {
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }

    public static double mod(double num1, double num2) {
        return num1 % num2;
    }

    public static int avg(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    public static double avg(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static int pow(int num) {
        return num * num;
    }

    public static double pow(double num) {
        return num * num;
    }

    public static double percent(double num, double percent) {
        return num / 100 * percent;
    }
}
