package com.epam.tcoi;
//определяет, является ли указанное значение степенью двойки.

public class Task10 {

    public static void main(String [] args) {
//        Решение без рекурсии
        for (String arg : args) {
            notRecusrsionMethod(arg);
        }
        System.out.println("=========================================");
//        Решение с рекурсией. Недостаток - считает 0 степенью двойки, нужна дополнительная проверка.
        for (String arg : args) {
            if ((recusrsionMethod(Integer.parseInt(arg))) & (Integer.parseInt(arg) > 0)) System.out.println(arg + " является степенью двойки");
            else System.out.println(arg + " не является степенью двойки");
        }
        System.out.println("=========================================");
//        Решение без рекурсии 2. Дизюнкция числа являющегося степнью двойки и этого числа -1 будет равна 0
        for (String arg : args) {
            if (isPowerOfTwo(Integer.parseInt(arg))) System.out.println(arg + " является степенью двойки");
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
        return (value <= 1) || recusrsionMethod(value / 2) & (value % 2 == 0);
    }

    private static boolean isPowerOfTwo(int value) {
        return value > 0 && (value & (value - 1)) == 0;
    }

}

