package com.company;

public class Task2 {
    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {
        String[][] matrix = {{"need ", "should ", "would "},
                {"for ", "to ", "by "},
                {"drink ", "eat ", "sleep "}};
        System.out.println(matrix[0][0] + matrix[1][1] + matrix[2][2]);
    }
}
