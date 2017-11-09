package com.epam.tcoi;

public class Task17 {
    /**
     * Требуется реализовать метод printArray, который принимает массив объектов
     * и выводит каждый элемент с новой строки.
     */

      public static void main( String args[] ) {
          Printer printer = new Printer();
          Integer[] intArray = {1, 2, 3};
          String[] stringArray = {"Hello", "World"};
          printer.printArray(intArray);
          printer.printArray(stringArray);
     }

}

class Printer <T> {
    //  printArray
    void printArray (T[] arr) {
        for (T anArr : arr) {
            System.out.println(anArr);
        }
    }
}
