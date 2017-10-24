package com.epam.tcoi;

import com.sun.prism.impl.Disposer;

import java.util.Arrays;

//        На вход программе подается несколько строк (через параметры командной строки args).
//        Необходимо упорядочить и вывести строки в порядке возрастания значений их длины. В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке. Для проверки использовать Unit-тесты.
//
//        Входные данные:
//        AAA
//        BA
//        AA
//        BBB
//
//        Выходные данные:
//        AA
//        BA
//        AAA
//        BBB

public class Task7 {
    public static void main(String[] args) {
        if (args.length ==0) return;
        Records[] records = new Records [args.length];
        for (int i =0; i<args.length; i++) {
            records[i]= new Records(args[i],args[i].length());
        }
        System.out.println(Arrays.toString(records));
        Arrays.sort(records);
        System.out.println(Arrays.toString(records));
    }

    static class Records implements Comparable<Records>{
        String stringName;
        int stringLength;

        Records (String name, int time) {
            this.stringName = name;
            this.stringLength = time;
        }

        @Override
        public String toString() {
            return stringName +":"+stringLength;
        }

        public int compareTo(Records other) {
//            System.out.println(stringName + " " + other.stringName + " " + stringName.compareTo(other.stringName));
//            System.out.println(stringLength + " " + other.stringLength + " " + Integer.compare(stringLength, other.stringLength));
            if (Integer.compare(stringLength, other.stringLength)== 0) return stringName.compareTo(other.stringName);
            else return Integer.compare(stringLength, other.stringLength);
        }
    }
}
