package com.epam.tcoi;

import com.sun.prism.impl.Disposer;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        int[] times = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265 };
//        procedureStyleSolution(names,times);
//        oopSolution1(names,times);
        oopSolution2(names,times);
    }

    private static void oopSolution1 (String[]names,int[]times){
        Record [] records = new Record [] {
          new Record("Elena", 341),
          new Record("Thomas", 273),
          new Record("Hamilton", 278)
                // others
        };
    }

    private static void oopSolution2 (String[]names,int[]times){
        Record [] records = new Record [names.length];
        for (int i =0; i<names.length; i++) {
            records[i]= new Record(names[i],times[i]);
        }
        System.out.println(Arrays.toString(records));
        Arrays.sort(records);
        System.out.println(Arrays.toString(records));
        System.out.println(records[1]);
    }

    static class Record implements Comparable<Record>{
        String name;
        int time;

        Record (String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public String toString() {
            return name +":"+time;
        }

        public int compareTo(Record other) {
//            return time - other.time;
            return Integer.compare(time, other.time);
//            if (time < other.time) {
//                return -1;
//            } else if (time > other.time) {
//                return 1;
//            } else {
//                return 0;
//            }
        }
    }

    public static void procedureStyleSolution(String[]names,int[]times) {
        int lowestTime = times[0];
        int index = 0;
        for (int i = 1; i < times.length; i++) {
            if (lowestTime >= times[i]) {
                lowestTime = times[i];
                index = i;
            }
        }
        System.out.println(names[index] + ": " + lowestTime);
    }
}
