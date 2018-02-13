package com.kovalev;

public class Calculator {

    // HOMEWORK 1

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

    // HOMEWORK 2
    public static long castToLong(double val) {
        return (long) val;
    }

    public static byte checkSign(byte b) {
        System.out.println("checkSign method not ready yet");
        return b;
    }

    public static int getSumOfDigitsFromNumber(int number) {
        int sum = 0;

        while(number != 0){
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static int getFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i < number; i++) {
            factorial += factorial * i;
        }
        return factorial;
    }

    public static void multiply() {
        int i = 1;
        int j = 1;
        while (i < 10) {
            while ((j < 10)) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            i++;
            j = 1;
        }
    }

    public static boolean ifNumberPalendrom(int number) {
        int arraySize = Integer.toString(number).length();
        int[] arr = new int[arraySize];

        for (int i = 0; number > 0; i++) {
            arr[i] = number % 10;
            number /= 10;
        }

        for (int i = 0, j = arraySize -1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
