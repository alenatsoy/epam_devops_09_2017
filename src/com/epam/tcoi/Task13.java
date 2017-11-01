package com.epam.tcoi;

import java.util.Scanner;

///**
// * Позволяет получить название месяца по его номеру.
// * При реализации использовать оператор switch.
// * @param number Номер месяца.
// * @return Название месяца, или пустая строка, если месяц с указанным номером отсутствует.
// */
//public String getMonthByNumber(int number) {
//        return null;
//        }

public class Task13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int num = in.nextInt();
        if (num < 13 & num > 0) System.out.println(getMonthByNumber(num));
            else System.out.println();
    }

    private static String getMonthByNumber(int number) {
        switch (number) {
            case 1: return "Январь";
            case 2: return "Февраль";
            case 3: return "Март";
            case 4: return "Апрель";
            case 5: return "Май";
            case 6: return "Июнь";
            case 7: return "Июль";
            case 8: return "Август";
            case 9: return "Сентябрь";
            case 10: return "Октябрь";
            case 11: return "Ноябрь";
            case 12: return "Декабрь";
        }
        return null;
    }
}
