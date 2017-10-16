package com.epam.tcoi;

public class Task4 {
    public static void main(String[] args) {
        if (args.length ==0) return;
        String min =args [0];
        for (int i=1; i < args.length; i++) {
            if (args[i].length() < min.length()) min=args[i];
        }
        System.out.println(min);
    }
}
