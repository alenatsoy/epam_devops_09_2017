package com.epam.tcoi;

import java.util.Arrays;

//Реализовать список, позволяющий работать с целыми числами типа int, построенный на основе массива.
//Заготовка класса списка располагается в: com.epam.practice.IntList
//Необходимо скопировать её в личный пакет и реализовать все

public class IntList {

    private static final int DEFAULT_SIZE = 16;
    private int[] arr;
    private static int listLength=0;

    public static void main(String[] args) {
        // создание объекта класса
        IntList list1 = new IntList(10);
        // добавление элементов в конец списка
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        // возврат копии массива
        // вывод массива
        System.out.println("Исходный лист 0");
        System.out.println(Arrays.toString(list1.toArray()));

        // уменьшение массива до размера списка
        // вывод списка
        System.out.println("Лист 1, после трима");
        list1.printList();

        // добавление элемента в указанную позицию
        list1.add(5,5);
        System.out.println("Лист 2, после добавления элемента в середину списка");
        list1.printList();

        // проверка на добавление в несуществующую позицию
        System.out.println("Лист 3, после добавления элемента в несуществующую позицию");
        list1.add(8,12);
        list1.printList();

        // изменение значения элемента списка
        list1.set(9,8);
        System.out.println("Лист 4, после изменения значения элемента списка");
        list1.printList();

        // получение значения элемента по индексу
        System.out.println("Получение значения элемента по индексу 4");
        System.out.println(list1.get(4));

        // удаление элемента в позиции, проверка возврата удаленного значения
        System.out.println("Удаление элемента в позиции 7 и возврат удаленного значения");
        System.out.println(list1.removeFrom(7));
        System.out.println("Лист 5, после удаления элемента в позиции");
        list1.printList();

        // добавление дублирующего элемента и проверка удаления первого вхждения
        list1.add(3);
        System.out.println("Лист 6, после добавления дублирующего элемента в конец списка");
        list1.printList();
        System.out.println("     массив после удаления первого вхождения 3, если оно есть в списке ");
        if (list1.remove(3)) System.out.println(Arrays.toString(list1.toArray()));
        // проверка удаления элемента который не существует в списке
        if (list1.remove(8)) System.out.println(Arrays.toString(list1.toArray()));

        // добавление дублирующих элементов и проверка удаления всех вхождений
        list1.add(2);
        list1.add(0);
        list1.add(2);
        list1.add(2);
        System.out.println("Лист 7, после добавления нескольких дублирующих элементов в конец списка");
        list1.printList();
        System.out.println("      массив после удаления всех вхождений 2, если они есть в списке ");
        if (list1.removeAll(2)) System.out.println(Arrays.toString(list1.toArray()));
        // проверка удаления элемента который не существует в списке
        if (list1.removeAll(8)) System.out.println(Arrays.toString(list1.toArray()));

        // поиск элемента в списке и возврат его позиции в списке (от головы к хвосту)
        list1.add(5,7);
        System.out.println("Лист 8, после добавления дублирующего элемента 5 в середину списка");
        list1.printList();
        System.out.println("Поиск позиции первого вхождения 5");
        System.out.println((list1.indexOf(5)));

        // поиск элемента в списке и возврат его позиции в списке (от хвоста к голове)
        System.out.println("Поиск позиции последнего вхождения 5");
        System.out.println((list1.lastIndexOf((5))));

    }


    public IntList() {
        arr = new int[DEFAULT_SIZE];
    }

    public IntList(int size) {
        arr = new int[size];
    }

    public void printList(){
        // временная функция, если нужен трим до вывода элементов списка на экран,
        // если нет, то удалить.
        trimToSize();
        System.out.println(Arrays.toString(arr));
    }

    public void add(int value) {
        extendIfNeeded();
        arr[size()]=value;
        listLength++;
    }

    public void extendIfNeeded (){
        if (listLength == arr.length) {
            int [] tmp = new int[arr.length*2];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            arr = tmp;
        }
    }

    public void add(int value, int index) {
        // добавление элемента в указанную позицию
        if (index <= listLength) {
            extendIfNeeded();
            for (int i = listLength; i >=index; i--){
                arr[i]=arr[i-1];
            }
            arr[index-1]=value;
            listLength++;
        }
        else {
            System.out.println("Введенная позиция больше размера списка, элемент добавлен в конец списка");
            add(value);
        }
    }

    public void set(int value, int index) {
        // изменяет значение указанного элемента
        if (index > listLength){
            System.out.println("Введенная позиция больше размера списка, элемент добавлен в конец списка");
            add(value);
        }
        else arr[index-1] = value;
    }

    public boolean remove(int value) {
        // удаление первого вхождения указанного элемента (если он присутствует в списке)
        // возвращает true - если элемент был удален, в противном случае false
        boolean temp = false;
        for (int i = 0; i < listLength; i++){
            if (arr[i] == value){
                removeFrom(i+1);
                temp = true;
                break;
            }
        }
        return temp;
    }

    public boolean removeAll(int value) {
        // удаление всех вхождений указанного элемента (если он присутствует в списке)
        // возвращает true - если элемент был удален, в противном случае false
        boolean temp = false;
        for (int i = 0; i < listLength; i++){
            if (arr[i] == value){
                removeFrom(i+1);
                i--;
                temp = true;
            }
        }
        return temp;
    }

    public int removeFrom(int index) {
        // удаление элемента по указанному индексу
        // возвращает удаленное значение
        int temp = 0;
        if (index > size()) System.out.println("Введенная позиция больше размера списка, элемент не найден");
        else {
            temp = arr[index - 1];
            for (int i = index; i < size(); i++){
                arr[i-1]=arr[i];
            }
            arr[size()-1]=0;
        }
        listLength--;
        return temp;
    }

    public int get(int index) {
        // значение указанного элемента
        return arr[index-1];
    }

    public int[] toArray() {
        // возвращаем копию внутреннего массива
        return Arrays.copyOf(arr, arr.length);
    }

    public int size() {
        // текущий размер списка
//        int nextPosition=0;
//        for (int i = 0; i < arr.length ; i++){
//            if (arr[i] > 0) nextPosition = i+1;
//        }
        return listLength;
    }

    public int indexOf(int value) {
        // поиск элемента (с головы списка к хвосту)
        int temp = 0;
        for (int i = 0; i < listLength; i++){
            if (arr[i] == value) {
                temp = i+1;
                break;
            }
        }
        return temp;
    }

    public int lastIndexOf(int value) {
        // поиск элемента (c хвоста списка к голове)
        int temp = 0;
        for (int i = listLength-1; i >= 0; i--){
            if (arr[i] == value) {
                temp = i+1;
                break;
            }
        }
        return temp;
    }

    public void trimToSize() {
        // уменьшает размер внутреннего массива до актуального значения
        int [] tmp = new int[listLength];
        System.arraycopy(arr, 0, tmp, 0, listLength);
        arr = tmp;
    }

//    @Override
//    public  boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        IntList _this = this;
//        Object objectThis = (Object)this;
//        if (obj == objectThis) {
//            return true;
//        }
//        if (obj.getClass() != IntList.class){
//            return false;
//        }
//        if (!(obj instanceof IntList)) {
//            return false;
//        }
//        IntList other = (IntList)obj;
//        if (this.listLength != listLength) {
//            return false;
//        }
//    }

}