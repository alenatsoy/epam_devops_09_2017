package com.epam.tcoi;

import java.util.Arrays;

public class Task15 {
//    /**
//     * Упорядочивает строки матрицы в порядке возрастания значений элементов определенного столбца.
//     * При совпадении значений элементов строки должны сохранить такой же относительный
//     *  порядок как в исходной матрице.
//     * @param matrix Исходная матрица.
//     * @param indexColumn Индекс столбца, по значениям которого выполняется сортировка.
//     * @return Новая матрица, содержащая результат применения операции.
//     */

    public static void main(String[] args) {
        int [][] matrix = new int[4][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
        printMatrix(matrix);
        printMatrix(sortMatrixByValuesInColumn(matrix,3));

//        int [] array =  {1, 5, 2, 6, 0, 9};
//        System.out.println(Arrays.toString(sortOneLine(array)));
    }


    private static void printMatrix(int[][] matr) {
        for (int[] aMatr : matr) {
            System.out.println(Arrays.toString(aMatr));
        }
    }

    public static int[][] sortMatrixByValuesInColumn(int[][] matrix, int indexColumn) {
        // сортировка двумерного массива по нужному столбцу
        boolean changes;
        do {
            changes = false;
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i][indexColumn] > matrix[i + 1][indexColumn]) {
                    int [] _current = matrix [i];
                    matrix[i] = matrix[i + 1];
                    matrix[i + 1] = _current;
                    changes = true;
                }
            }
        }
        while (changes);
        return matrix;
    }

    public static int [] sortOneLine (int[] array) {
        // сортировка одномерного массива (для тестирования алгоритма)
        boolean changes;
        do {
            changes = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int _current = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = _current;
                    changes = true;
                }
            }

        }
        while (changes);
        return array;
    }
}



