package com.kovalev;

import java.util.Arrays;

public class ArrayTools {

    // HomeWork5

    public static void getSumOfArrayElements(int[] arr) {

    }

    public static int[][] getArrayWithRandomValues(int size1, int size2, int startRange, int endRange) {
        int[][] arr2 = new int[size1][size2];
        int range = (endRange - startRange) + 1;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr2[i][j] = (int) (Math.random() * range) + startRange;
            }
        }
        return arr2;
    }

    public static int getSummOfAllArrayElements(int[][] arr) {
        int sum = 0;
        int arr1Lenth = arr.length;
        int arr2Lenth = arr[0].length;

        for (int i = 0; i < arr1Lenth; i++) {
            for (int j = 0; j < arr2Lenth; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int getArr2ElementsAverage(int[][] arr) {
        int sum = 0;
        int elementsCount = 0;
        int arr1Lenth = arr.length;
        int arr2Lenth = arr[0].length;

        for (int i = 0; i < arr1Lenth; i++) {
            for (int j = 0; j < arr2Lenth; j++) {
                sum += arr[i][j];
                elementsCount++;
            }
        }
        return sum / elementsCount;
    }

    public static int getArr2ElementsMin(int[][] arr) {
        int min = arr[0][0];
        int arr1Lenth = arr.length;
        int arr2Lenth = arr[0].length;

        for (int i = 0; i < arr1Lenth; i++) {
            for (int j = 0; j < arr2Lenth; j++) {
                min = (min < arr[i][j]) ? min : arr[i][j];
            }
        }
        return min;
    }

    public static int getArr2ElementsMax(int[][] arr) {
        int max = arr[0][0];
        int arr1Lenth = arr.length;
        int arr2Lenth = arr[0].length;

        for (int i = 0; i < arr1Lenth; i++) {
            for (int j = 0; j < arr2Lenth; j++) {
                max = (max > arr[i][j]) ? max : arr[i][j];
            }
        }
        return max;
    }

    public static int getArr2NumOfPositiveElements(int[][] arr, boolean ifPositive) {
        int positive = 0;
        int negative = 0;
        int arr1Lenth = arr.length;
        int arr2Lenth = arr[0].length;

        for (int i = 0; i < arr1Lenth; i++) {
            for (int j = 0; j < arr2Lenth; j++) {
                if (arr[i][j] > 0){
                    positive++;
                } else {
                    negative ++;
                }
            }
        }
        return (ifPositive) ? positive : negative;
    }

    public static int[][] switchArr2columnsElements(int[][] arr, int col1, int col2) {
        int arrLength = arr.length;
        int arr1Length = arr[col1].length;

        // print initial array
        for (int i = 0; i < arr1Length; i++) {
            for (int j = 0; j < arr1Length; j++) {
                System.out.print(arr[i][j] + ", ");
            }

        }
        System.out.println("\n");

        for (int i = 0; i < arrLength; i++) {
            int a = arr[i][col1];
            arr[i][col1] = arr[i][col2];
            arr[i][col2] = a;
        }

        // print final array
        for (int i = 0; i < arr1Length; i++) {
            for (int j = 0; j < arr1Length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println("\n");
        return arr;
    }

    public static int getMaxArray2Column(int[][] arr) {
        int maxColumn = 0;
        int arrLength = arr.length;
        int arr1Length = arr[0].length;
        int[] tempArray = new int[arr1Length];

        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arr1Length; j++) {
                tempArray[j] += arr[i][j];
            }
        }
        int maxValue = tempArray[0];
        for (int i = 0; i < tempArray.length; i++) {
            if (maxValue < tempArray[i]) {
                maxValue = tempArray[i];
                maxColumn = i;
            }

        }
        return maxColumn;
    }

    public static boolean arrayMatch(char[] alpha, char[] betta, boolean fullMatch) {
        boolean match;
            for (char a : alpha) {
                match = false;
                for (char b : betta) {
                    if (fullMatch) {
                        if (a != b) {
                            return false;
                        }
                    } else if (a == b) {
                        match = true;
                    }
                }
                if (!match) {
                    return false;
            }
        }
        return true;
    }
}
