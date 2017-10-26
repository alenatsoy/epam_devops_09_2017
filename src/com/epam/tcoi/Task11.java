package com.epam.tcoi;
///**
// * Вычисляет сумму цифр, составляющих указанное число.
// * @param value натуральное число.
// * @return Сумма цифр, составляющих число.
// */

public class Task11 {
    public static void main(String[] args) {
//        Решение без рекурсии
        for (String arg : args) {
            notRecursionMethod(arg);
        }
        System.out.println("=========================================");
//        Решение с рекурсией
        for (String arg : args) {
            System.out.println("Сумма цифр числа " + arg + " - " + recursionMethod(Integer.parseInt(arg)));
        }
    }

    private static void notRecursionMethod(String value){
        int newNumber = Integer.valueOf(value);
        int sumOfNumbers = 0;
        while(newNumber > 0){
            sumOfNumbers +=newNumber % 10;
            newNumber = newNumber/10;
        }
        System.out.println("Сумма цифр числа " + value + " - " + sumOfNumbers);
    }

    private static int recursionMethod(int value){
        return (value == 0) ? 0
                : recursionMethod(value / 10) + value % 10;
    }
}
