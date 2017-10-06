package com.epam.tcoi;

public class FirstExample {
    public static void main(String[] args) {
        int arrayLength = 0;
        for (int i=0; i < args.length; i++){
            arrayLength += args[1].length();
        }
        System.out.println(args.length);
        System.out.println(arrayLength/args.length);
    }
}
