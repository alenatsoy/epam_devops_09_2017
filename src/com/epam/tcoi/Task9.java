package com.epam.tcoi;

///**
// * Создает строку, содержащую монотонную последовательность чисел от {@code from} до {@code to} включительно.
// * <p>Если {@code from} > {@code to} - последовательность убывающая, иначе возрастающая.</p>
// *  Числа внутри строки разделяются пробелами.
// * @param from Первая граница.
// * @param to Вторая граница.
// * @return Строка, содержащая последовательность чисел от {@code from} до {@code to}.
// */

public class Task9 {
    private static int i;
    public static void main(String [] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        if (firstNum < secondNum) i = 1; else i = -1;
//        Монотонная последовательность от первого числа до второго
        System.out.println(createMonotoneSequence(firstNum,secondNum));
//        Монотонная последовательность от нуля до первого числа
//        System.out.println(createStringFromZeroTo(firstNum));
    }

    private static String createMonotoneSequence(int from, int to) {
        return from == to ? String.valueOf(from)
                : createMonotoneSequence(from, to - i) + " " + to;
    }

    private static String createStringFromZeroTo(int value) {
        return value == 0 ? "0"
                :createStringFromZeroTo(value-1) + " " + value;
    }
}
