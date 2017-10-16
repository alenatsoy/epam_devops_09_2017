package com.epam.tcoi;

public class Task5 {
    public static void main(String[] args) {
        if (args.length ==0) return;
        int latWords = 0;
        String consonants;
        for (int i=0; i < args.length; i++) {
            if (args[i].matches("\\w+")) {
                consonants = args[i].replaceAll("[aeiouAEIOU]", "");
                if (consonants.length() == args[i].length() - consonants.length()) latWords++;
            }
        }
        System.out.println(latWords);
    }
}
