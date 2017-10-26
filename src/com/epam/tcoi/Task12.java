package com.epam.tcoi;
///**
// * Создает число, в котором порядок цифр обратный по отношению к исходному.
// * Ведущие нули отбрасываются.
// * @param value исходное значение.
// * @return Число, содержащее цифры в порядке обратном исходному.
// */

public class Task12 {

    public static void main(String[] args) {
//        Решение без рекурсии
        for (String arg : args) {
            notRecursionMethod(arg);
        }
        System.out.println("=========================================");
//        Решение с рекурсией
        for (String arg : args) {
            System.out.println(arg + " - " + Integer.parseInt(recursionMethod(arg)));
        }
//        System.out.println(recursionMethod("123"));
    }

    private static void notRecursionMethod(String value) {
        int newNumber = Integer.valueOf(value);
        StringBuilder reverseNumber= new StringBuilder();
        while(newNumber > 0){
            reverseNumber.append(String.valueOf(newNumber % 10));
            newNumber = newNumber/10;
        }
//            recurseNumber = recurseNumber.replaceFirst("^0*","");
//            System.out.println(args[i] + " - " + recurseNumber);
            newNumber = Integer.parseInt(reverseNumber.toString());
            System.out.println(value + " - " + newNumber);

    }

    private static String recursionMethod(String value) {
        return (value.length() == 0)? ""
                :value.charAt(value.length()-1) + recursionMethod(value.substring(0,value.length()-1));
    }
}
