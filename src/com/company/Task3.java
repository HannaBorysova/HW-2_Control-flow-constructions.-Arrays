package com.company;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        replaceDublicates();
    }

    public static void replaceDublicates() {
        int[] massive = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
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
