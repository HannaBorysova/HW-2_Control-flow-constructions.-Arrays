package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        workWithArrays();
    }

    public static void workWithArrays() {
        int[] newArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
            System.out.println(newArray[i]);
        }
        int minValue = newArray[0];
        int maxValue = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < minValue) {
                minValue = newArray[i];
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] > maxValue) {
                maxValue = newArray[j];
            }
        }
        System.out.println("min value = " + minValue);
        System.out.println("max value = " + maxValue);
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
        Arrays.sort(newArray);
        for (int j = newArray.length - 1; j >= 0; j--) {
            System.out.println(" " + newArray[j]);
        }
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }
        System.out.println(sum);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] *= newArray[i];
            System.out.println(" " + newArray[i]);
        }
    }
}
