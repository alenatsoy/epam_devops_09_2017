package com.epam.tcoi;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int [][] matrix = new int[4][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
        printMatrix(matrix);
        System.out.println();
        printMatrix(verticalCyclicShift(matrix, -3));
        System.out.println();
        printMatrix(horizontalCyclicShift(matrix,6));

    }

    private static void printMatrix(int[][] matr) {
        for (int[] aMatr : matr) {
            System.out.println(Arrays.toString(aMatr));
        }
    }

    /**
     * Выполняет циклический сдвиг матрицы на указанное количество позиций по вертикали.
     * @param matrix Исходная матрица.
     * @param numberShifts Положительное значение соответствует циклическому сдвигу вниз, отрицательное - вверх.
     * @return Новая матрица, содержащая результат применения операции.
     */
    public static int[][] verticalCyclicShift(int[][] matrix, int numberShifts) {
        int [][] temp = new int[matrix.length][matrix[1].length];
        numberShifts = numberShifts % matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            int k = i + numberShifts;
            if ( k < 0 | k > matrix.length - 1 ) k = k - (int)Math.copySign(matrix.length,numberShifts);
            temp [k] = matrix [i];
        }
        return temp;
    }

    /**
     * Выполняет циклический сдвиг матрицы на указанное количество позиций по горизонтали.
     * @param matrix Исходная матрица.
     * @param numberShifts Положительное значение соответствует циклическому сдвигу вправо, отрицательное - влево.
     * @return Новая матрица, содержащая результат применения операции.
     */
    public static int[][] horizontalCyclicShift(int[][] matrix, int numberShifts) {
        int [][] temp = new int[matrix.length][matrix[1].length];
        numberShifts = numberShifts % matrix[1].length;
        for (int j = 0; j < matrix[1].length; j++) {
            int k = j + numberShifts;
            if ( k < 0 | k > matrix[1].length - 1 ) k = k - (int)Math.copySign(matrix[1].length,numberShifts);
            for (int i = 0; i <matrix.length ; i++) {
                temp [i][k] = matrix [i][j];
            }
        }
        return temp;
    }
}