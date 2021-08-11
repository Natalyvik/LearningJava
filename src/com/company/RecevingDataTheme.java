package com.company;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecevingDataTheme {
    public static void main(String[] args) {
        // ПОЛУЧЕНИЕ ДАННЫХ С КЛАВИАТУРЫ
        // КЛАСС SCANNER
        // ПРИМЕРЫ МЕТОДОВ

        // next(); - считывает введённую строку до первого пробела
        // nextLine(); - считывает всю введённую строку
        // nextInt(); - считывает введённое число int
        // nextDouble(); - считывает введённое число double

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number ");
        int myInt = reader.nextInt();
        System.out.printf("I entered %d%n", myInt); //вывод форматированной строки в виде аргументов %d - число
        reader.nextLine(); //обзяталелен после вызова nextInt, nextDouble и др чисел (добавляет пустую строку после считывания числа)
        System.out.println("Enter a string");
        String myString = reader.nextLine();
        System.out.printf("I entered %s", myString); //%s -строка

        // КЛАСС BUFFERED_READER
//ПРИМЕРЫ МЕТОДОВ
        // close() // закрыть поток
        // mark(int readAheadLimit) // отметить позицию в потоке
        // markSupported() // поддерживает ли отметку потока
        // int read() // прочитать буфер
        // int read(char[] cbuf, int off, int len) // прочитать буфер
        // String readLine() // следующая строка
        // boolean ready() // может ли поток читать
        // reset() // сбросить поток
        // skip(long n) // пропустить символы

//Считываем данные с консоли и записываем в файл:
        String outputFileName = "file.txt";
        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader1.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}
