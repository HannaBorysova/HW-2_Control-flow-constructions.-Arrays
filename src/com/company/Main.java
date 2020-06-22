package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[20];

        setRandomIntValuesInArrays(newArray);
        printMinValueInArray(newArray);
        printMaxValueInArray(newArray);
        sortArrayFromMinToMax(newArray);
        sortArrayFromMaxToMin(newArray);
        printSumOfArray(newArray);
        printSquareValuesOfElementsInArray(newArray);

        String[][] matrix = {{"need", "should", "would"},
                {"for", "to", "by"},
                {"drink", "eat", "sleep"}};

        printDiagonalElementsOfMatrix(matrix);

        int[] massive = new int[]{3, 2, 3, 1, 4, 2, 8, 3};

        replaceDublicates(massive);
    }

    public static void setRandomIntValuesInArrays(int[] newArray) {
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
            System.out.println(newArray[i]);
        }
    }

    public static void printMinValueInArray(int[] newArray) {
        int minValue = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < minValue) {
                minValue = newArray[i];
            }
        }
        System.out.println("min value = " + minValue);
    }

    public static void printMaxValueInArray(int[] newArray) {
        int maxValue = newArray[0];
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] > maxValue) {
                maxValue = newArray[j];
            }
        }
        System.out.println("max value = " + maxValue);
    }

    public static void sortArrayFromMinToMax(int[] newArray) {
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }

    public static void sortArrayFromMaxToMin (int[] newArray) {
        for (int j = newArray.length - 1; j >= 0; j--) {
            System.out.println(" " + newArray[j]);
        }
    }

    public static void printSumOfArray(int[] newArray) {
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        System.out.println(sum);
    }

    public static void printSquareValuesOfElementsInArray(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] *= newArray[i];
            System.out.println(" " + newArray[i]);
        }
    }

    public static void printDiagonalElementsOfMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public static void replaceDublicates(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] == massive[j]) {
                    massive[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
