package com.epam.tcoi;

public class Semaphore {
    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]) % 10;
        String led;
//        solution with if
//        if (x<4) led="green";
//        if (x>5) led="red";
//        else led="yellow";
//
//        solution with switch
        switch (x) {
            case 0:
            case 1:
            case 2:
            case 3: led="green";
            break;
            case 4:
            case 5: led="yellow";
            break;
            default: led="red";
        }
        System.out.print(led);
    }
}
