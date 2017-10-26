package com.epam.tcoi;
//определяет, является ли указанное значение степенью двойки.

public class Task10 {

    public static void main(String [] args) {
//        Решение без рекурсии
        for (String arg : args) {
            notRecusrsionMethod(arg);
        }
        System.out.println("=========================================");
//        Решение с рекурсией
        for (String arg : args) {
            if (recusrsionMethod(Integer.parseInt(arg))) System.out.println(arg + " является степенью двойки");
            else System.out.println(arg + " не является степенью двойки");
        }
    }

    private static void notRecusrsionMethod(String value) {
        Integer newNumber = Integer.valueOf(value);
        String newString = Integer.toBinaryString(newNumber);
        if (newString.matches("^10*")) System.out.println(value + " является степенью двойки");
        else System.out.println(value + " не является степенью двойки");

    }

    private static boolean recusrsionMethod(int value){
        return (value == 1) || recusrsionMethod(value / 2) & (value % 2 == 0);
    }

}

