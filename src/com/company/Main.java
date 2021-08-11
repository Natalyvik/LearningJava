package com.company;
//импорт библиотек

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // вывод текста в терминал с новой строки
        // System.out.println("I love my life");

        // ПЕРЕМЕННЫЕ
        // примитивные переменные
        // Целые числа
        // -2 ^ 7.. + 2 ^ 7 - 1
        byte testByte = 41;
        // -2 ^ 15.. + 2 ^ 15 - 1
        short testShort = 234;
        //-2 ^ 31 ..+2 ^ 31 - 1
        int testInt = 234_000;
        // -2 ^ 63.. + 2 ^ 63 - 1
        long testLong = 2_340_000L;

        // Дробные  или рациональные (с плавающей точкой)
        // -3.40282347 * 10^38  to 3.40282347 * 10^38 (!!!ТОЧНОСТЬ ЭТОГО ФОРМАТА 7 ЗНАКОВ ПОСЛЕ ЗАПЯТОЙ!!!)
        float testFloat = 45 / 4;
        //(!!!ТОЧНОСТЬ ЭТОГО ФОРМАТА 15 ЗНАКОВ ПОСЛЕ ЗАПЯТОЙ!!!)
        double testDouble = 45_000_000 / 4;

        // True or false
        boolean testBoolean = true;

        // 1 symbol
        char testChar = 'R';

        // Декларация declaration и инициализация initialization переменных
        // декларация (объявление переменной)
        int age;
        // инициализация (присвоение изначального значения)
        age = 26;
        // инициализация на этапе декларации
        char name = 'F';
        // инициализация нескольких переменных одного типа
        byte first = 1, second = 2;

        // Операции присвоения (=)
        int treesNumber = 129;
        treesNumber = 300;
        treesNumber = 234;
        // выведет конечное значение присвоенной переменной
        // System.out.println(treesNumber);

        // БАЗОВЫЕ ОПЕРАЦИИ (+ addition; - substraction; / division;  * multiplication; % modules )
        int x = 10, y = 5;
        //int result = x*y;
        //System.out.println(result);
        //System.out.println(x*y);
        int z = 3;
        //z=z+2;
        //z += 2;
        //System.out.println(z);
        //z++;
        //z--;
        //System.out.println(++z);
        //System.out.println(z);

        // ПРИВЕДЕНИЕ ТИПОВ (type casting)
        short booksNumber = 10;
        double extendedBooksNumber = booksNumber;

        // int value = (int) 20.9;
        // System.out.println(value);


        //НЕПРИМИТИВНЫЕ ПЕРЕМЕННЫЕ (ССЫЛОЧНЫЕ/referanceDataTypes) (ТЕКСТ И МАССИВ)
        String message = "Hello World!";
        String emptyMessage = ""; //пустая строка
        int messageLength = message.length(); //длина строки (метод)
        //System.out.println(messageLength); // покажет сколько символов в строке
        //System.out.println(message.toUpperCase()); // выведет строку заглавными символами
        //System.out.println(message.substring(1)); //выведет строку без первого символа
        //System.out.println(message.substring(0,11)); //можно описать длину с помощью указания номера элемента с 0
        //System.out.println(message.charAt(6)); // вывод конкретного элемента
        //System.out.println(message.equals("Hello World"));// определяет истинность (сравнение строк на true or false)
        //System.out.println(Arrays.toString(message.split(""))); //вывод массива значений


        // ОТЛИЧИЕ ПРИМИТИВНЫХ ПЕРЕМЕННЫХ ОТ НЕПРИМИТИВНЫХ
        // ПРИМИТИВНЫЕ ПЕРЕМЕННЫЕ ХРАНЯТ ЗНАЧЕНИЯ, А НЕПРИМИТИВНЫЕ ХРАНЯТ ССЫЛКИ НА ЗНАЧЕНИЯ

        //Складывание строк (concatenation)
        /* System.out.println("Hello " + "my darling");
        System.out.println("I ".concat("love learning"));*/


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
        // System.out.println(foundIndex2);// вывод отрицательного индекса (-5) ;- значит, что элемента в массиве не существует; 5 если бы элемент существовал ,то он был бы пятым элементом с 4 индексом

        //Получение данных с клавиатуры
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Enter a number ");
        //int myInt = reader.nextInt();
        //System.out.printf("I entered %d%n", myInt); //вывод форматированной строки в виде аргументов %d - число
        //reader.nextLine(); //обзяталелен после вызова nextInt, nextDouble и др чисел (добавляет пустую строку после считывания числа)
        // System.out.println("Enter a string");
        // String myString = reader.nextLine();
        //System.out.printf("I entered %s", myString); //%s -строка

        //ОПЕРАТОРЫ
        //Операторы сравнения (==,>,<,>=,<=,!=,&&,||)
        /*
        System.out.println("10 > 1 = " + (10 > 1));
        System.out.println("4 >= 4 =" + (4 >= 4));
        System.out.println("A != a = " + ('A' != 'a'));
        System.out.println("A == a = " + ('A' == 'a'));
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));
        */


        // Условные операторы
        //IF STATEMENT
       /*
       System.out.println("enter your age ");
        int userAge = reader.nextInt();
        if (userAge <=0) {                                       // если
            System.out.println("Your age is incorrect");
        } else if (userAge >= 18) {                             // иначе если
            System.out.println("you can buy an alcohol");
        } else {                                               // в противном случае (ИНАЧЕ)
            System.out.println("you can't buy an alcohol drink, it's permitted for your age");
        }
        */

        /* ПРИМЕР
        String animal = "cat";
        String enteredAnimal = "";
        do {
            System.out.println("Enter an animal");
            enteredAnimal = reader.nextLine();
            if (animal.equals(enteredAnimal)) {
                System.out.println("YOU'R RIGHT!");
            } else {
                System.out.println("Don't worry, try again");
            }
        } while (!animal.equals(enteredAnimal));*/

        //ТЕРНАРНЫЙ ОПЕРАТОР ? : (упрощенная форма записи if и
        // используется, тогда когда ты хочешь записать значение переменной в зависимости от выполненного условия)
        // Пример
        boolean hasLenght = "".length() > 0 ? true : false;
        String word = "Hello World!".charAt(1) == 'e' ? "Yes" : "No";
        //System.out.println(word);

        /* String word1;
        if ("Hello Word!".charAt(1) == 'e') {
            word1 = "Yes";
        } else {
            word1 = "No";
        }*/
        //System.out.println(word1);


        // ОПЕРАТОР ВЫБОРА switch
      /*  word1 = "Yes";
        switch (word1){   //передаем значение переменной, которую хотим проверить
            case "Yes" :   // указываем конкретное значение
                System.out.println("word1 = Yes");
                break;
            case "No" :
                System.out.println("word1 = No");
                break;
            default:
                System.out.println("word1 = " + word1);
                break;
        }*/


        // ЦИКЛЫ
        //for - выполняет блок кода, который выполняется пока условие прописанное в нем истинно (валидно)
        /*
        for (initialValue; condition; value modification){
        do some task}
         */

        int[] array2 = {2, 3, 5, 6, 8, 5, 6, 7, 7, 8, 8, 9};
        for (int index = array2.length - 1; index >= 0; index--) { // условие вывода значений массива с последнего элемента до 1
            //for (int index = 0; index < array2.length ;index++ ) условие вывода значений массива с 1 элемента до последнего
            //System.out.printf("array[%d]=%d", index, array2[index]);
            //System.out.println();
        }
        // for each loop - цикл
        for (int element : array2) { // цикл идущий по элементам массива : означает В МАССИВЕ
            // System.out.println(element); //вывод элементов массива
        }


        // метод для CalculationDemo
        //System.out.println(CalculationDemo.calculate12(7,3));
        //CalculationDemo.calculate12Version2(7,3);

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

        /* for (int element : numbers_) {
            System.out.println("I want to visit " + element);
        }*/
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
        //
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

       /* Student vlad = new Student("Vlad");
        vlad.age = 25;
        vlad.course = 1;
        vlad.sayHi();
        vlad.introduceYourself();
        System.out.println("I'm " + vlad.age + " years old");*/
    }

}
