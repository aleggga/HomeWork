package com.kovalev;

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


}
