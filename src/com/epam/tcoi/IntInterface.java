package com.epam.tcoi;

public interface IntInterface {
    void add(int value); // добавление элемента в конец списка

    void add(int value, int index); // добавление элемента в указанную позицию

    void set(int value, int index); // изменяет значение указанного элемента

    boolean remove(int value); // удаление первого вхождения указанного элемента (если он присутствует в списке)
    // возвращает true - если элемент был удален, в противном случае false

    boolean removeAll(int value);  // удаление всех вхождений указанного элемента (если он присутствует в списке)
    // возвращает true - если элемент был удален, в противном случае false

    int removeFrom(int index); // удаление элемента по указанному индексу
    // возвращает удаленное значение

    int get(int index); // значение указанного элемента

    int[] toArray(); // возвращаем копию внутреннего массива

    int size();  // текущий размер списка

    int indexOf(int value); // поиск элемента (с головы списка к хвосту)

    int lastIndexOf(int value); // поиск элемента (c хвоста списка к голове)
}
