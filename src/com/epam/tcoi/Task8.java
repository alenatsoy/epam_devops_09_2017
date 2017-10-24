package com.epam.tcoi;

// На вход программе подается несколько строк (через параметры командной строки args).
// Каждая строка представляет собой одно слово.
// Помимо обычных слов, во входной последовательности могут встречаться целые числа.
// Среди них необходимо найти число-палиндром (одинаково читающееся в обоих направлениях).
// Если таких чисел больше одного, найти второе из них.
// Одна цифра является палиндромом. Ограничения на размер числа нет.
//
// Входные данные:
// aa
// bbb
// 123
// 121
// qqq
// 2
//
// Выходные данные:
// 2

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        if (args.length == 0) return;
        String palindrome = "No palindromes";
        StringBuffer stringPartLeft;
        StringBuffer stringPartRight;
        for (int i =0; i<args.length; i++) {
            if (args[i].matches("[-+]?\\d+")) {
                if (args[i].length() == 1) palindrome = args[i];
                else {
                    stringPartLeft = new StringBuffer(args[i].substring(0,args[i].length()/2));
                    stringPartRight = new StringBuffer(args[i].substring(args[i].length()-args[i].length()/2));
                    stringPartRight.reverse();
                    if (stringPartLeft.toString().equals(stringPartRight.toString())) palindrome = args[i];
                }
            }
        }
        System.out.println(palindrome);
    }
}
