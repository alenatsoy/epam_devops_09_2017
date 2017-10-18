package com.epam.tcoi;

public class Task4 {
    public static void main(String[] args) {
        int index = 0;
        String minStr = args[0];
        int min = minStr.length();
        for (int i = 0; i < args.length; i++) {
//            minStr= "" + args[i].charAt(0);
//            for (int j = 1; j < args[i].length(); j++){
//                if (!minStr.contains(String.valueOf(args[i].charAt(j)))) minStr += args[i].charAt(j);
//            }
            minStr = args[i].replaceAll("(.)(?=.*\\1)", "");
            if (minStr.length() < min) {
                min = minStr.length();
                index = i;
            };
        }
        System.out.println(args[index]);
    }
}
