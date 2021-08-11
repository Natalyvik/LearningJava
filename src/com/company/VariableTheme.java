package com.company;

public class VariableTheme {
    public static void main(String[] args) {
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

    }
}
