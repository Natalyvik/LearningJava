package com.company;

import java.util.ArrayList;

public class ListTheme {
    public static void main(String[] args){
        //ЛИСТЫ arraylist and linked list
        //List -интерфейс, позволяющий хранить упорядоченные коллекции
        // главное отличие от обычных массивов в том, что листы динамические и могут изменять размер (возможность добавления/удаления данных)
        // обычные массивы имеют конечный размер (длинну)

        // ArrayList
        // класс, который имплементирует интерфейс List
        // может хранить только объекты (Integer вместо int - пример использования примитивных типов)
        // когда нужно использовать ArrayList необходимо импортировать библиотеку import java.util.ArrayList

        ArrayList<Integer> numbers_= new ArrayList<>(); //декларация и инициализация
        //методы
        numbers_.add(10); // добавление элемента в конец листа на нулевой позиции равен 10
        numbers_.add(1,20); //добавление елемента используя индекс (на первом месте индекс, затем элемент)
        numbers_.set(1,30); // измененение элемента на определенной позиции
        numbers_.add(11);
        numbers_.add(12);
        numbers_.add(4,13);
        numbers_.add(14);
        numbers_.add(15);
        numbers_.remove(4); //удаление элемента, используя позицию
        int fourthElement = numbers_.get(3); // достает элемент по индексу
        int listSize = numbers_.size(); //длина листа (количество элементов)
        int fiveElementIdx = numbers_.indexOf(15); //поиск индекса элемента по значению
        int absentElementIdx = numbers_.indexOf(40); //поиск несуществующего элемента выдаст индекс Idx -1
        boolean hasEleven = numbers_.contains(11); //проверка на то, содержит ли лист элемент
        Integer[] numbers_Array = numbers_.toArray(new Integer[0]); //превращение листа в обычный массив (неважна длинна, важен тип передаваемого массива)
        Object[] numbers_ArrayObjects = numbers_.toArray(); //используется без указания типа массива
        // Object является родительским классом для всех ссылочных типов данных

         for (int element : numbers_) {
            System.out.println("I want to visit " + element);
        }
        /* for (int index =0; index < numbers_.size();index++){
            System.out.println("index["+ index +"] = " + numbers_.get(index));
        }*/
        // System.out.println(numbers_);
        // System.out.println(fourthElement);
        // System.out.println(listSize);
        // System.out.println(fiveElementIdx);
        // System.out.println(hasEleven);
        // System.out.println(Arrays.toString(numbers_Array));
        // System.out.println(Arrays.toString(numbers_ArrayObjects));

        //LinkedList
        // связанный список - имплементирует интерфейс List
        // доступны методы ArrayList, указанные выше,похож на ArrayList (у всех элементов есть индекс)
        // отличие в имплементации,ArrayList - массив с динамическим размером, упор на индексы,
        // LinkedList  - список в котором проще добавлять/удалять/вставлять объекты в середину списка
        // LinkedList - список, упор на ссылки соседей
        // Перемещение элементов происходит через ссылки на соседей

      /*  LinkedList<String> linkedNumbers= new LinkedList<>();
        linkedNumbers.add("Saratov");
        linkedNumbers.add("Moscow");
        linkedNumbers.add("Kostroma");
        linkedNumbers.add("St.Petersburg");
        linkedNumbers.add(2,"Penza");*/
        //linkedNumbers.clear(); //очищение листа

        // Отличительные методы от ArrayList
        //String head = linkedNumbers.poll(); //достает первый элемент и удаляет его (тоже самое pop)
        //String head2 = linkedNumbers.peek(); //достает первый элемент но не удаляет его, если лист пустой получим null
        //String head3 = linkedNumbers.getFirst(); // достает первый элемент и не удаляет его, если лист пустой получим ошибку(try/catch)
        //String tail = linkedNumbers.getLast(); // достает последний элемент и не удаляет его,если лист пустой получим ошибку(try/catch)
        /*for (String element : linkedNumbers) {
           System.out.println("I want to visit " + element); }
        */
        //System.out.println(linkedNumbers);
        //System.out.println(head);
        //System.out.println(head2);



    }
}
