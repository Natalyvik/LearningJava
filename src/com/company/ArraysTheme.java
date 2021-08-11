package com.company;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args){
        // Массивы array
        // массив это набор элементов (коллекций) у которых есть индекс
        int[] twoNumbers = new int[2]; //пустой массив конечного размера (2 элемента)
        float[] numbers = new float[]{23, 334.38f, 28.848f, 56.3737f, 45.91f, 35.3228f}; //создание конкретного массива значений
        float[] numbers2 = {23, 334.38f, 28.848f, 56.3737f, 45.91f, 35.3228f};


        // второй вариант инициализации массива с заданными значениями
        float[] numbers3; //объявление переменной типа массив
        numbers3 = new float[2]; //инициализация пустого массива
        numbers3 = new float[]{12.23f, 122.56f}; // инициализация массива конкретных значений
        //Длинна массива конечна и неизменна после инициализации
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(numbers[0]); //выводит первый элемент

        // СТАНДАРТНЫЕ МЕТОДЫ МАССИВА
        //сравнение на равенство двух массивов
        //System.out.println(Arrays.equals(numbers,numbers2));
        //System.out.println(Arrays.equals(numbers,numbers3));

        //копирование массива
        //частичная копия массива
        float[] numbersCopy = Arrays.copyOfRange(numbers, 1, 4); //не включая последний элемент
        //System.out.println(Arrays.toString(numbersCopy));

        // полная копия массива и его сортировка
        float[] fullCopy = Arrays.copyOf(numbers, numbers.length); //number.lenght - значение длины массива
        Arrays.sort(fullCopy); //сортировка массива по возрастанию элементов
        // System.out.println(Arrays.toString(fullCopy));

        // поиск в массиве
        int foundIndex = Arrays.binarySearch(fullCopy, 45.91f);// прежде чем использовать этот метод необходимо отсортировать массив
        //System.out.println(foundIndex);
        int foundIndex2 = Arrays.binarySearch(fullCopy, 46f);
        //System.out.println(foundIndex2);// вывод отрицательного индекса (-5) ;- значит, что элемента в массиве не существует; 5 если бы элемент существовал ,то он был бы пятым элементом с 4 индексом

    }
}
