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
//        Решение с рекурсией (String)
        for (String arg : args) {
            System.out.println(arg + " - " + Integer.parseInt(recursionMethod(arg)));
        }
        System.out.println("=========================================");
//        Решение с рекурсией (int)
        for (String arg : args) {
            System.out.println(arg + " - " + recursionMethod2(Integer.parseInt(arg)));
        }
    }

    private static void notRecursionMethod(String value) {
        int newNumber = Integer.valueOf(value);
        StringBuilder reverseNumber= new StringBuilder();
        while(newNumber > 0){
            reverseNumber.append(String.valueOf(newNumber % 10));
            newNumber = newNumber / 10;
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

    private static int recursionMethod2(int value) {
        return (value < 10)? value
                : (value % 10) * (int) Math.pow(10, Integer.toString(value).length()-1) + recursionMethod2(value / 10);
    }

//    static int countDigits_B(int number){
//        return (int) Math.ceil(Math.log10(number + 0.5));
//    }
}
