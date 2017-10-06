package com.epam.tcoi;

public class FirstExample {
    public static void main(String[] args) {
        double arrayLength = 0;
        for (String arg : args) arrayLength += arg.length();
        System.out.println(args.length);
        System.out.println(arrayLength/args.length);
    }
}
