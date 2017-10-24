package com.epam.tcoi;

//        На вход программе подается несколько строк (через параметры командной строки args). Каждая строка представляет собой одно слово.
//        В результате выполнения в выходной поток должно быть выведено количество слов, состоящих только из символов латинского алфавита и содержащих равное количество гласных и согласных букв. (количество различных вхождений одной буквы в слове учитывается).
//
//        Входные данные:
//        args = ["Язык", "программирования", "Java", "is", "widespread"]
//
//        Выходные данные:
//        2

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
