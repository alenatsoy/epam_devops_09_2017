package com.epam.tcoi;

import java.util.Arrays;
import java.util.Scanner;

///**
// * Формирует квадратную матрицу размером {@code dimension}.
// * Матрица должна быть заполнена элементами от 1 до {@code dimension}^2, начиная с верхнего левого угла.
// *
// * dimension = 3:
// * 1 2 3
// * 4 5 6
// * 7 8 9
// *
// * @param dimension Размерность матрицы.
// * @return Созданная матрица.
// */
//public int[][] createSquareMatrix(int dimension) {
//        return null;
//        }

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int num = in.nextInt();
        int [] [] matrix = (createSquareMatrix(num));
        for (int i = 0; i < num; i++) {
            System.out.println(Arrays.toString(matrix [i]));
        }
    }

    private static int[][] createSquareMatrix(int dimension) {
        int [] [] array = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <dimension ; j++) {
                array [i][j] = i*dimension + j + 1;
            }
        }
        return array;
    }
}
