package com.epam.tcoi;

public class Example1 {
    public static void main(String[] args) {
        double arrayLength = 0;
        for (String arg : args) arrayLength += arg.length();
        System.out.println(args.length);
        System.out.println(arrayLength/args.length);
    }
}
