package main.java.com.hw2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static final int MAX_ARRAY_RANGE = 100;

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

    private static void setRandomIntValuesInArrays(int[] newArray) {
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(MAX_ARRAY_RANGE);
            System.out.println(newArray[i]);
        }
    }

    private static void printMinValueInArray(int[] newArray) {
        int minValue = newArray[0];
        for (int i : newArray) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("min value = " + minValue);
    }

    private static void printMaxValueInArray(int[] newArray) {
        int maxValue = newArray[0];
        for (int j : newArray) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        System.out.println("max value = " + maxValue);
    }

    private static void sortArrayFromMinToMax(int[] newArray) {
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }

    private static void sortArrayFromMaxToMin(int[] newArray) {
        for (int j = newArray.length - 1; j >= 0; j--) {
            System.out.println(" " + newArray[j]);
        }
    }

    private static void printSumOfArray(int[] newArray) {
        int sum = 0;
        for (int i : newArray) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    private static void printSquareValuesOfElementsInArray(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] *= newArray[i];
            System.out.println(" " + newArray[i]);
        }
    }

    private static void printDiagonalElementsOfMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    private static void replaceDublicates(int[] massive) {
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
